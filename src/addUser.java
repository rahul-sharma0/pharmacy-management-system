/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import dao.ConnectionProvider;
        import java.sql.Connection;
        import java.sql.PreparedStatement;
        import java.sql.ResultSet;
        import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Date;
/**
 *
 * @author Acer
 */
public class addUser extends javax.swing.JFrame {
        public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
        public String contactPattern= "^[0-9]*$";
        public int checkUsername = 0;
        
    /**
     * Creates new form addUser
     */
    public addUser() {
        initComponents();
        icon_label.setVisible(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comborole = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdob = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        icon_label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 715, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Role");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 119, 229, -1));

        comborole.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        comborole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "ADMIN", "PHARMACIST" }));
        getContentPane().add(comborole, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 155, 264, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 207, 229, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 243, 263, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Date Of Birth");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 296, 263, -1));
        getContentPane().add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 334, 263, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Contact Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 385, 264, -1));

        txtphone.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 422, 264, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("Email-Id");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 119, 263, -1));

        txtemail.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 155, 263, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setText("Username");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 207, 263, -1));

        txtusername.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtusernameKeyReleased(evt);
            }
        });
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 243, 263, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setText("Password");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 296, 263, -1));

        txtpassword.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 332, 263, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("Address");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 385, 263, -1));

        txtaddress.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 422, 263, -1));

        icon_label.setText("jLabel10");
        getContentPane().add(icon_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 247, 57, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Downloads\\images\\Pharmacy Management System Images & Pattern\\save.png")); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_new.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 35, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 850, 10));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all_pages_background.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernameKeyReleased
        // TODO add your handling code here:
        String username = txtusername.getText();
        if(!username.equals(""))
        {
            icon_label.setVisible(true);
            icon_label.setIcon(new ImageIcon("src\\images\\yes.png"));
            icon_label.setText(null);
            checkUsername = 0;
            
            try{
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from appuser where username='"+username+"'");
                
                while(rs.next())
                {
                    checkUsername = 1;
                    icon_label.setIcon(new ImageIcon("src\\images\\no.png"));
                    icon_label.setText(null);
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else{
            icon_label.setVisible(false);
        }
            
    }//GEN-LAST:event_txtusernameKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String userrole = (String) comborole.getSelectedItem();
        String name = txtname.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM--dd");
        Date date = txtdob.getDate();
        String dob = "";
        if(date != null)
        {
            dob = dFormat.format(txtdob.getDate());
            
        }
        String contactNo = txtphone.getText();
        String email = txtemail.getText();
        String username = txtusername.getText();
        String password = txtpassword.getText();
        String address = txtaddress.getText();
        
        if(name.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Name is required");
        }
        else if(dob.equals(""))
        {
                        JOptionPane.showMessageDialog(null, "Date Of Birth is required");
        }
        else if (contactNo.equals(""))
        {
                        JOptionPane.showMessageDialog(null, "Contact number is required");
        }
        else if(!contactNo.matches(contactPattern) || (contactNo.length() != 10)) 
        {
                        JOptionPane.showMessageDialog(null, "Invalid contact number");
        }
        else if(email.equals(""))
        {
                        JOptionPane.showMessageDialog(null, "Email-id is required");
        }
        else if(!email.matches(emailPattern))
        {
                        JOptionPane.showMessageDialog(null, "Invalid email-id");
        }
        else if (username.equals(""))
        {
                        JOptionPane.showMessageDialog(null, "Username is required");
        }
        else if(checkUsername == 1)
        {
                        JOptionPane.showMessageDialog(null, "Username already exists");
        }
        else if(password.equals(""))
        {
                        JOptionPane.showMessageDialog(null, "Password is required");
        }
        else if(address.equals(""))
        {
                        JOptionPane.showMessageDialog(null, "Address is required");
        }
        
        else
        {
            try
            {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("insert into appuser (ROLE,NAME,DOB,CONTACTNO,EMAIL,USERNAME,PASSWORD,ADDRESS) value(?,?,?,?,?,?,?,?)");
                ps.setString(1, userrole);
                ps.setString(2, name);
                ps.setString(3, dob);
                ps.setString(4, contactNo);
                ps.setString(5, email);
                ps.setString(6, username);
                ps.setString(7, password);
                ps.setString(8, address);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "User added successfully");
                setVisible(false);
                new adminDashboard().setVisible(true);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comborole;
    private javax.swing.JLabel icon_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtaddress;
    private com.toedter.calendar.JDateChooser txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
