package forms;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.DbHelper;
import models.User;

public class Action extends javax.swing.JFrame {

    JFrame previousFrame;
    User user;
    DbHelper dbHelper=new DbHelper();
    
    
    public Action(JFrame previousFrame,String name, String surname) {
        this.previousFrame = previousFrame; // Önceki pencereyi al
        initComponents();
        setVisible(true);
        this.user=dbHelper.getUser(name, surname);
        getContentPane().setBackground(new java.awt.Color(170, 210, 250));
    }
    
    private Action(){
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbBuy = new javax.swing.JComboBox<>();
        cmbSell = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtBuy = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnAction = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_profession.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Currency Exchange");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("BUY");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("SELL");

        cmbBuy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbBuy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar", "Euro", "Tl" }));

        cmbSell.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbSell.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tl", "Dolar", "Euro" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Amound");

        txtBuy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnBack.setBackground(new java.awt.Color(160, 160, 250));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAction.setBackground(new java.awt.Color(160, 160, 250));
        btnAction.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnAction.setText("ACTİON");
        btnAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cmbBuy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(32, 32, 32)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbSell, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(56, 56, 56))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtBuy)
                                    .addGap(77, 77, 77))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnAction, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAction, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        new Menu(this,user.getFirstName(),user.getLastName());
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionActionPerformed
        
        String buyCurrency = cmbBuy.getSelectedItem().toString();
        String sellCurrency = cmbSell.getSelectedItem().toString();
        float buyAmount = Float.parseFloat(txtBuy.getText());
        float dolar,tl,euro;
        
        if(buyCurrency.equals("Dolar")){
            if(sellCurrency.equals("Tl")){
                dolar=buyAmount;
                tl=buyAmount*35;
                dbHelper.updateBalance(user.getFirstName(), user.getLastName(), -tl, dolar, 0, 0);
                JOptionPane.showMessageDialog(this, "Action performed successfully!", "Action", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(sellCurrency.equals("Euro")){
                dolar=buyAmount;
                euro=buyAmount*0.95f;
                dbHelper.updateBalance(user.getFirstName(), user.getLastName(), 0, dolar, -euro, 0);
                JOptionPane.showMessageDialog(this, "Action performed successfully!", "Action", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this, "choices shouldn't be the same", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(buyCurrency.equals("Euro")){
            if(sellCurrency.equals("Tl")){
                euro=buyAmount;
                tl=buyAmount*37;
                dbHelper.updateBalance(user.getFirstName(), user.getLastName(), -tl, 0, euro, 0);
                JOptionPane.showMessageDialog(this, "Action performed successfully!", "Action", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(sellCurrency.equals("Dolar")){
                euro=buyAmount;
                dolar=buyAmount*1.05f;
                dbHelper.updateBalance(user.getFirstName(), user.getLastName(), 0, -dolar, euro, 0);
                JOptionPane.showMessageDialog(this, "Action performed successfully!", "Action", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this, "choices shouldn't be the same", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(buyCurrency.equals("Tl")){
            if(sellCurrency.equals("Dolar")){
                tl=buyAmount;
                dolar=buyAmount*0.029f;
                dbHelper.updateBalance(user.getFirstName(), user.getLastName(), tl, -dolar, 0, 0);
                JOptionPane.showMessageDialog(this, "Action performed successfully!", "Action", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(sellCurrency.equals("Euro")){
                tl=buyAmount;
                euro=buyAmount*0.027f;
                dbHelper.updateBalance(user.getFirstName(), user.getLastName(), tl, 0, -euro, 0);
                JOptionPane.showMessageDialog(this, "Action performed successfully!", "Action", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this, "choices shouldn't be the same", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    }//GEN-LAST:event_btnActionActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Action.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Action.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Action.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Action.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Action().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAction;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbBuy;
    private javax.swing.JComboBox<String> cmbSell;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtBuy;
    // End of variables declaration//GEN-END:variables
}
