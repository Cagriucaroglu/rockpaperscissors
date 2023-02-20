package prolab2;

import java.util.*;
import javax.swing.*;

public class Arayuz_Nesne extends javax.swing.JFrame {

          public static int getTas_sayisi() {
                    return tas_sayisi;
          }

          public static void setTas_sayisi(int aTas_sayisi) {
                    tas_sayisi = aTas_sayisi;
          }

          public static int getKagit_sayisi() {
                    return kagit_sayisi;
          }

          public static void setKagit_sayisi(int aKagit_sayisi) {
                    kagit_sayisi = aKagit_sayisi;
          }

          public static int getMakas_sayisi() {
                    return makas_sayisi;
          }

          public static void setMakas_sayisi(int aMakas_sayisi) {
                    makas_sayisi = aMakas_sayisi;
          }

          public Arayuz_Nesne() {
                    initComponents();
                    jLabel1.setText("0");
                    jLabel2.setText("0");
                    jLabel3.setText("0");
          }

          @SuppressWarnings("unchecked")
          // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
          private void initComponents() {

                    jPanel1 = new javax.swing.JPanel();
                    jButton5 = new javax.swing.JButton();
                    jButton6 = new javax.swing.JButton();
                    jButton7 = new javax.swing.JButton();
                    jButton8 = new javax.swing.JButton();
                    jButton9 = new javax.swing.JButton();
                    jButton10 = new javax.swing.JButton();
                    jButton4 = new javax.swing.JButton();
                    jLabel1 = new javax.swing.JLabel();
                    jLabel2 = new javax.swing.JLabel();
                    jLabel3 = new javax.swing.JLabel();
                    jLabel7 = new javax.swing.JLabel();
                    jLabel8 = new javax.swing.JLabel();

                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                    jPanel1.setLayout(jPanel1Layout);
                    jPanel1Layout.setHorizontalGroup(
                              jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGap(0, 100, Short.MAX_VALUE)
                    );
                    jPanel1Layout.setVerticalGroup(
                              jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGap(0, 100, Short.MAX_VALUE)
                    );

                    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                    setTitle("NESNE SEÇME");
                    setLocation(new java.awt.Point(550, 180));
                    setMinimumSize(new java.awt.Dimension(820, 610));
                    getContentPane().setLayout(null);

                    jButton5.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
                    jButton5.setText("+");
                    jButton5.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton5ActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jButton5);
                    jButton5.setBounds(150, 110, 40, 40);

                    jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                    jButton6.setText("-");
                    jButton6.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton6ActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jButton6);
                    jButton6.setBounds(600, 110, 40, 40);

                    jButton7.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
                    jButton7.setText("+");
                    jButton7.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton7ActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jButton7);
                    jButton7.setBounds(410, 110, 40, 40);

                    jButton8.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
                    jButton8.setText("+");
                    jButton8.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton8ActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jButton8);
                    jButton8.setBounds(650, 110, 40, 40);

                    jButton9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                    jButton9.setText("-");
                    jButton9.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton9ActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jButton9);
                    jButton9.setBounds(100, 110, 40, 40);

                    jButton10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                    jButton10.setText("-");
                    jButton10.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton10ActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jButton10);
                    jButton10.setBounds(360, 110, 40, 40);

                    jButton4.setBackground(new java.awt.Color(255, 234, 0));
                    jButton4.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
                    jButton4.setForeground(new java.awt.Color(204, 0, 51));
                    jButton4.setText("OYNA");
                    jButton4.setBorder(null);
                    jButton4.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton4ActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jButton4);
                    jButton4.setBounds(297, 520, 200, 50);

                    jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                    jLabel1.setForeground(new java.awt.Color(0, 0, 0));
                    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    getContentPane().add(jLabel1);
                    jLabel1.setBounds(590, 400, 120, 50);

                    jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                    jLabel2.setForeground(new java.awt.Color(0, 0, 0));
                    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    getContentPane().add(jLabel2);
                    jLabel2.setBounds(340, 400, 120, 50);

                    jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                    jLabel3.setForeground(new java.awt.Color(0, 0, 0));
                    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    getContentPane().add(jLabel3);
                    jLabel3.setBounds(90, 400, 120, 50);

                    jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                    jLabel7.setForeground(new java.awt.Color(0, 0, 0));
                    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel7.setText("LÜTFEN 5 TANE NESNE SEÇİNİZ");
                    getContentPane().add(jLabel7);
                    jLabel7.setBounds(2, 10, 790, 69);

                   


                    pack();
          }// </editor-fold>                        
          public static int sayac = 0;
          private static int tas_sayisi = 0;
          private static int kagit_sayisi = 0;
          private static int makas_sayisi = 0;

          private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         

                    setTas_sayisi(getTas_sayisi() + 1);
                    if (getTas_sayisi() > 5) {
                              setTas_sayisi(5);
                              sayac--;
                    }
                    jLabel3.setText("" + getTas_sayisi());
                    sayac++;
          }                                        

          private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         

                    setTas_sayisi(getTas_sayisi() - 1);
                    if (getTas_sayisi() < 0) {
                              setTas_sayisi(0);
                              sayac++;
                    }
                    jLabel3.setText("" + getTas_sayisi());
                    sayac--;

          }                                        

          private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                    setKagit_sayisi(getKagit_sayisi() + 1);
                    if (getKagit_sayisi() > 5) {
                              setKagit_sayisi(5);
                              sayac--;
                    }
                    jLabel1.setText("" + getKagit_sayisi());
                    sayac++;

          }                                        

          private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                    setKagit_sayisi(getKagit_sayisi() - 1);
                    if (getKagit_sayisi() < 0) {
                              setKagit_sayisi(0);
                              sayac++;
                    }
                    jLabel1.setText("" + getKagit_sayisi());
                    sayac--;
          }                                        

          private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                    setMakas_sayisi(getMakas_sayisi() + 1);
                    if (getMakas_sayisi() > 5) {
                              setMakas_sayisi(5);
                              sayac--;
                    }
                    jLabel2.setText("" + getMakas_sayisi());
                    sayac++;
          }                                        

          private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
                    setMakas_sayisi(getMakas_sayisi() - 1);
                    if (getMakas_sayisi() < 0) {
                              setMakas_sayisi(0);
                              sayac++;
                    }
                    jLabel2.setText("" + getMakas_sayisi());
                    sayac--;
          }                                         

          private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         

                    if (sayac == 5) {
                              Oyun_I oyun_I = new Oyun_I();
                              oyun_I.setVisible(true);
                              dispose();
                    } else {
                              JOptionPane.showMessageDialog(null, " 5 nesne seçmediniz!!!");
                    }
          }                                        

          public static void main(String args[]) {

                    try {
                              for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                                        if ("Nimbus".equals(info.getName())) {
                                                  javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                                  break;
                                        }
                              }
                    } catch (ClassNotFoundException ex) {
                              java.util.logging.Logger.getLogger(Arayuz_Nesne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                              java.util.logging.Logger.getLogger(Arayuz_Nesne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                              java.util.logging.Logger.getLogger(Arayuz_Nesne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                              java.util.logging.Logger.getLogger(Arayuz_Nesne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }

                    java.awt.EventQueue.invokeLater(new Runnable() {
                              public void run() {
                              }
                    });

          }


          // Variables declaration - do not modify                     
          private javax.swing.JButton jButton10;
          private javax.swing.JButton jButton4;
          private javax.swing.JButton jButton5;
          private javax.swing.JButton jButton6;
          private javax.swing.JButton jButton7;
          private javax.swing.JButton jButton8;
          private javax.swing.JButton jButton9;
          private javax.swing.JLabel jLabel1;
          private javax.swing.JLabel jLabel2;
          private javax.swing.JLabel jLabel3;
          private javax.swing.JLabel jLabel7;
          private javax.swing.JLabel jLabel8;
          private javax.swing.JPanel jPanel1;
          // End of variables declaration                   
}