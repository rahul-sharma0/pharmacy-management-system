
import dao.ConnectionProvider;
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class addMedicine extends javax.swing.JFrame {
        public String mobilePattern = "^[0-9]*$";
    /**
     * Creates new form addMedicine
     */
    public addMedicine() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
//    public addMedicine()
//    {
//        initComponents();
//        
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtmedID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCompanyNAme = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtMEDname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Medicine");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 795, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_new.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 81, 850, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Price per unit");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 132, -1, -1));

        txtmedID.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(txtmedID, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 170, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Medicine ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 132, 200, -1));

        txtCompanyNAme.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(txtCompanyNAme, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 376, 200, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Company Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 338, 200, -1));

        txtprice.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 170, 100, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 229, 100, -1));

        txtquantity.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtquantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        txtquantity.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(txtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 273, 100, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 449, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Medicine Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 235, 200, -1));

        txtMEDname.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(txtMEDname, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 273, 200, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all_pages_background.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String uniqueID = txtmedID.getText();
        String Medname = txtMEDname.getText();
        String companyName = txtCompanyNAme.getText();
        String PricePerUnit = txtprice.getText();
        int MedQuantity = (int) txtquantity.getValue();
        
//        JOptionPane.showMessageDialog(null, quantity);
        
        if(uniqueID.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Medicine ID is reqruired!","Information",JOptionPane.WARNING_MESSAGE);
        }
        else if(Medname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Medicine name is reqruired!","Information",JOptionPane.WARNING_MESSAGE);
        }
        else if(companyName.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Company name is reqruired!","Information",JOptionPane.WARNING_MESSAGE);
        }
        else if(PricePerUnit.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Price per Unit is reqruired!","Information",JOptionPane.WARNING_MESSAGE);
        }
        else if(!PricePerUnit.matches(mobilePattern))
        {
            JOptionPane.showMessageDialog(null, "Invalid price!","Information",JOptionPane.WARNING_MESSAGE);
        }
        else if(MedQuantity == 0)
        {
            JOptionPane.showMessageDialog(null, "Medicine quantity should not be 0!","Information",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            try {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("INSERT INTO MEDICINE (UNIQUEID, NAME, COMPANY, QUANTITY, PRICE) VALUE(?,?,?,?,?)");
                
                ps.setString(1, uniqueID);
                ps.setString(2, Medname);
                ps.setString(3, companyName);
                ps.setInt(4, MedQuantity);
                ps.setString(5, PricePerUnit);
                ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Medicine added successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                new addMedicine().setVisible(true);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(addMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCompanyNAme;
    private javax.swing.JTextField txtMEDname;
    private javax.swing.JTextField txtmedID;
    private javax.swing.JTextField txtprice;
    private javax.swing.JSpinner txtquantity;
    // End of variables declaration//GEN-END:variables

    private String toString(String toolTipText) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String toString(int MedQuantity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
