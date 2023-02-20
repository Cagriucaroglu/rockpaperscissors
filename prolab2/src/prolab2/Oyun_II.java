package prolab2;

import java.awt.Image;
import java.util.*;
import javax.swing.*;
import java.lang.Thread;
import java.io.*;

public class Oyun_II extends javax.swing.JFrame {

          Bilgisayar bilgisayar = new Bilgisayar(1, 0, "Alexa");
          Bilgisayar bilgisayar2 = new Bilgisayar(2, 0, "Siri");
          private Task task;

          private static int sayac = 0;
          private static int bilgisayar_skor = 0;
          private static int bilgisayar_skor2 = 0;
          private static int hamle_sayisi = 0;
          private static int son_hamle_sayisi = 0;
          private static long hiz = 100;
          private static double can2 = 0;
          private static double can1 = 0;
          private static double eski_dayaniklilik_pc2 = 0;
          private static double eski_dayaniklilik_pc = 0;
          private static String eski_nesne_pc2 = "";
          private static String eski_nesne_pc = "";

          Image image_makas = new ImageIcon(this.getClass().getResource("/prolab2/resim/makas.jpg")).getImage();
          Image image_tas = new ImageIcon(this.getClass().getResource("/prolab2/resim/tas.jpg")).getImage();
          Image image_kagit = new ImageIcon(this.getClass().getResource("/prolab2/resim/kagit.jpg")).getImage();
          Image image_agir_tas = new ImageIcon(this.getClass().getResource("/prolab2/resim/agirtas.png")).getImage();
          Image image_ozel_kagit = new ImageIcon(this.getClass().getResource("/prolab2/resim/ozelkagit.png")).getImage();
          Image image_usta_makas = new ImageIcon(this.getClass().getResource("/prolab2/resim/ustamakas.png")).getImage();

          public Oyun_II() {

                    initComponents();

                    Nesne_Olustur();

                    String son_hamle_sayisi2;
                    son_hamle_sayisi2 = JOptionPane.showInputDialog("Hamle sayisini giriniz: ");
                    if (son_hamle_sayisi2 == null) {
                              son_hamle_sayisi2 = "10";       // hamle sayisi belirlenmezse default 10 olur
                    }
                    son_hamle_sayisi = Integer.parseInt(son_hamle_sayisi2);

                    String hiz_string;
                    hiz_string = JOptionPane.showInputDialog("Round süresini giriniz (1 sn için 10 girin): ");
                    if (hiz_string == null) {
                              hiz_string = "1000";
                    }
                    hiz = Integer.parseInt(hiz_string);
                    hiz = hiz * 100;

                    bilgisayar.setMax(bilgisayar.nesneListesi_bilgisayar.size());
                    bilgisayar2.setMax2(bilgisayar2.nesneListesi_bilgisayar.size());

                    task = new Task();
                    task.start();

          }

          @SuppressWarnings("unchecked")


          // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
          private void initComponents() {

                    jLabel6 = new javax.swing.JLabel();
                    jLabel7 = new javax.swing.JLabel();
                    jLabel8 = new javax.swing.JLabel();
                    jLabel9 = new javax.swing.JLabel();
                    jLabel10 = new javax.swing.JLabel();
                    jLabel12 = new javax.swing.JLabel();
                    jLabel13 = new javax.swing.JLabel();
                    jLabel14 = new javax.swing.JLabel();
                    jProgressBar1 = new javax.swing.JProgressBar();
                    jProgressBar2 = new javax.swing.JProgressBar();
                    jLabel16 = new javax.swing.JLabel();
                    jLabel17 = new javax.swing.JLabel();

                    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                    setTitle("Fight Arena");
                    setLocation(new java.awt.Point(-10, 0));
                    setMinimumSize(new java.awt.Dimension(1940, 1090));
                    getContentPane().setLayout(null);

                    jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel6.setToolTipText("");
                    getContentPane().add(jLabel6);
                    jLabel6.setBounds(650, 860, 680, 90);

                    jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel7.setText("0");
                    jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                    getContentPane().add(jLabel7);
                    jLabel7.setBounds(590, 130, 120, 70);

                    jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel8.setText("0");
                    getContentPane().add(jLabel8);
                    jLabel8.setBounds(1280, 130, 120, 70);

                    jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                    jLabel9.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel9.setText("SİRİ");
                    getContentPane().add(jLabel9);
                    jLabel9.setBounds(330, 140, 190, 60);

                    jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                    jLabel10.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel10.setText("ALEXA");
                    getContentPane().add(jLabel10);
                    jLabel10.setBounds(1450, 140, 190, 60);

                    jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
                    jLabel12.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel12.setToolTipText("");
                    getContentPane().add(jLabel12);
                    jLabel12.setBounds(1300, 300, 350, 350);

                    jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                    jLabel13.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    getContentPane().add(jLabel13);
                    jLabel13.setBounds(1230, 720, 520, 190);

                    jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                    jLabel14.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    getContentPane().add(jLabel14);
                    jLabel14.setBounds(240, 720, 520, 190);
                    getContentPane().add(jProgressBar1);
                    jProgressBar1.setBounds(1300, 110, 310, 10);
                    getContentPane().add(jProgressBar2);
                    jProgressBar2.setBounds(370, 100, 310, 10);

                    jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
                    jLabel16.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel16.setToolTipText("");
                    getContentPane().add(jLabel16);
                    jLabel16.setBounds(330, 300, 350, 350);

                    jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
                    jLabel17.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab2/resim/vs3_son.png"))); // NOI18N
                    jLabel17.setToolTipText("");
                    getContentPane().add(jLabel17);
                    jLabel17.setBounds(0, 0, 1920, 1080);

                    pack();
          }// </editor-fold>                        

          private class Task extends Thread {

                    public void run() {

                              while (hamle_sayisi != son_hamle_sayisi) {

                                        try {
                                                  bilgisayar.nesneSec(bilgisayar.getMax());
                                                  bilgisayar2.nesneSec(bilgisayar2.getMax2());

                                                  hamle_sayisi++;
                                                  jLabel6.setText(" ROUND: " + hamle_sayisi);
                                                  if (hamle_sayisi == son_hamle_sayisi) {
                                                            sayac = -1;
                                                            dayaniklilik_hesapla();
                                                  }

                                                  double etki1 = bilgisayar2.nesneListesi_bilgisayar.get(bilgisayar2.getMax2()).etkiHesapla(bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax());
                                                  double etki2 = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).etkiHesapla(bilgisayar2.nesneListesi_bilgisayar, bilgisayar2.getMax2());

                                                  skor_guncelle(etki1, etki2);

                                                  resim_sec_bilgisayar2(bilgisayar2.getMax2());
                                                  resim_sec_bilgisayar(bilgisayar.getMax());

                                                  eski_dayaniklilik_pc2 = bilgisayar2.nesneListesi_bilgisayar.get(bilgisayar2.getMax2()).dayaniklilik;
                                                  eski_dayaniklilik_pc = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).dayaniklilik;

                                                  Nesne eski_nesne_pc2 = bilgisayar2.nesneListesi_bilgisayar.get(bilgisayar2.getMax2());
                                                  Nesne eski_nesne_pc = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax());

                                                  bilgisayar2.nesneListesi_bilgisayar.get(bilgisayar2.getMax2()).durumGuncelle(etki1, etki2, bilgisayar2.nesneListesi_bilgisayar, bilgisayar2.getMax2());
                                                  bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).durumGuncelle(etki2, etki1, bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax());

                                                  String puangoster_pc2 = eski_nesne_pc2.nesnePuaniGoster(bilgisayar2.nesneListesi_bilgisayar, bilgisayar2.getMax2(), etki1, eski_dayaniklilik_pc2);
                                                  String puangoster_pc = eski_nesne_pc.nesnePuaniGoster(bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax(), etki2, eski_dayaniklilik_pc);

                                                  jLabel14.setText(puangoster_pc2);
                                                  jLabel13.setText(puangoster_pc);

                                                  can_goster2();
                                                  can_goster();

                                                  remove_bilgisayar();
                                                  if (bilgisayar.getMax() == 0) {

                                                            bilgisayar.setMax(bilgisayar.nesneListesi_bilgisayar.size());
                                                  }

                                                  remove_bilgisayar2();
                                                  if (bilgisayar2.getMax2() == 0) {

                                                            bilgisayar2.setMax2(bilgisayar2.nesneListesi_bilgisayar.size());
                                                  }

                                                  nesne_Bitim_Kontrol(bilgisayar.nesneListesi_bilgisayar);
                                                  nesne_Bitim_Kontrol(bilgisayar2.nesneListesi_bilgisayar);

                                                  Thread.sleep(hiz);
                                        } catch (InterruptedException ex) {
                                        }
                              }

                    }

          }

          public void can_goster2() {
                    can2 = 0;
                    for (int i = 0; i < bilgisayar2.nesneListesi_bilgisayar.size(); i++) {
                              can2 = can2 + bilgisayar2.nesneListesi_bilgisayar.get(i).dayaniklilik;
                              int can_int = (int) can2;
                              jProgressBar2.setValue(can_int);
                    }
          }

          public void can_goster() {
                    can1 = 0;
                    for (int i = 0; i < bilgisayar.nesneListesi_bilgisayar.size(); i++) {
                              can1 = can1 + bilgisayar.nesneListesi_bilgisayar.get(i).dayaniklilik;
                              int can_int = (int) can1;
                              jProgressBar1.setValue(can_int);
                    }
          }

          public void nesne_Bitim_Kontrol(ArrayList<Nesne> nesneler) {
                    if (nesneler.isEmpty()) {
                              dayaniklilik_hesapla();
                    }

          }

          public void remove_bilgisayar() {

                    for (int a = 0; a < bilgisayar.nesneListesi_bilgisayar.size(); a++) {
                              if (bilgisayar.nesneListesi_bilgisayar.get(a).dayaniklilik <= 0) {
                                        bilgisayar.nesneListesi_bilgisayar.remove(a);

                              }
                    }
          }

          public void remove_bilgisayar2() {

                    for (int a = 0; a < bilgisayar2.nesneListesi_bilgisayar.size(); a++) {
                              if (bilgisayar2.nesneListesi_bilgisayar.get(a).dayaniklilik <= 0) {
                                        bilgisayar2.nesneListesi_bilgisayar.remove(a);

                              }
                    }
          }

          public void resim_sec_bilgisayar2(int index) {

                    String nesne = bilgisayar2.nesneListesi_bilgisayar.get(index).toString();
                    if (nesne.contains("Agir_Tas")) {
                              jLabel16.setIcon(new ImageIcon(image_agir_tas));
                    } else if (nesne.contains("Tas")) {
                              jLabel16.setIcon(new ImageIcon(image_tas));
                    } else if (nesne.contains("Ozel_Kagit")) {
                              jLabel16.setIcon(new ImageIcon(image_ozel_kagit));
                    } else if (nesne.contains("Kagit")) {
                              jLabel16.setIcon(new ImageIcon(image_kagit));
                    } else if (nesne.contains("Usta_Makas")) {
                              jLabel16.setIcon(new ImageIcon(image_usta_makas));
                    } else if (nesne.contains("Makas")) {
                              jLabel16.setIcon(new ImageIcon(image_makas));
                    }
          }

          public void resim_sec_bilgisayar(int index) {

                    String nesne = bilgisayar.nesneListesi_bilgisayar.get(index).toString();
                    if (nesne.contains("Agir_Tas")) {
                              jLabel12.setIcon(new ImageIcon(image_agir_tas));
                    } else if (nesne.contains("Tas")) {
                              jLabel12.setIcon(new ImageIcon(image_tas));
                    } else if (nesne.contains("Ozel_Kagit")) {
                              jLabel12.setIcon(new ImageIcon(image_ozel_kagit));
                    } else if (nesne.contains("Kagit")) {
                              jLabel12.setIcon(new ImageIcon(image_kagit));
                    } else if (nesne.contains("Usta_Makas")) {
                              jLabel12.setIcon(new ImageIcon(image_usta_makas));
                    } else if (nesne.contains("Makas")) {
                              jLabel12.setIcon(new ImageIcon(image_makas));
                    }
          }

          public void skor_guncelle(double etki1, double etki2) {
                    if (etki1 == etki2) {
                    } else if (etki1 > etki2) {
                              bilgisayar_skor2++;
                              String bilgisayar2_skor_string = Integer.toString(bilgisayar_skor2);
                              jLabel7.setText(bilgisayar2_skor_string);
                    } else {
                              bilgisayar_skor++;
                              String bilgisayar_skor_string = Integer.toString(bilgisayar_skor);
                              jLabel8.setText(bilgisayar_skor_string);
                    }
          }

          public void dayaniklilik_hesapla() {
                    double bilgisayar2_dayaniklilik_toplam = 0;
                    double bilgisayar_dayaniklilik_toplam = 0;
                    for (int i = 0; i < bilgisayar2.nesneListesi_bilgisayar.size(); i++) {
                              bilgisayar2_dayaniklilik_toplam += bilgisayar2.nesneListesi_bilgisayar.get(i).dayaniklilik;
                    }
                    for (int j = 0; j < bilgisayar.nesneListesi_bilgisayar.size(); j++) {
                              bilgisayar_dayaniklilik_toplam += bilgisayar.nesneListesi_bilgisayar.get(j).dayaniklilik;
                    }
                    if (bilgisayar2_dayaniklilik_toplam > bilgisayar_dayaniklilik_toplam) {
                              JOptionPane.showMessageDialog(null, "Oyun bitti\nSiri dayanıklılık: " + bilgisayar2_dayaniklilik_toplam + "\nAlexa dayanıklılık: " + bilgisayar_dayaniklilik_toplam
                                      + "\nKAZANAN SİRİ");
                    } else if (bilgisayar2_dayaniklilik_toplam < bilgisayar_dayaniklilik_toplam) {
                              JOptionPane.showMessageDialog(null, "Oyun bitti\nSiri dayanıklılık: " + bilgisayar2_dayaniklilik_toplam + "\nAlexa dayanıklılık: " + bilgisayar_dayaniklilik_toplam
                                      + "\nKAZANAN ALEXA");
                    } else {
                              JOptionPane.showMessageDialog(null, "Oyun bitti\nSiri dayanıklılık: " + bilgisayar2_dayaniklilik_toplam + "\nAlexa dayanıklılık: " + bilgisayar_dayaniklilik_toplam
                                      + "\n BERABERE");
                    }
                    dispose();
                    sifirlama();
                    Arayuz arayuz1 = new Arayuz();
                    arayuz1.setVisible(true);
          }

          public void sifirlama() {

                    bilgisayar_skor2 = 0;
                    bilgisayar_skor = 0;
                    hamle_sayisi = 0;
                    son_hamle_sayisi = 0;
          }

          public static void main(String args[]) {
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
                              java.util.logging.Logger.getLogger(Oyun_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                              java.util.logging.Logger.getLogger(Oyun_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                              java.util.logging.Logger.getLogger(Oyun_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                              java.util.logging.Logger.getLogger(Oyun_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    //</editor-fold>
                    //</editor-fold>
                    //</editor-fold>
                    //</editor-fold>
                    //</editor-fold>
                    //</editor-fold>
                    //</editor-fold>
                    //</editor-fold>

                    java.awt.EventQueue.invokeLater(new Runnable() {
                              public void run() {
                              }
                    });
          }

          public void Nesne_Olustur() {

                    Random random = new Random();
                    Tas[] taslar_pc = new Tas[10];
                    Makas[] makas_pc = new Makas[10];
                    Kagit[] kagit_pc = new Kagit[10];
                    int a = 0, b = 0, c = 0;
                    int sayi;

                    for (int j = 0; j < 5; j++) {

                              sayi = random.nextInt(0, 3);
                              if (sayi == 0) {
                                        taslar_pc[a] = new Tas(20, 0, 2);
                                        bilgisayar.nesneListesi_bilgisayar.add(taslar_pc[a]);
                                        a++;
                              } else if (sayi == 1) {
                                        kagit_pc[b] = new Kagit(20, 0, 2);
                                        bilgisayar.nesneListesi_bilgisayar.add(kagit_pc[b]);
                                        b++;
                              } else if (sayi == 2) {
                                        makas_pc[c] = new Makas(20, 0, 2);
                                        bilgisayar.nesneListesi_bilgisayar.add(makas_pc[c]);
                                        c++;
                              }

                    }

                    for (int j = 0; j < 5; j++) {

                              sayi = random.nextInt(0, 3);
                              if (sayi == 0) {
                                        taslar_pc[a] = new Tas(20, 0, 2);
                                        bilgisayar2.nesneListesi_bilgisayar.add(taslar_pc[a]);
                                        a++;
                              } else if (sayi == 1) {
                                        kagit_pc[b] = new Kagit(20, 0, 2);
                                        bilgisayar2.nesneListesi_bilgisayar.add(kagit_pc[b]);
                                        b++;
                              } else if (sayi == 2) {
                                        makas_pc[c] = new Makas(20, 0, 2);
                                        bilgisayar2.nesneListesi_bilgisayar.add(makas_pc[c]);
                                        c++;
                              }

                    }

                    jLabel7.setText("0");;
                    jLabel8.setText("0");;

          }


          // Variables declaration - do not modify                     
          private javax.swing.JLabel jLabel10;
          private javax.swing.JLabel jLabel12;
          private javax.swing.JLabel jLabel13;
          private javax.swing.JLabel jLabel14;
          private javax.swing.JLabel jLabel16;
          private javax.swing.JLabel jLabel17;
          private javax.swing.JLabel jLabel6;
          private javax.swing.JLabel jLabel7;
          private javax.swing.JLabel jLabel8;
          private javax.swing.JLabel jLabel9;
          private javax.swing.JProgressBar jProgressBar1;
          private javax.swing.JProgressBar jProgressBar2;
          // End of variables declaration                   
}

