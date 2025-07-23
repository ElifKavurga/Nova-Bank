package forms;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.*;
import models.*;

public class Settings extends javax.swing.JFrame {

    JFrame previousFrame;
    User user;
    DbHelper dbHelper=new DbHelper();
    
    
    public Settings(JFrame previousFrame,String name, String surname) {
        this.previousFrame = previousFrame; // Önceki pencereyi al
        initComponents();
        setVisible(true);
        this.user=dbHelper.getUser(name, surname);
        loadSettings(name, surname); // Kullanıcı ayarlarını yükle
        getContentPane().setBackground(new java.awt.Color(170, 210, 250));
    }
    
    private Settings(){
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        cbDomesticCash = new javax.swing.JCheckBox();
        cbAbroadCash = new javax.swing.JCheckBox();
        cbDomesticCommerce = new javax.swing.JCheckBox();
        cbAbroadCommerce = new javax.swing.JCheckBox();
        cbDomesticShopping = new javax.swing.JCheckBox();
        cbAbroadShopping = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_settings.png"))); // NOI18N
        jLabel2.setText("CARD SETTİNGS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Cash");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("E-Commerce");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Shopping");

        Back.setBackground(new java.awt.Color(160, 160, 250));
        Back.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(160, 160, 250));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        cbDomesticCash.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cbDomesticCash.setText("Domestic");

        cbAbroadCash.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cbAbroadCash.setText("Abroad");

        cbDomesticCommerce.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cbDomesticCommerce.setText("Domestic");

        cbAbroadCommerce.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cbAbroadCommerce.setText("Abroad");

        cbDomesticShopping.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cbDomesticShopping.setText("Domestic");

        cbAbroadShopping.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cbAbroadShopping.setText("Abroad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbAbroadCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbDomesticCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbAbroadCommerce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbDomesticCommerce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbDomesticShopping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbAbroadShopping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDomesticCash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAbroadCash)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDomesticCommerce)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAbroadCommerce)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDomesticShopping)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAbroadShopping)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        dispose();
        new Menu(this,user.getFirstName(),user.getLastName());
    }//GEN-LAST:event_BackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    // Kullanıcının ad ve soyadını al
    String firstName = user.getFirstName();
    String lastName = user.getLastName();

    // Kullanıcının ayarlarını al
    boolean domesticCash = cbDomesticCash.isSelected();
    boolean abroadCash = cbAbroadCash.isSelected();
    boolean domesticCommerce = cbDomesticCommerce.isSelected();
    boolean abroadCommerce = cbAbroadCommerce.isSelected();
    boolean domesticShopping = cbDomesticShopping.isSelected();
    boolean abroadShopping = cbAbroadShopping.isSelected();

    // DbHelper sınıfından nesne oluştur
    DbHelper dbHelper = new DbHelper();

    // Her ayar için ilgili sınıflardan nesneler oluştur
    CashWithdrawal cashWithdrawal = new CashWithdrawal(domesticCash, abroadCash);
    ECommerce ecommerceSettings = new ECommerce(domesticCommerce, abroadCommerce);
    Shopping shoppingSettings = new Shopping(domesticShopping, abroadShopping);

    // Veritabanını güncelle
    boolean cashUpdated = dbHelper.updateCardSettings(firstName, lastName, cashWithdrawal);
    boolean commerceUpdated = dbHelper.updateCardSettings(firstName, lastName, ecommerceSettings);
    boolean shoppingUpdated = dbHelper.updateCardSettings(firstName, lastName, shoppingSettings);

    // Kullanıcıya işlem sonucunu bildir
    if (cashUpdated && commerceUpdated && shoppingUpdated) {
        JOptionPane.showMessageDialog(this, "Settings updated successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to update some settings. Please try again.");
    }

    }//GEN-LAST:event_btnUpdateActionPerformed

    
    private void loadSettings(String firstName, String lastName) {
    // DbHelper sınıfından nesne oluştur
    DbHelper dbHelper = new DbHelper();

    // Cash ayarlarını al
    CashWithdrawal cashWithdrawal = (CashWithdrawal) dbHelper.getCardSettings(firstName, lastName, CashWithdrawal.class);
    if (cashWithdrawal != null) {
        cbDomesticCash.setSelected(cashWithdrawal.isDomesticCashEnabled());
        cbAbroadCash.setSelected(cashWithdrawal.isInternationalCashEnabled());
    }

    // E-Commerce ayarlarını al
    ECommerce ecommerceSettings = (ECommerce) dbHelper.getCardSettings(firstName, lastName, ECommerce.class);
    if (ecommerceSettings != null) {
        cbDomesticCommerce.setSelected(ecommerceSettings.isDomesticCashEnabled());
        cbAbroadCommerce.setSelected(ecommerceSettings.isInternationalCashEnabled());
    }

    // Shopping ayarlarını al
    Shopping shopping = (Shopping) dbHelper.getCardSettings(firstName, lastName, Shopping.class);
    if (shopping != null) {
        cbDomesticShopping.setSelected(shopping.isDomesticCashEnabled());
        cbAbroadShopping.setSelected(shopping.isInternationalCashEnabled());
    }
}

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox cbAbroadCash;
    private javax.swing.JCheckBox cbAbroadCommerce;
    private javax.swing.JCheckBox cbAbroadShopping;
    private javax.swing.JCheckBox cbDomesticCash;
    private javax.swing.JCheckBox cbDomesticCommerce;
    private javax.swing.JCheckBox cbDomesticShopping;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
