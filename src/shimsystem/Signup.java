/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package shimsystem;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
/**
 *
 * @author dell
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        panel1 = new java.awt.Panel();
        LoginLeft = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(153, 153, 153));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        LoginLeft.setPreferredSize(new java.awt.Dimension(393, 400));
        LoginLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jLabel1.setText("Sign up");
        LoginLeft.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        LoginLeft.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 310, -1, -1));
        LoginLeft.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 98, 320, 34));
        LoginLeft.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 338, 320, 32));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel3.setText("Full Name");
        LoginLeft.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 70, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        LoginLeft.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 397, 88, 41));

        jLabel4.setText("I've have an account");
        LoginLeft.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 462, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        LoginLeft.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 456, 88, -1));
        LoginLeft.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 178, 320, 34));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel5.setText("Student Number");
        LoginLeft.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 150, -1, -1));
        LoginLeft.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 258, 320, 34));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel6.setText("Gmail account");
        LoginLeft.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 230, -1, -1));

        getContentPane().add(LoginLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 390, 540));

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("JOIN US ON ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 400, 80));

        jLabel14.setFont(new java.awt.Font("Segoe UI Historic", 1, 48)); // NOI18N
        jLabel14.setText("JOIN US ON ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 400, 90));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Create a account");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("to explore new horizon");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Historic", 1, 48)); // NOI18N
        jLabel11.setText("A NEW JOURNEY");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 430, 90));

        jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("A NEW JOURNEY");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 470, 120));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shimsystem/logind.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

String url = "jdbc:mysql://localhost:3306/testdb";
String user = "root";
String password = "";

// Ensure both queries use correct table and column names
String insertQuery = "INSERT INTO students (FullName, StudentNo, Gmail, Password) VALUES (?, ?, ?, ?)";

String checkQuery = "SELECT COUNT(*) FROM students WHERE StudentNo = ? OR Gmail = ?";

try (Connection conn = DriverManager.getConnection(url, user, password)) {
    System.out.println("Connected to the database!");

    // Check if user exists
    PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
    checkStmt.setString(1, idField.getText().trim());
    checkStmt.setString(2, emailField.getText().trim());
    ResultSet checkResult = checkStmt.executeQuery();
    checkResult.next();

    if (checkResult.getInt(1) > 0) {
        JOptionPane.showMessageDialog(null, "User or Gmail already registered!", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // Insert new user
        PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
        insertStmt.setString(1, nameField.getText().trim());
        insertStmt.setString(2, idField.getText().trim());
        insertStmt.setString(3, emailField.getText().trim());
        insertStmt.setString(4, new String(passField.getPassword()).trim());

        int rowsInserted = insertStmt.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null, "Successfully Registered", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            this.dispose();
            new NewLogin().setVisible(true);
        }
    }

} catch (SQLException e) {
    
    JOptionPane.showMessageDialog(null, "Please Fill up all Requirments: " + e.getMessage(), "Register Failed", JOptionPane.ERROR_MESSAGE);
}


    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        new NewLogin().setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel LoginLeft;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private java.awt.Panel panel1;
    private javax.swing.JPasswordField passField;
    // End of variables declaration//GEN-END:variables
}
