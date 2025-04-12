
import Common.openPdf;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import dao.ConnectionProvider;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.table.TableModel;
import  java.util.Date;
import  java.util.Calendar;
import dao.PHARMACY_UTILS;
import com.itextpdf.text.pdf.PdfPTable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class sellMedicine extends javax.swing.JFrame {

    public String numberPattern = "^[0-9]*$";
    private int finalTprice = 0;
    private String billID = "";
    private String username = "";

    /**
     * Creates new form sellMedicine
     */
    public sellMedicine() {
        initComponents();
    }

    public sellMedicine(String tempusername) {
        initComponents();
        username = tempusername;
        setLocationRelativeTo(null);
    }

    private void medicineName(String nameORuniqueid) {
        DefaultTableModel dtModel = (DefaultTableModel) medicineTable.getModel();
        dtModel.setRowCount(0);

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM MEDICINE WHERE NAME LIKE '%" + nameORuniqueid + "%' OR UNIQUEID LIKE '%" + nameORuniqueid + "%'");

            while (rs.next()) {
                dtModel.addRow(new Object[]{rs.getString("UNIQUEID") + "- " + rs.getString("NAME")});

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void clearMEDfields() {
        txtcompany.setText(null);
        txtfinalprice.setText(null);
        txtid.setText(null);
        txtname.setText(null);
        txtprice.setText(null);
        txtquantity.setValue(0);

    }

    public String getUniqueID(String Prefix) {
        return Prefix + System.nanoTime();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicineTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcompany = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtfinalprice = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        btncart = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        label_price = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtquantity = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_new.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sell Medicine");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 948, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 60, 930, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 252, -1));

        medicineTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        medicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicines"
            }
        ));
        medicineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicineTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medicineTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 212, 252, -1));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 159, 252, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Medicine ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 120, 92, -1));

        txtid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 159, 220, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 250, 220, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Medicine Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 212, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price Per Unit");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 120, 101, -1));

        txtprice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 159, 220, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("No. of Units");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 212, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Medicine Company");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 311, -1, -1));

        txtcompany.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtcompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 350, 220, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Price");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 311, -1, -1));

        txtfinalprice.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(txtfinalprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 349, 220, -1));

        cartTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine ID", "Name", "Company", "Price per unit", "Quantity", "Total"
            }
        ));
        cartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(cartTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 469, 636, 211));

        btncart.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btncart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add to cart.png"))); // NOI18N
        btncart.setText("Add to Cart");
        btncart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncartActionPerformed(evt);
            }
        });
        getContentPane().add(btncart, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 403, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Billing Amount:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 710, 180, -1));

        label_price.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_price.setForeground(new java.awt.Color(255, 255, 255));
        label_price.setText("0.0");
        getContentPane().add(label_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 710, 190, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generate bill & print.png"))); // NOI18N
        jButton2.setText("Purchase & Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 720, -1, -1));

        txtquantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        txtquantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtquantityStateChanged(evt);
            }
        });
        txtquantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtquantityMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtquantityMousePressed(evt);
            }
        });
        txtquantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtquantityKeyReleased(evt);
            }
        });
        getContentPane().add(txtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 250, 220, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("₹");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 710, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminDashboardBackground.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        medicineName("");
        txtcompany.setEditable(false);
        txtid.setEditable(false);
        txtname.setEditable(false);
        txtprice.setEditable(false);
        txtfinalprice.setEditable(false);
        
    }//GEN-LAST:event_formComponentShown

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String Search = txtSearch.getText();
        medicineName(Search);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void medicineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineTableMouseClicked
        // TODO add your handling code here:
        clearMEDfields();
        int index = medicineTable.getSelectedRow();
        TableModel model = medicineTable.getModel();
        String nameORuniqueID = model.getValueAt(index, 0).toString();

        String uniqueID[] = nameORuniqueID.split("-", 0);
//        String ID = uniqueID[0];
        
//        JOptionPane.showMessageDialog(null, uniqueID[0]);

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM MEDICINE WHERE UNIQUEID='"+uniqueID[0]+"'");

            while (rs.next()) {
                txtid.setText(uniqueID[0]);
                txtname.setText(rs.getString("NAME"));
                txtcompany.setText(rs.getString("COMPANY"));
                txtprice.setText(rs.getString("PRICE"));
                txtquantity.setValue(0);
                txtfinalprice.setText("");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_medicineTableMouseClicked

    private void txtquantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtquantityKeyReleased
        // TODO add your handling code here:      
    }//GEN-LAST:event_txtquantityKeyReleased

    private void txtquantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtquantityMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquantityMouseClicked

    private void txtquantityMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtquantityMousePressed
        // TODO add your handling code here:        
    }//GEN-LAST:event_txtquantityMousePressed

    private void txtquantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtquantityStateChanged
        // TODO add your handling code here:
         int price = Integer.parseInt(txtprice.getText());
        int qty =(int) txtquantity.getValue();
        
        
            if(qty >=1 )
            {
                
            int product = price * (qty);
            txtfinalprice.setText(String.valueOf(product));
            }
        else{
                JOptionPane.showMessageDialog(null, "Quantity must atleast 1 or more","Information",JOptionPane.INFORMATION_MESSAGE);
            
            txtfinalprice.setText(null);
        }
    }//GEN-LAST:event_txtquantityStateChanged

    private void btncartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncartActionPerformed
        // TODO add your handling code here:
        String id = txtid.getText();
        int qty =(int) txtquantity.getValue();
        
        if ((!id.equals("") && (qty >= 1))) {
            String name = txtname.getText();
            String company = txtcompany.getText();
            String price = txtprice.getText();
            String total = txtfinalprice.getText();
            int checkStock =0;
            int stock_already_exists = 0;
            
            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM MEDICINE WHERE UNIQUEID='"+id+"'");
                while(rs.next())
                {
                    if(Integer.parseInt(rs.getString("QUANTITY")) >= (qty))
                    {
                        checkStock=1;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Only "+rs.getString("QUANTITY")+" are left!","Medicine is out of stock!",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            if(checkStock == 1)
            {
                DefaultTableModel dtModel = (DefaultTableModel) cartTable.getModel();
                if(cartTable.getRowCount()!=0)
                {
                    for(int i =0 ; i<cartTable.getRowCount();i++)
                    {
                        if(dtModel.getValueAt(i, 0) .equals(id))
                        {
                            stock_already_exists = 1;
                            JOptionPane.showMessageDialog(null, "Medicne already exist in cart!",null,JOptionPane.INFORMATION_MESSAGE);
                            
                        }
                    }
                }
                
                if(stock_already_exists == 0)
                {
                    dtModel.addRow(new Object[]{id,name,company,price,qty,total});
                    finalTprice += Integer.parseInt(total);
                    label_price.setText(String.valueOf(finalTprice));
                    JOptionPane.showMessageDialog(null, "Medicine added to successfully.");
                    
                }
                clearMEDfields();
            }
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Quantity is required!",null,JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btncartActionPerformed

    private void cartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTableMouseClicked
        // TODO add your handling code here:
        int index = cartTable.getSelectedRow();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to delete this medicine?","Select",JOptionPane.YES_NO_OPTION);
        
        if(a ==0)
        {
            TableModel tModel = cartTable.getModel();
            String Total = tModel.getValueAt(index, 5).toString();
            finalTprice-= Integer.parseInt(Total);
            label_price.setText(String.valueOf(finalTprice));
            ((DefaultTableModel) cartTable.getModel()) .removeRow(index);
        }
    }//GEN-LAST:event_cartTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(finalTprice !=0)
        {
            billID = getUniqueID("Bill-");
            
            DefaultTableModel dtModel = (DefaultTableModel) cartTable.getModel();
            if(cartTable.getRowCount() !=0)
            {
                for(int i =0;i<cartTable.getRowCount();i++)
                {
                    try {
                        Connection con = ConnectionProvider.getCon();
                        Statement st =con.createStatement();
                        st.executeUpdate("UPDATE MEDICINE SET QUANTITY = QUANTITY-"+Integer.parseInt(dtModel.getValueAt(i, 4).toString())+" where UNIQUEID='"+dtModel.getValueAt(i, 0).toString()+"'");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
            
            try {
                SimpleDateFormat myDFormat = new SimpleDateFormat("yyyy-MM-dd");
                Calendar cal =Calendar.getInstance();
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps =con.prepareStatement("INSERT INTO BILL (BILLID,BILLDATE,AMOUNTPAID,GENERATEDBY) VALUES(?,?,?,?)");
                
                ps.setString(1, billID);
                ps.setString(2, myDFormat.format(cal.getTime()));
                ps.setInt(3, finalTprice);
                ps.setString(4, username);
                ps.executeUpdate();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
            try {
                PdfWriter.getInstance(doc, new FileOutputStream(PHARMACY_UTILS.BillPath+""+billID+".pdf"));
                doc.open();
                Paragraph pharmacyName = new Paragraph("                                                    Pharmacy Management System\n");
                doc.add(pharmacyName);
                Paragraph starLine = new Paragraph("****************************************************************************************************************");
                doc.add(starLine);
                Paragraph details = new Paragraph("\tBill ID: "+billID+"\nDate: "+new Date()+"\nAmount Paid: "+finalTprice);
                doc.add(details);
                doc.add(starLine);
                
                PdfPTable tblPdfPTable = new PdfPTable(6);
                tblPdfPTable.addCell("Medicine ID");
                tblPdfPTable.addCell("Name");
                tblPdfPTable.addCell("Company Name");
                tblPdfPTable.addCell("Price Per Unit");
                tblPdfPTable.addCell("Quantity");
                tblPdfPTable.addCell("Total Amount");
                for (int i=0;i<cartTable.getRowCount();i++)
                {
                    String a = cartTable.getValueAt(i, 0).toString();
                    String b = cartTable.getValueAt(i, 1).toString();
                    String c = cartTable.getValueAt(i, 2).toString();
                    String d = cartTable.getValueAt(i, 3).toString();
                    String e = cartTable.getValueAt(i, 4).toString();
                    String f = cartTable.getValueAt(i, 5).toString();
                    
                    tblPdfPTable.addCell(a);
                    tblPdfPTable.addCell(b);
                    tblPdfPTable.addCell(c);
                    tblPdfPTable.addCell(d);
                    tblPdfPTable.addCell(e);
                    tblPdfPTable.addCell(f);
                }
                
                doc.add(tblPdfPTable);
                doc.add(starLine);
                Paragraph thankMSG = new Paragraph("                                                    Thank you, Please Visit Again.");
                doc.add(thankMSG);
                //OPEN PDF 
                 
               JOptionPane.showMessageDialog(null, "Bill generated successfully","Sucess",JOptionPane.PLAIN_MESSAGE); 
               
               openPdf.openBYid(String.valueOf(billID));
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            doc.close();
            setVisible(false);
            new sellMedicine(username).setVisible(true);
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Please add medicine to cart","Warning",JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(sellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sellMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncart;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_price;
    private javax.swing.JTable medicineTable;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtcompany;
    private javax.swing.JTextField txtfinalprice;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JSpinner txtquantity;
    // End of variables declaration//GEN-END:variables
}
