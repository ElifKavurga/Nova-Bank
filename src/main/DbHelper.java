package main;

import models.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class DbHelper {
    private String userName = "root"; // MySQL kullanıcı adı
    private String password = "29041983E"; // MySQL şifresi
    private String url = "jdbc:mysql://localhost:3306/novabank"; // Veritabanı URL'si
    
    public User user;

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, userName, password);
    }

    public void showErrorMessage(SQLException exception) {
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error Code: " + exception.getErrorCode());
    }

    public void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed successfully.");
            }
        } catch (SQLException e) {
            showErrorMessage(e);
        }
    }

    // Kullanıcıyı veritabanına kaydetmek için metod
    public void saveStudentUserToDatabase(StudentUser user) {
        String query = "INSERT INTO users (name, surname, user_type, password) VALUES (?, ?, ?, ?)";
        try (Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getUserType());
            statement.setString(4, new String(user.getPassword()));            
            statement.executeUpdate();
            System.out.println("User added to the database.");
        } catch (SQLException e) {
            showErrorMessage(e);
        }
    }
    
    public void saveEmployerUserToDatabase(EmployerUser user) {
        String query = "INSERT INTO users (name, surname, user_type, password) VALUES (?, ?, ?, ?)";
        try (Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getUserType());
            statement.setString(4, new String(user.getPassword()));            
            statement.executeUpdate();
            System.out.println("User added to the database.");
        } catch (SQLException e) {
            showErrorMessage(e);
        }
    }
    
    public void saveRegularUserToDatabase(RegularUser user) {
        String query = "INSERT INTO users (name, surname, user_type, password) VALUES (?, ?, ?, ?)";
        try (Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(4, new String(user.getPassword()));            
            statement.executeUpdate();
            System.out.println("User added to the database.");
        } catch (SQLException e) {
            showErrorMessage(e);
        }
    }
    
    public User getUser(String name, String surname) {
    Connection connection = null;

    try {
        User user = null;

        // Veritabanı bağlantısını alıyoruz
        connection = getConnection();  // getConnection() metodunu kullanarak bağlantıyı al

        // Sorguyu doğru şekilde yazıyoruz
        String query = "SELECT name, surname, password, user_type, tl_balance, dollar_balance, euro_balance, gold_balance FROM users WHERE name = ? AND surname = ?";
        PreparedStatement statement = connection.prepareStatement(query);

        // Parametreleri sorguya ekliyoruz
        statement.setString(1, name);  // Ad parametresini sorguya ekle
        statement.setString(2, surname);  // Soyad parametresini sorguya ekle

        // Sonuçları alıyoruz
        ResultSet resultSet = statement.executeQuery();

        // Sonuçlar üzerinde iterasyon yapıyoruz
        while (resultSet.next()) {
            String password = resultSet.getString("password");
            String userType = resultSet.getString("user_type");
            float tlBalance= resultSet.getFloat("tl_balance");
            float dollarBalance= resultSet.getFloat("dollar_balance");
            float euroBalance= resultSet.getFloat("euro_balance");
            float goldBalance=resultSet.getFloat("gold_balance");
            // Kullanıcı türüne göre alt sınıfı oluşturuyoruz
            if (userType.equals("Regular")) {
                user = new RegularUser(name, surname, password.toCharArray(),tlBalance,dollarBalance,euroBalance,goldBalance);
            } else if (userType.equals("Student")) {
                user = new StudentUser(name, surname, password.toCharArray(),tlBalance,dollarBalance,euroBalance,goldBalance);
            } else if (userType.equals("Employer")) {
                user = new EmployerUser(name, surname, password.toCharArray(),tlBalance,dollarBalance,euroBalance,goldBalance);
            }
                this.user=user;


        }

    } catch (SQLException e) {
        e.printStackTrace();  // Hata çıktısı alıyoruz
    } finally {
        // Veritabanı bağlantısını kapatmayı unutmayın
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return user;
}
    
    
    public void updateBalance(String name, String surname, float tl, float dollar, float euro, float gold) {
    Connection connection = null;

    try {
        // Veritabanı bağlantısını alıyoruz
        connection = getConnection();

        // SQL UPDATE sorgusu
        String query = "UPDATE users SET tl_balance = tl_balance + ?, dollar_balance = dollar_balance + ?, " +
                       "euro_balance = euro_balance + ?, gold_balance = gold_balance + ? " +
                       "WHERE name = ? AND surname = ?";

        PreparedStatement statement = connection.prepareStatement(query);

        // Parametreleri sorguya ekliyoruz
        statement.setFloat(1, tl);
        statement.setFloat(2, dollar);
        statement.setFloat(3, euro);
        statement.setFloat(4, gold);
        statement.setString(5, name);
        statement.setString(6, surname);

        int rowsUpdated = statement.executeUpdate();

        if (rowsUpdated > 0) {
            System.out.println("Database update successful.");
        } else {
            System.out.println("User not found or update failed.");
        }

        // Sınıfları çağır ve konsola çıktı ver
        TL tlAccount = new TL(0);
        Dollar dollarAccount = new Dollar(0);
        Euro euroAccount = new Euro(0);
        Gold goldAccount = new Gold(0);

        // TL işlemi
        tlAccount.deposit(tl);
        System.out.println("The TL class was called.");

        // Dolar işlemi
        dollarAccount.deposit(dollar);
        System.out.println("Dollar class was called.");

        // Euro işlemi
        euroAccount.deposit(euro);
        System.out.println("The Euro class was called.");

        // Altın işlemi
        goldAccount.deposit(gold);
        System.out.println("Gold class has been called.");

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Veritabanı bağlantısını kapatıyoruz
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    
    

    public CartSettings getCardSettings(String firstName, String lastName, Class<? extends CartSettings> settingType) {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    try {
        connection = getConnection();

        // Sorguyu settingType'a göre oluştur
        String query = null;
        if (settingType == CashWithdrawal.class) {
            query = "SELECT cash_domestic, cash_abroad FROM users WHERE name = ? AND surname = ?";
        } else if (settingType == ECommerce.class) {
            query = "SELECT commerce_domestic, commerce_abroad FROM users WHERE name = ? AND surname = ?";
        } else if (settingType == Shopping.class) {
            query = "SELECT shopping_domestic, shopping_abroad FROM users WHERE name = ? AND surname = ?";
        }

        if (query == null) {
            throw new IllegalArgumentException("Unsupported setting type: " + settingType.getName());
        }

        statement = connection.prepareStatement(query);
        statement.setString(1, firstName);
        statement.setString(2, lastName);
        resultSet = statement.executeQuery();

        if (resultSet.next()) {
            if (settingType == CashWithdrawal.class) {
                return new CashWithdrawal(
                    resultSet.getBoolean("cash_domestic"),
                    resultSet.getBoolean("cash_abroad")
                );
            } else if (settingType == ECommerce.class) {
                return new ECommerce(
                    resultSet.getBoolean("commerce_domestic"),
                    resultSet.getBoolean("commerce_abroad")
                );
            } else if (settingType == Shopping.class) {
                return new Shopping(
                    resultSet.getBoolean("shopping_domestic"),
                    resultSet.getBoolean("shopping_abroad")
                );
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return null;
}





    public boolean updateCardSettings(String firstName, String lastName, CartSettings settings) {
    Connection connection = null;
    PreparedStatement statement = null;

    try {
        connection = getConnection();

        String query = null;
        if (settings instanceof CashWithdrawal) {
            query = "UPDATE users SET cash_domestic = ?, cash_abroad = ? WHERE name = ? AND surname = ?";
        } else if (settings instanceof ECommerce) {
            query = "UPDATE users SET commerce_domestic = ?, commerce_abroad = ? WHERE name = ? AND surname = ?";
        } else if (settings instanceof Shopping) {
            query = "UPDATE users SET shopping_domestic = ?, shopping_abroad = ? WHERE name = ? AND surname = ?";
        }

        if (query == null) {
            throw new IllegalArgumentException("Unsupported settings type: " + settings.getClass().getName());
        }

        statement = connection.prepareStatement(query);

        if (settings instanceof CashWithdrawal) {
            CashWithdrawal cash = (CashWithdrawal) settings;
            statement.setBoolean(1, cash.isDomesticCashEnabled());
            statement.setBoolean(2, cash.isInternationalCashEnabled());
        } else if (settings instanceof ECommerce) {
            ECommerce ecommerce = (ECommerce) settings;
            statement.setBoolean(1, ecommerce.isDomesticCashEnabled());
            statement.setBoolean(2, ecommerce.isInternationalCashEnabled());
        } else if (settings instanceof Shopping) {
            Shopping shopping = (Shopping) settings;
            statement.setBoolean(1, shopping.isDomesticCashEnabled());
            statement.setBoolean(2, shopping.isInternationalCashEnabled());
        }

        statement.setString(3, firstName);
        statement.setString(4, lastName);

        int rowsUpdated = statement.executeUpdate();
        return rowsUpdated > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    } finally {
        try {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



    
}