package models;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<User> users;
    private static Bank instance;

    private Bank(String bankName) {
        this.bankName = bankName;
        this.users = new ArrayList<>();
    }

    public static Bank getInstance(String bankName) {
        if (instance == null) {
            instance = new Bank(bankName);
        }
        return instance;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null; // Giriş başarısız
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
