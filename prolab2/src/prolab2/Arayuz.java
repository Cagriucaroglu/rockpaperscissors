package prolab2;

import java.util.*;
import javax.swing.*;

public class Arayuz extends javax.swing.JFrame {
	
	public Arayuz() {
        initComponents();
	}
          

          @SuppressWarnings({ "unchecked"})
          // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
          private void initComponents() {

                    jButton4 = new javax.swing.JButton();
                    jButton5 = new javax.swing.JButton();
                    jLabel4 = new javax.swing.JLabel();
                    jLabel3 = new javax.swing.JLabel();

                    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                    setTitle("MAİN MENU");
                    setLocation(new java.awt.Point(550, 200));
                    setMinimumSize(new java.awt.Dimension(918, 500));
                    getContentPane().setLayout(null);

                    jButton4.setBackground(new java.awt.Color(255, 255, 255));
                    jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                    jButton4.setForeground(new java.awt.Color(204, 0, 0));
                    jButton4.setText("KULLANICI - BİLGİSAYAR");
                    jButton4.setBorder(null);
                    jButton4.setPreferredSize(new java.awt.Dimension(100, 23));
                    jButton4.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton4ActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jButton4);
                    jButton4.setBounds(112, 390, 320, 60);

                    jButton5.setBackground(new java.awt.Color(255, 255, 255));
                    jButton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                    jButton5.setForeground(new java.awt.Color(204, 0, 0));
                    jButton5.setText("BİLGİSAYAR - BİLGİSAYAR");
                    jButton5.setBorder(null);
                    jButton5.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton5ActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jButton5);
                    jButton5.setBounds(480, 390, 330, 60);

                    jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
                    jLabel4.setForeground(new java.awt.Color(204, 0, 0));
                    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel4.setText("TAŞ KAĞIT MAKAS OYUNUNA HOŞGELDİNİZ");
                    getContentPane().add(jLabel4);
                    jLabel4.setBounds(0, 10, 900, 70);
                    
                    jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
                    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab2/resim/hepsi.png"))); // NOI18N
                    getContentPane().add(jLabel3);
                    jLabel3.setBounds(0, 0, 900, 460);

                    
                    
                    pack();
          }// </editor-fold>                        

          private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         

                    Arayuz_Nesne arayuz_nesne = new Arayuz_Nesne();
                    arayuz_nesne.setVisible(true);
                    dispose();

          }                                        

          private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                    Oyun_II oyun_II = new Oyun_II();
                    oyun_II.setVisible(true);
                    dispose();
          }                                        

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
                              java.util.logging.Logger.getLogger(Arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                              java.util.logging.Logger.getLogger(Arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                              java.util.logging.Logger.getLogger(Arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                              java.util.logging.Logger.getLogger(Arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    //</editor-fold>

                    /* Create and display the form */
                    java.awt.EventQueue.invokeLater(new Runnable() {
                              public void run() {
                                        new Arayuz().setVisible(true);
                              }
                    });

          }

          // Variables declaration - do not modify                     
          private javax.swing.JButton jButton4;
          private javax.swing.JButton jButton5;
          private javax.swing.JLabel jLabel3;
          private javax.swing.JLabel jLabel4;
          // End of variables declaration                   
}
