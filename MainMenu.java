/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.actvn.qldiemhsthpt;

import javax.swing.JOptionPane;

/**
 *
 * @author anhtu
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnQLyTT = new javax.swing.JButton();
        btnQuanLyDiem = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quản lí điểm học sinh trung học cơ sở");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 600, 110));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 160));

        btnQLyTT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnQLyTT.setText("Quản Lý Thông Tin Học Sinh");
        btnQLyTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLyTTActionPerformed(evt);
            }
        });
        jPanel1.add(btnQLyTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 730, 50));

        btnQuanLyDiem.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnQuanLyDiem.setText("Quản Lý Điểm Của Học Sinh");
        btnQuanLyDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyDiemActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuanLyDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 730, 50));

        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jPanel1.add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 730, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLyTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLyTTActionPerformed
        ThongTinHocSinhForm loc = new ThongTinHocSinhForm();
        loc.setVisible(true);
        this.setVisible(false);
        loc.pack();
        loc.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnQLyTTActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        LoginFrame loc = new LoginFrame();
        loc.setVisible(true);
        this.setVisible(false);
        loc.pack();
        loc.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnQuanLyDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyDiemActionPerformed
        NhapDiemChoHocSinhForm loc = new NhapDiemChoHocSinhForm();
        loc.setVisible(true);
        this.setVisible(false);
        loc.pack();
        loc.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnQuanLyDiemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        LoginFrame loc = new LoginFrame();
        loc.setVisible(true);
        this.setVisible(false);
        loc.pack();
        loc.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnQLyTT;
    private javax.swing.JButton btnQuanLyDiem;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
