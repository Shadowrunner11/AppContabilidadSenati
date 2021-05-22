/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.gui;

import com.gt.modo_oscuro.Pintor;
import com.gt.modo_oscuro.PintorBT;
import com.gt.modo_oscuro.Tema1;
import com.gt.modo_oscuro.Tema2;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author Usuario
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     * 
     */
    Tema2 claro =new Tema2();
    Tema1 osc =new Tema1();
    public inicio() {
        initComponents();
        (new Pintor(claro.getFondo1())).pintar(rootPanel);
//        oscuro(rootPanel, new Color (30,30,30));
        (new PintorBT(claro.getBotones1(),claro.getBotones1c())).pintar(botonPanel);
        
        jToggleButton1.setBackground(claro.getFondo1());
        jToggleButton1.setUI(new BasicButtonUI());
        
    }

//    public void oscuro(JPanel  contenedor, Color color) {
//
//        for (Component panel : contenedor.getComponents()) {
//            
//            if (panel.getClass() == JPanel.class) {
//              panel.setBackground(color);  
//            }
//            
//            if (panel.getClass() == JPanel.class) {
//                oscuro((JPanel) panel,color);
//            }
//        }
//        
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        upPanel = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        loginPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        userPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        passPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        botonPanel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rootPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        rootPanel.setPreferredSize(new java.awt.Dimension(600, 500));
        rootPanel.setLayout(new java.awt.BorderLayout());

        upPanel.setPreferredSize(new java.awt.Dimension(0, 100));
        upPanel.setLayout(new java.awt.BorderLayout());

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/noche.png"))); // NOI18N
        jToggleButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        upPanel.add(jToggleButton1, java.awt.BorderLayout.WEST);

        rootPanel.add(upPanel, java.awt.BorderLayout.PAGE_START);

        loginPanel.setPreferredSize(new java.awt.Dimension(0, 150));
        loginPanel.setLayout(new java.awt.BorderLayout());

        jPanel7.setLayout(new java.awt.GridLayout(2, 0));

        userPanel.setLayout(new java.awt.GridLayout(2, 0, 0, 5));

        jLabel1.setFont(new java.awt.Font("Russo One", 0, 36)); // NOI18N
        jLabel1.setText("     Usuario");
        userPanel.add(jLabel1);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.X_AXIS));

        jPanel3.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);

        jTextField1.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);

        jPanel2.setPreferredSize(new java.awt.Dimension(60, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);

        userPanel.add(jPanel1);

        jPanel7.add(userPanel);

        passPanel.setLayout(new java.awt.GridLayout(2, 0, 0, 5));

        jLabel2.setFont(new java.awt.Font("Russo One", 0, 36)); // NOI18N
        jLabel2.setText("     Contraseña");
        passPanel.add(jLabel2);

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jPanel6.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6);

        jPasswordField1.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
        jPasswordField1.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel4.add(jPasswordField1);

        jPanel5.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5);

        passPanel.add(jPanel4);

        jPanel7.add(passPanel);

        loginPanel.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel8.setPreferredSize(new java.awt.Dimension(608, 70));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        loginPanel.add(jPanel8, java.awt.BorderLayout.SOUTH);

        rootPanel.add(loginPanel, java.awt.BorderLayout.CENTER);

        botonPanel.setLayout(new javax.swing.BoxLayout(botonPanel, javax.swing.BoxLayout.LINE_AXIS));

        jPanel10.setPreferredSize(new java.awt.Dimension(60, 100));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        botonPanel.add(jPanel10);

        jButton2.setFont(new java.awt.Font("Russo One", 0, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Iniciar sesión");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton2.setPreferredSize(new java.awt.Dimension(500, 100));
        botonPanel.add(jButton2);

        jPanel9.setPreferredSize(new java.awt.Dimension(77, 100));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        botonPanel.add(jPanel9);

        rootPanel.add(botonPanel, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(rootPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
       
        if (jToggleButton1.isSelected()) {
        //hemos cambiado la función por un servicio 
//            oscuro(rootPanel,Color.CYAN);
              (new Pintor (osc.getFondo1())).pintar(rootPanel);
              (new PintorBT(osc.getBotones1(),osc.getBotones1c())).pintar(botonPanel);
              jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dia.png")));
              jToggleButton1.setBackground(osc.getFondo1());
              jToggleButton1.setUI(new BasicButtonUI());
              jLabel1.setForeground(Color.WHITE);
              jLabel2.setForeground(Color.WHITE);
              
        
        }else {
            
//            oscuro(rootPanel,Color.DARK_GRAY);
              (new Pintor(claro.getFondo1())).pintar(rootPanel);
//        oscuro(rootPanel, new Color (30,30,30));
              (new PintorBT(claro.getBotones1(),claro.getBotones1c())).pintar(botonPanel);
              jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/noche.png")));
              jToggleButton1.setBackground(Color.WHITE);
              jToggleButton1.setUI(new BasicButtonUI());
              jLabel1.setForeground(Color.BLACK);
              jLabel2.setForeground(Color.BLACK);
              
        }
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel passPanel;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JPanel upPanel;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
}
