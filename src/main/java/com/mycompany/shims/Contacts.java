/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.shims;

/**
 *
 * @author dell
 */
public class Contacts extends javax.swing.JFrame {

    /**
     * Creates new form Contacts
     */
    public Contacts() {
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

        CCSTlogo = new javax.swing.JLabel();
        CCSTname = new javax.swing.JLabel();
        LoginButton = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ProjectName = new javax.swing.JLabel();
        Schoolportal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BGLZ = new javax.swing.JLabel();
        BGG = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(CCSTlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        CCSTname.setFont(new java.awt.Font("Serif", 1, 45)); // NOI18N
        CCSTname.setForeground(new java.awt.Color(255, 255, 255));
        CCSTname.setText("Clark College of Science and Technology");
        getContentPane().add(CCSTname, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, -1, -1));

        LoginButton.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/shims/login.png"))); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/shims/home.png"))); // NOI18N
        jLabel7.setText("SHIMS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        ProjectName.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        ProjectName.setForeground(new java.awt.Color(255, 255, 255));
        ProjectName.setText("School Horizon Information Management System");
        getContentPane().add(ProjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        Schoolportal.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Schoolportal.setForeground(new java.awt.Color(255, 255, 255));
        Schoolportal.setText("SCHOOL PORTAL");
        getContentPane().add(Schoolportal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Mobile Contact : 0968 565 1422");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Address : SNS Building Aurea St. Samsonville Subd., 2010  ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/shims/image-removebg-preview (1)_1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        BGLZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/shims/Plain Lapiz Lazuli.jpg"))); // NOI18N
        getContentPane().add(BGLZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1920, 170));

        BGG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/shims/Plain Grey.jpg"))); // NOI18N
        getContentPane().add(BGG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 50));

        BG.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\OneDrive\\Documents\\Apache Pictures\\Plain White.jpg")); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked

        new Login().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Contacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contacts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel BGG;
    private javax.swing.JLabel BGLZ;
    private javax.swing.JLabel CCSTlogo;
    private javax.swing.JLabel CCSTname;
    private javax.swing.JLabel LoginButton;
    private javax.swing.JLabel ProjectName;
    private javax.swing.JLabel Schoolportal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
