/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package shimsystem;


/**
 *
 * @author dell
 */
public class teacher extends javax.swing.JFrame {

    /**
     * Creates new form teacher
     */
    public teacher() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        gradec = new java.awt.Panel();
        actmax4 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        pper = new javax.swing.JTextField();
        actmax1 = new javax.swing.JTextField();
        actscore2 = new javax.swing.JTextField();
        actmax2 = new javax.swing.JTextField();
        actscore3 = new javax.swing.JTextField();
        actmax3 = new javax.swing.JTextField();
        actscore4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        examscore = new javax.swing.JTextField();
        exammax = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        perscore1 = new javax.swing.JTextField();
        permax1 = new javax.swing.JTextField();
        perscore2 = new javax.swing.JTextField();
        permax2 = new javax.swing.JTextField();
        perscore3 = new javax.swing.JTextField();
        permax3 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        actscore1 = new javax.swing.JTextField();
        actp = new javax.swing.JTextField();
        pexam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SHIMS | TEACHER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -3, -1, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/home.png"))); // NOI18N
        jLabel9.setText("SHIMS");
        jLabel9.setToolTipText("");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 0, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Plain Lapiz Lazuli.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 50));

        jButton3.setText("Schedule");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 250, 60));

        jButton2.setText("Lessons");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 250, 60));

        jButton1.setText("Class Management");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 250, 60));

        jButton4.setText("Grade Computer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 250, 60));

        jButton5.setText("Students Profile");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 250, 60));

        gradec.setVisible(false);
        gradec.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gradec.add(actmax4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 50, 30));

        jButton6.setText("Calculate");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        gradec.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Activity");
        gradec.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 190, 30));

        pper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pperActionPerformed(evt);
            }
        });
        gradec.add(pper, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 50, 30));
        gradec.add(actmax1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 50, 30));
        gradec.add(actscore2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 50, 30));
        gradec.add(actmax2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 50, 30));

        actscore3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actscore3ActionPerformed(evt);
            }
        });
        gradec.add(actscore3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 50, 30));
        gradec.add(actmax3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 50, 30));
        gradec.add(actscore4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 50, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Exam");
        gradec.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 190, 30));
        gradec.add(examscore, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 50, 30));
        gradec.add(exammax, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 50, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Performance Task");
        gradec.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 190, 30));
        gradec.add(perscore1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 50, 30));
        gradec.add(permax1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 50, 30));
        gradec.add(perscore2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 50, 30));
        gradec.add(permax2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 50, 30));
        gradec.add(perscore3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 50, 30));
        gradec.add(permax3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 50, 30));
        gradec.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 130, 30));
        gradec.add(actscore1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 50, 30));
        gradec.add(actp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 50, 30));
        gradec.add(pexam, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 50, 30));

        jLabel2.setText("Performance Task Percentage");
        gradec.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setText("Activity Percentage");
        gradec.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel5.setText("Exam Percentage");
        gradec.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel10.setText("Score");
        gradec.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, -1));

        jLabel11.setText("Score");
        gradec.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel12.setText("Score");
        gradec.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        jLabel13.setText("Score");
        gradec.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        jLabel14.setText("Score");
        gradec.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        jLabel15.setText("Score");
        gradec.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        jLabel16.setText("Score");
        gradec.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        jLabel17.setText("Score");
        gradec.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        jLabel18.setText("max");
        gradec.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, -1, -1));

        jLabel19.setText("max");
        gradec.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel20.setText("max");
        gradec.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        jLabel21.setText("max");
        gradec.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        jLabel22.setText("max");
        gradec.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, -1));

        jLabel23.setText("max");
        gradec.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        jLabel24.setText("max");
        gradec.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, -1));

        jLabel25.setText("max");
        gradec.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        getContentPane().add(gradec, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 1650, 1040));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Plain White.jpg"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        new HomePage().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
gradec.setVisible(true);













































        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        float totalact = 0, totalexam=0, totalperf=0;
        float finalper;
        
        
        int a = Integer.parseInt(actp.getText());
        int b = Integer.parseInt(pexam.getText());     
       int c = Integer.parseInt(pper.getText());
       
       float actsco1 = Integer.parseInt(actscore1.getText());
       float actsco2 = Integer.parseInt(actscore2.getText());   
       float actsco3 = Integer.parseInt(actscore3.getText());
        float actsco4 = Integer.parseInt(actscore4.getText());
    
        float acmax1 = Integer.parseInt(actmax1.getText());
        float acmax2 = Integer.parseInt(actmax2.getText());
        float acmax3 = Integer.parseInt(actmax3.getText());
        float acmax4 = Integer.parseInt(actmax4.getText());
        
        float totalactscore = actsco1+actsco2+actsco3+actsco4;
        float totalmaxscore = acmax1+acmax2+acmax3+acmax4;
        
        float activityperce = (totalactscore/totalmaxscore)*100;
        totalact = activityperce;
        
        float exmscore = Integer.parseInt(examscore.getText());
        float exmmax = Integer.parseInt(exammax.getText());    
        float examperce = (exmscore/exmmax)*100;
        totalexam = examperce;
        
            float per1 = Integer.parseInt(perscore1.getText());
        float per2 = Integer.parseInt(perscore2.getText());
        float per3 = Integer.parseInt(perscore3.getText());
      
     float pemax1 = Integer.parseInt(permax1.getText());
        float pemax2 = Integer.parseInt(permax2.getText());
        float pemax3 = Integer.parseInt(permax2.getText());
        
        float totalactscore1 = per1+per2+per3;
        float totalmaxscore1 = pemax1+pemax2+pemax3;
         float activityperce1 = (totalactscore1/totalmaxscore1)*100;

        totalperf = activityperce1;
          finalper = (float) ((totalact * a / 100.0) +
                  (totalexam * b / 100.0) +
                  (totalperf * c / 100.0));
        
        jTextField3.setText(""+finalper);
        


          
          
    }//GEN-LAST:event_jButton6ActionPerformed

    private void pperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pperActionPerformed

    private void actscore3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actscore3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actscore3ActionPerformed

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
            java.util.logging.Logger.getLogger(teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JTextField actmax1;
    private javax.swing.JTextField actmax2;
    private javax.swing.JTextField actmax3;
    private javax.swing.JTextField actmax4;
    private javax.swing.JTextField actp;
    private javax.swing.JTextField actscore1;
    private javax.swing.JTextField actscore2;
    private javax.swing.JTextField actscore3;
    private javax.swing.JTextField actscore4;
    private javax.swing.JTextField exammax;
    private javax.swing.JTextField examscore;
    private java.awt.Panel gradec;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField permax1;
    private javax.swing.JTextField permax2;
    private javax.swing.JTextField permax3;
    private javax.swing.JTextField perscore1;
    private javax.swing.JTextField perscore2;
    private javax.swing.JTextField perscore3;
    private javax.swing.JTextField pexam;
    private javax.swing.JTextField pper;
    // End of variables declaration//GEN-END:variables
}
