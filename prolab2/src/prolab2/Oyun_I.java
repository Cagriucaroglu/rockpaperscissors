
package prolab2;

import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Oyun_I extends javax.swing.JFrame {

          Kullanici kullanici = new Kullanici(1, 0, "Kullanıcı");
          Bilgisayar bilgisayar = new Bilgisayar(1, 0, "Bilgisayar");
          Arayuz_Nesne kullanici_Bilgisayar = new Arayuz_Nesne();

          public static double dayaniklilik_main = 20;
          public static int katilik_main = 10;
          public static int nufuz_main = 2;
          public static int kalinlik_main = 2;
          public static int keskinlik_main = 2;
          public static int direnc_main = 2;

          private static boolean durum = false;
          private static boolean durum1 = true;
          private static boolean durum2 = true;
          private static boolean durum3 = true;
          private static boolean durum4 = true;
          private static boolean durum5 = true;
          private static int sayac = 0;
          private static int sayac_kontrol = 5;
          private static int kullanici_skor = 0;
          private static int bilgisayar_skor = 0;
          private static int hamle_sayisi = 0;
          private static int son_hamle_sayisi = 0;
          private static int false_sayisi = 0;
          private static double eski_dayaniklilik_user = 0;
          private static double eski_dayaniklilik_pc = 0;
          private static String eski_nesne_user = "";
          private static String eski_nesne_pc = "";
          private static Color[] colors = {Color.RED, Color.YELLOW, Color.GREEN};

          Image image_makas = new ImageIcon(this.getClass().getResource("/prolab2/resim/makas.jpg")).getImage();
          Image image_tas = new ImageIcon(this.getClass().getResource("/prolab2/resim/tas.jpg")).getImage();
          Image image_kagit = new ImageIcon(this.getClass().getResource("/prolab2/resim/kagit.jpg")).getImage();
          Image image_agir_tas = new ImageIcon(this.getClass().getResource("/prolab2/resim/agirtas.png")).getImage();
          Image image_ozel_kagit = new ImageIcon(this.getClass().getResource("/prolab2/resim/ozelkagit.png")).getImage();
          Image image_usta_makas = new ImageIcon(this.getClass().getResource("/prolab2/resim/ustamakas.png")).getImage();

          
public Oyun_I() {
                    initComponents();

                    //jButton1.setBackground(new java.awt.Color(ERROR));
                    String son_hamle_sayisi2;
                    son_hamle_sayisi2 = JOptionPane.showInputDialog("Hamle sayisini giriniz: ");
                    if (son_hamle_sayisi2 == null) {
                              son_hamle_sayisi2 = "10";       // hamle sayisi belirlenmezse default 10 olur
                    }
                    son_hamle_sayisi = Integer.parseInt(son_hamle_sayisi2);

                    nesne_olustur2(kullanici_Bilgisayar.getTas_sayisi(), kullanici_Bilgisayar.getKagit_sayisi(), kullanici_Bilgisayar.getMakas_sayisi());
                    buton_isim();
                    bilgisayar.setMax(bilgisayar.nesneListesi_bilgisayar.size());

          }

          @SuppressWarnings("unchecked")
          // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
          private void initComponents() {

                    buttonGroup1 = new javax.swing.ButtonGroup();
                    jButton1 = new javax.swing.JButton();
                    jButton2 = new javax.swing.JButton();
                    jButton3 = new javax.swing.JButton();
                    jButton4 = new javax.swing.JButton();
                    jButton5 = new javax.swing.JButton();
                    jLabel5 = new javax.swing.JLabel();
                    jProgressBar1 = new javax.swing.JProgressBar();
                    jProgressBar2 = new javax.swing.JProgressBar();
                    jProgressBar3 = new javax.swing.JProgressBar();
                    jProgressBar4 = new javax.swing.JProgressBar();
                    jProgressBar5 = new javax.swing.JProgressBar();
                    jLabel2 = new javax.swing.JLabel();
                    jLabel1 = new javax.swing.JLabel();
                    jLabel3 = new javax.swing.JLabel();
                    jLabel4 = new javax.swing.JLabel();
                    jLabel6 = new javax.swing.JLabel();
                    jLabel7 = new javax.swing.JLabel();
                    jLabel9 = new javax.swing.JLabel();
                    jLabel10 = new javax.swing.JLabel();
                    jLabel11 = new javax.swing.JLabel();

                    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                    setTitle("Fight Arena");
                    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                    setLocation(new java.awt.Point(-10, 0));
                    setMinimumSize(new java.awt.Dimension(1940, 1090));
                    getContentPane().setLayout(null);

                    jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                    jButton1.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton1ActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jButton1);
                    jButton1.setBounds(310, 30, 150, 50);

                    jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                    jButton2.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton2ActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jButton2);
                    jButton2.setBounds(540, 30, 150, 50);

                    jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                    jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                    jButton3.setVerifyInputWhenFocusTarget(false);
                    jButton3.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton3ActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jButton3);
                    jButton3.setBounds(70, 30, 150, 50);

                    jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                    jButton4.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton4ActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jButton4);
                    jButton4.setBounds(780, 30, 150, 50);

                    jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                    jButton5.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton5ActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jButton5);
                    jButton5.setBounds(1010, 30, 150, 50);

                    jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel5.setToolTipText("");
                    getContentPane().add(jLabel5);
                    jLabel5.setBounds(650, 860, 680, 90);

                    jProgressBar1.setMaximum(20);
                    jProgressBar1.setToolTipText("");
                    jProgressBar1.setValue(20);
                    getContentPane().add(jProgressBar1);
                    jProgressBar1.setBounds(70, 80, 150, 10);

                    jProgressBar2.setMaximum(20);
                    jProgressBar2.setValue(20);
                    getContentPane().add(jProgressBar2);
                    jProgressBar2.setBounds(310, 80, 150, 10);

                    jProgressBar3.setMaximum(20);
                    jProgressBar3.setValue(20);
                    getContentPane().add(jProgressBar3);
                    jProgressBar3.setBounds(540, 80, 150, 10);

                    jProgressBar4.setMaximum(20);
                    jProgressBar4.setValue(20);
                    getContentPane().add(jProgressBar4);
                    jProgressBar4.setBounds(780, 80, 150, 10);

                    jProgressBar5.setMaximum(20);
                    jProgressBar5.setValue(20);
                    getContentPane().add(jProgressBar5);
                    jProgressBar5.setBounds(1010, 80, 150, 10);

                    jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel2.setText("0");
                    jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                    getContentPane().add(jLabel2);
                    jLabel2.setBounds(630, 150, 150, 100);

                    jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel1.setText("0");
                    getContentPane().add(jLabel1);
                    jLabel1.setBounds(1230, 160, 130, 80);

                    jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel3.setText("Kullanıcı");
                    getContentPane().add(jLabel3);
                    jLabel3.setBounds(300, 140, 250, 80);

                    jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel4.setText("Bilgisayar");
                    getContentPane().add(jLabel4);
                    jLabel4.setBounds(1430, 150, 240, 80);

                    jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
                    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel6.setToolTipText("");
                    getContentPane().add(jLabel6);
                    jLabel6.setBounds(280, 330, 350, 350);

                    jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
                    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel7.setToolTipText("");
                    getContentPane().add(jLabel7);
                    jLabel7.setBounds(1360, 330, 350, 350);

                    jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                    jLabel9.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    getContentPane().add(jLabel9);
                    jLabel9.setBounds(1290, 710, 500, 200);

                    jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                    jLabel10.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    getContentPane().add(jLabel10);
                    jLabel10.setBounds(180, 710, 540, 220);

                    jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
                    jLabel11.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab2/resim/vs3_son.png"))); // NOI18N
                    jLabel11.setPreferredSize(new java.awt.Dimension(1920, 1080));
                    getContentPane().add(jLabel11);
                    jLabel11.setBounds(0, 0, 1920, 1080);

                    pack();
          }// </editor-fold>                        

          private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         

                    bilgisayar.nesneSec(bilgisayar.getMax());
                    hamle_sayisi++;
                    jLabel5.setText(" ROUND: " + hamle_sayisi);

                    if (hamle_sayisi == son_hamle_sayisi) {
                              sayac = -1;
                              dayaniklilik_hesapla();
                    }

                    jButton3.setEnabled(durum);

                    double etki1 = kullanici.nesneListesi_kullanici.get(0).etkiHesapla(bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax());
                    double etki2 = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).etkiHesapla(kullanici.nesneListesi_kullanici, 0);

                    skor_guncelle(etki1, etki2);

                    resim_sec_kullanici(0);
                    resim_sec_bilgisayar(bilgisayar.getMax());

                    eski_dayaniklilik_user = kullanici.nesneListesi_kullanici.get(0).dayaniklilik;
                    eski_dayaniklilik_pc = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).dayaniklilik;

                    Nesne eski_nesne_kullinici = kullanici.nesneListesi_kullanici.get(0);
                    Nesne eski_nesne_pc = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax());

                    kullanici.nesneListesi_kullanici.get(0).durumGuncelle(etki1, etki2, kullanici.nesneListesi_kullanici, 0);
                    bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).durumGuncelle(etki2, etki1, bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax());

                    String puangoster_kullanici = eski_nesne_kullinici.nesnePuaniGoster(kullanici.nesneListesi_kullanici, 0, etki1, eski_dayaniklilik_user);
                    String puangoster_pc = eski_nesne_pc.nesnePuaniGoster(bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax(), etki2, eski_dayaniklilik_pc);

                    jLabel10.setText(puangoster_kullanici);
                    jLabel9.setText(puangoster_pc);

                    int progres_bar_value = (int) kullanici.nesneListesi_kullanici.get(0).dayaniklilik;

                    jProgressBar1.setValue(progres_bar_value);

                    if (kullanici.nesneListesi_kullanici.get(0).dayaniklilik == 0) {
                              durum3 = false;
                              false_sayisi++;
                    }
                    sayac++;

                    if (sayac >= sayac_kontrol) {
                              jButton1.setEnabled(durum1);
                              jButton2.setEnabled(durum2);
                              jButton3.setEnabled(durum3);
                              jButton4.setEnabled(durum4);
                              jButton5.setEnabled(durum5);
                              sayac = 0;
                              buton_isim();
                              sayac_kontrol = 5 - false_sayisi;
                    }
                    remove();
                    if (bilgisayar.getMax() == 0) {

                              bilgisayar.setMax(bilgisayar.nesneListesi_bilgisayar.size());
                    }
                    nesne_Bitim_Kontrol();


          }                                        

          private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

                    bilgisayar.nesneSec(bilgisayar.getMax());
                    hamle_sayisi++;
                    jLabel5.setText(" ROUND: " + hamle_sayisi);

                    if (hamle_sayisi == son_hamle_sayisi) {
                              sayac = -1;
                              dayaniklilik_hesapla();
                    }

                    jButton1.setEnabled(durum);

                    double etki1 = kullanici.nesneListesi_kullanici.get(1).etkiHesapla(bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax());
                    double etki2 = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).etkiHesapla(kullanici.nesneListesi_kullanici, 1);

                    skor_guncelle(etki1, etki2);

                    resim_sec_kullanici(1);
                    resim_sec_bilgisayar(bilgisayar.getMax());

                    eski_dayaniklilik_user = kullanici.nesneListesi_kullanici.get(1).dayaniklilik;
                    eski_dayaniklilik_pc = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).dayaniklilik;

                    Nesne eski_nesne_kullinici = kullanici.nesneListesi_kullanici.get(1);
                    Nesne eski_nesne_pc = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax());

                    kullanici.nesneListesi_kullanici.get(1).durumGuncelle(etki1, etki2, kullanici.nesneListesi_kullanici, 1);
                    bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).durumGuncelle(etki2, etki1, bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax());

                    String puangoster_kullanici = eski_nesne_kullinici.nesnePuaniGoster(kullanici.nesneListesi_kullanici, 1, etki1, eski_dayaniklilik_user);
                    String puangoster_pc = eski_nesne_pc.nesnePuaniGoster(bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax(), etki2, eski_dayaniklilik_pc);
                    jLabel10.setText(puangoster_kullanici);
                    jLabel9.setText(puangoster_pc);

                    int progres_bar_value2 = (int) kullanici.nesneListesi_kullanici.get(1).dayaniklilik;
                    jProgressBar2.setValue(progres_bar_value2);

                    if (kullanici.nesneListesi_kullanici.get(1).dayaniklilik == 0) {
                              durum1 = false;
                              false_sayisi++;
                    }
                    sayac++;

                    if (sayac >= sayac_kontrol) {
                              jButton1.setEnabled(durum1);
                              jButton2.setEnabled(durum2);
                              jButton3.setEnabled(durum3);
                              jButton4.setEnabled(durum4);
                              jButton5.setEnabled(durum5);
                              sayac = 0;
                              buton_isim();
                              sayac_kontrol = 5 - false_sayisi;
                    }
                    remove();
                    if (bilgisayar.getMax() == 0) {

                              bilgisayar.setMax(bilgisayar.nesneListesi_bilgisayar.size());
                    }

                    nesne_Bitim_Kontrol();

          }                                        

          private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         

                    bilgisayar.nesneSec(bilgisayar.getMax());
                    hamle_sayisi++;
                    jLabel5.setText(" ROUND: " + hamle_sayisi);

                    if (hamle_sayisi == son_hamle_sayisi) {
                              sayac = -1;
                              dayaniklilik_hesapla();
                    }

                    jButton2.setEnabled(durum);

                    double etki1 = kullanici.nesneListesi_kullanici.get(2).etkiHesapla(bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax());
                    double etki2 = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).etkiHesapla(kullanici.nesneListesi_kullanici, 2);

                    skor_guncelle(etki1, etki2);

                    resim_sec_kullanici(2);
                    resim_sec_bilgisayar(bilgisayar.getMax());

                    eski_dayaniklilik_user = kullanici.nesneListesi_kullanici.get(2).dayaniklilik;
                    eski_dayaniklilik_pc = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).dayaniklilik;

                    Nesne eski_nesne_kullinici = kullanici.nesneListesi_kullanici.get(2);
                    Nesne eski_nesne_pc = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax());

                    kullanici.nesneListesi_kullanici.get(2).durumGuncelle(etki1, etki2, kullanici.nesneListesi_kullanici, 2);
                    bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).durumGuncelle(etki2, etki1, bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax());

                    String puangoster_kullanici = eski_nesne_kullinici.nesnePuaniGoster(kullanici.nesneListesi_kullanici, 2, etki1, eski_dayaniklilik_user);
                    String puangoster_pc = eski_nesne_pc.nesnePuaniGoster(bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax(), etki2, eski_dayaniklilik_pc);
                    jLabel10.setText(puangoster_kullanici);
                    jLabel9.setText(puangoster_pc);

                    int progres_bar_value3 = (int) kullanici.nesneListesi_kullanici.get(2).dayaniklilik;
                    jProgressBar3.setValue(progres_bar_value3);

                    if (kullanici.nesneListesi_kullanici.get(2).dayaniklilik == 0) {
                              durum2 = false;
                              false_sayisi++;
                    }
                    sayac++;

                    if (sayac >= sayac_kontrol) {
                              jButton1.setEnabled(durum1);
                              jButton2.setEnabled(durum2);
                              jButton3.setEnabled(durum3);
                              jButton4.setEnabled(durum4);
                              jButton5.setEnabled(durum5);
                              sayac = 0;
                              buton_isim();
                              sayac_kontrol = 5 - false_sayisi;
                    }
                    remove();
                    if (bilgisayar.getMax() == 0) {

                              bilgisayar.setMax(bilgisayar.nesneListesi_bilgisayar.size());
                    }

                    nesne_Bitim_Kontrol();

          }                                        

          private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         

                    bilgisayar.nesneSec(bilgisayar.getMax());
                    hamle_sayisi++;
                    jLabel5.setText(" ROUND: " + hamle_sayisi);

                    if (hamle_sayisi == son_hamle_sayisi) {
                              sayac = -1;
                              dayaniklilik_hesapla();
                    }

                    jButton4.setEnabled(durum);

                    double etki1 = kullanici.nesneListesi_kullanici.get(3).etkiHesapla(bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax());
                    double etki2 = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).etkiHesapla(kullanici.nesneListesi_kullanici, 3);

                    skor_guncelle(etki1, etki2);

                    resim_sec_kullanici(3);
                    resim_sec_bilgisayar(bilgisayar.getMax());

                    eski_dayaniklilik_user = kullanici.nesneListesi_kullanici.get(3).dayaniklilik;
                    eski_dayaniklilik_pc = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).dayaniklilik;

                    Nesne eski_nesne_kullinici = kullanici.nesneListesi_kullanici.get(3);
                    Nesne eski_nesne_pc = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax());

                    kullanici.nesneListesi_kullanici.get(3).durumGuncelle(etki1, etki2, kullanici.nesneListesi_kullanici, 3);
                    bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).durumGuncelle(etki2, etki1, bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax());

                    String puangoster_kullanici = eski_nesne_kullinici.nesnePuaniGoster(kullanici.nesneListesi_kullanici, 3, etki1, eski_dayaniklilik_user);
                    String puangoster_pc = eski_nesne_pc.nesnePuaniGoster(bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax(), etki2, eski_dayaniklilik_pc);
                    jLabel10.setText(puangoster_kullanici);
                    jLabel9.setText(puangoster_pc);

                    int progres_bar_value4 = (int) kullanici.nesneListesi_kullanici.get(3).dayaniklilik;
                    jProgressBar4.setValue(progres_bar_value4);

                    if (kullanici.nesneListesi_kullanici.get(3).dayaniklilik == 0) {
                              durum4 = false;
                              false_sayisi++;

                    }
                    sayac++;

                    if (sayac >= sayac_kontrol) {
                              jButton1.setEnabled(durum1);
                              jButton2.setEnabled(durum2);
                              jButton3.setEnabled(durum3);
                              jButton4.setEnabled(durum4);
                              jButton5.setEnabled(durum5);
                              sayac = 0;
                              buton_isim();
                              sayac_kontrol = 5 - false_sayisi;
                    }
                    remove();
                    if (bilgisayar.getMax() == 0) {

                              bilgisayar.setMax(bilgisayar.nesneListesi_bilgisayar.size());
                    }

                    nesne_Bitim_Kontrol();

          }                                        

          private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         

                    bilgisayar.nesneSec(bilgisayar.getMax());
                    hamle_sayisi++;
                    jLabel5.setText(" ROUND: " + hamle_sayisi);

                    if (hamle_sayisi == son_hamle_sayisi) {
                              sayac = -1;
                              dayaniklilik_hesapla();
                    }

                    jButton5.setEnabled(durum);

                    double etki1 = kullanici.nesneListesi_kullanici.get(4).etkiHesapla(bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax());
                    double etki2 = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).etkiHesapla(kullanici.nesneListesi_kullanici, 4);

                    skor_guncelle(etki1, etki2);

                    resim_sec_kullanici(4);
                    resim_sec_bilgisayar(bilgisayar.getMax());

                    eski_dayaniklilik_user = kullanici.nesneListesi_kullanici.get(4).dayaniklilik;
                    eski_dayaniklilik_pc = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).dayaniklilik;

                    Nesne eski_nesne_kullinici = kullanici.nesneListesi_kullanici.get(4);
                    Nesne eski_nesne_pc = bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax());

                    kullanici.nesneListesi_kullanici.get(4).durumGuncelle(etki1, etki2, kullanici.nesneListesi_kullanici, 4);
                    bilgisayar.nesneListesi_bilgisayar.get(bilgisayar.getMax()).durumGuncelle(etki2, etki1, bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax());

                    String puangoster_kullanici = eski_nesne_kullinici.nesnePuaniGoster(kullanici.nesneListesi_kullanici, 4, etki1, eski_dayaniklilik_user);
                    String puangoster_pc = eski_nesne_pc.nesnePuaniGoster(bilgisayar.nesneListesi_bilgisayar, bilgisayar.getMax(), etki2, eski_dayaniklilik_pc);
                    jLabel10.setText(puangoster_kullanici);
                    jLabel9.setText(puangoster_pc);

                    int progres_bar_value5 = (int) kullanici.nesneListesi_kullanici.get(4).dayaniklilik;
                    jProgressBar5.setValue(progres_bar_value5);

                    if (kullanici.nesneListesi_kullanici.get(4).dayaniklilik == 0) {
                              durum5 = false;
                              false_sayisi++;
                    }
                    sayac++;

                    if (sayac >= sayac_kontrol) {
                              jButton1.setEnabled(durum1);
                              jButton2.setEnabled(durum2);
                              jButton3.setEnabled(durum3);
                              jButton4.setEnabled(durum4);
                              jButton5.setEnabled(durum5);
                              sayac = 0;
                              buton_isim();
                              sayac_kontrol = 5 - false_sayisi;
                    }
                    remove();
                    if (bilgisayar.getMax() == 0) {

                              bilgisayar.setMax(bilgisayar.nesneListesi_bilgisayar.size());
                    }

                    nesne_Bitim_Kontrol();

          }                                        

          public void resim_sec_kullanici(int index) {

                    String nesne = kullanici.nesneListesi_kullanici.get(index).toString();
                    if (nesne.contains("Agir_Tas")) {
                              jLabel6.setIcon(new ImageIcon(image_agir_tas));
                    } else if (nesne.contains("Tas")) {
                              jLabel6.setIcon(new ImageIcon(image_tas));
                    } else if (nesne.contains("Ozel_Kagit")) {
                              jLabel6.setIcon(new ImageIcon(image_ozel_kagit));
                    } else if (nesne.contains("Kagit")) {
                              jLabel6.setIcon(new ImageIcon(image_kagit));
                    } else if (nesne.contains("Usta_Makas")) {
                              jLabel6.setIcon(new ImageIcon(image_usta_makas));
                    } else if (nesne.contains("Makas")) {
                              jLabel6.setIcon(new ImageIcon(image_makas));
                    }
          }

          public void resim_sec_bilgisayar(int index) {

                    String nesne = bilgisayar.nesneListesi_bilgisayar.get(index).toString();
                    if (nesne.contains("Agir_Tas")) {
                              jLabel7.setIcon(new ImageIcon(image_agir_tas));
                    } else if (nesne.contains("Tas")) {
                              jLabel7.setIcon(new ImageIcon(image_tas));
                    } else if (nesne.contains("Ozel_Kagit")) {
                              jLabel7.setIcon(new ImageIcon(image_ozel_kagit));
                    } else if (nesne.contains("Kagit")) {
                              jLabel7.setIcon(new ImageIcon(image_kagit));
                    } else if (nesne.contains("Usta_Makas")) {
                              jLabel7.setIcon(new ImageIcon(image_usta_makas));
                    } else if (nesne.contains("Makas")) {
                              jLabel7.setIcon(new ImageIcon(image_makas));
                    }
          }

          public void nesne_Bitim_Kontrol() {
                    if (bilgisayar.nesneListesi_bilgisayar.size() == 0 || sayac_kontrol == 0) {
                              sayac = 0;
                              dayaniklilik_hesapla();
                    }

          }

          public void remove() {
                    for (int a = 0; a < bilgisayar.nesneListesi_bilgisayar.size(); a++) {
                              if (bilgisayar.nesneListesi_bilgisayar.get(a).dayaniklilik <= 0) {
                                        bilgisayar.nesneListesi_bilgisayar.remove(a);
                              }
                    }
          }

          public void dayaniklilik_hesapla() {
                    double kullanici_dayaniklilik_toplam = 0;
                    double bilgisayar_dayaniklilik_toplam = 0;
                    for (int i = 0; i < kullanici.nesneListesi_kullanici.size(); i++) {
                              kullanici_dayaniklilik_toplam += kullanici.nesneListesi_kullanici.get(i).dayaniklilik;
                    }
                    for (int j = 0; j < bilgisayar.nesneListesi_bilgisayar.size(); j++) {
                              bilgisayar_dayaniklilik_toplam += bilgisayar.nesneListesi_bilgisayar.get(j).dayaniklilik;
                    }

                    if (kullanici_dayaniklilik_toplam > bilgisayar_dayaniklilik_toplam) {
                              JOptionPane.showMessageDialog(null, "Oyun bitti\nKullanıcı dayanıklılık: " + kullanici_dayaniklilik_toplam + "\nBilgisayar dayanıklılık: " + bilgisayar_dayaniklilik_toplam
                                      + "\nKAZANAN KULLANICI");
                    } else if (kullanici_dayaniklilik_toplam < bilgisayar_dayaniklilik_toplam) {
                              JOptionPane.showMessageDialog(null, "Oyun bitti\nKullanıcı dayanıklılık: " + kullanici_dayaniklilik_toplam + "\nBilgisayar dayanıklılık: " + bilgisayar_dayaniklilik_toplam
                                      + "\nKAZANAN BİLGİSAYAR");
                    } else {
                              JOptionPane.showMessageDialog(null, "Oyun bitti\nKullanıcı dayanıklılık: " + kullanici_dayaniklilik_toplam + "\nBilgisayar dayanıklılık: " + bilgisayar_dayaniklilik_toplam
                                      + "\n BERABERE");
                    }
                    dispose();
                    sifirlama();
                    Arayuz arayuz1 = new Arayuz();
                    arayuz1.setVisible(true);
          }

          public void sifirlama() {
                    kullanici_Bilgisayar.sayac = 0;
                    kullanici_Bilgisayar.setTas_sayisi(0);
                    kullanici_Bilgisayar.setMakas_sayisi(0);
                    kullanici_Bilgisayar.setKagit_sayisi(0);

                    durum = false;
                    durum1 = true;
                    durum2 = true;
                    durum3 = true;
                    durum4 = true;
                    durum5 = true;
                    sayac_kontrol = 5;
                    kullanici_skor = 0;
                    bilgisayar_skor = 0;
                    hamle_sayisi = 0;
                    son_hamle_sayisi = 0;
                    false_sayisi = 0;
          }

          public void skor_guncelle(double etki1, double etki2) {
                    if (etki1 == etki2) {
                    } else if (etki1 > etki2) {
                              kullanici_skor++;
                              String kullanici_skor_string = Integer.toString(kullanici_skor);
                              jLabel2.setText(kullanici_skor_string);
                    } else {
                              bilgisayar_skor++;
                              String bilgisayar_skor_string = Integer.toString(bilgisayar_skor);
                              jLabel1.setText(bilgisayar_skor_string);
                    }
          }

          public void nesne_olustur2(int tas_sayisi, int kagit_sayisi, int makas_sayisi) {

                    kullanici.nesneListesi_kullanici.clear();
                    bilgisayar.nesneListesi_bilgisayar.clear();

                    Tas[] taslar = new Tas[tas_sayisi];
                    for (int i = 0; i < tas_sayisi; i++) {
                              taslar[i] = new Tas(20, 0, 2);
                              kullanici.nesneListesi_kullanici.add(taslar[i]);
                    }

                    Kagit[] kagitlar = new Kagit[kagit_sayisi];
                    for (int i = 0; i < kagit_sayisi; i++) {
                              kagitlar[i] = new Kagit(20, 0, 2);
                              kullanici.nesneListesi_kullanici.add(kagitlar[i]);
                    }

                    Makas[] makaslar = new Makas[makas_sayisi];

                    for (int i = 0; i < makas_sayisi; i++) {
                              makaslar[i] = new Makas(20, 0, 2);
                              kullanici.nesneListesi_kullanici.add(makaslar[i]);
                    }

                    Random random = new Random();
                    Tas[] taslar_pc = new Tas[5];
                    Makas[] makas_pc = new Makas[5];
                    Kagit[] kagit_pc = new Kagit[5];
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

                    jLabel1.setText("0");;
                    jLabel2.setText("0");;

          }

          public void buton_isim() {
                    ArrayList<String> button_adi = new ArrayList<String>();

                    for (int i = 0; i < kullanici.nesneListesi_kullanici.size(); i++) {
                              if (kullanici.nesneListesi_kullanici.get(i).toString().contains("Agir_Tas")) {
                                        button_adi.add("Ağır Taş");
                              } else if (kullanici.nesneListesi_kullanici.get(i).toString().contains("Usta_Makas")) {
                                        button_adi.add("Usta Makas");
                              } else if (kullanici.nesneListesi_kullanici.get(i).toString().contains("Ozel_Kagit")) {
                                        button_adi.add("Özel Kağıt");
                              } else if (kullanici.nesneListesi_kullanici.get(i).toString().contains("Tas")) {
                                        button_adi.add("Tas");
                              } else if (kullanici.nesneListesi_kullanici.get(i).toString().contains("Kagit")) {
                                        button_adi.add("Kağıt");
                              } else if (kullanici.nesneListesi_kullanici.get(i).toString().contains("Makas")) {
                                        button_adi.add("Makas");
                              }
                    }

                    jButton3.setText(button_adi.get(0));
                    jButton1.setText(button_adi.get(1));
                    jButton2.setText(button_adi.get(2));
                    jButton4.setText(button_adi.get(3));
                    jButton5.setText(button_adi.get(4));
                    button_adi.clear();
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
                              java.util.logging.Logger.getLogger(Oyun_I.class
                                      .getName()).log(java.util.logging.Level.SEVERE, null, ex);

                    } catch (InstantiationException ex) {
                              java.util.logging.Logger.getLogger(Oyun_I.class
                                      .getName()).log(java.util.logging.Level.SEVERE, null, ex);

                    } catch (IllegalAccessException ex) {
                              java.util.logging.Logger.getLogger(Oyun_I.class
                                      .getName()).log(java.util.logging.Level.SEVERE, null, ex);

                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                              java.util.logging.Logger.getLogger(Oyun_I.class
                                      .getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }

                    java.awt.EventQueue.invokeLater(new Runnable() {
                              public void run() {
                              }
                    });
          }


          // Variables declaration - do not modify                     
          private javax.swing.ButtonGroup buttonGroup1;
          private javax.swing.JButton jButton1;
          private javax.swing.JButton jButton2;
          private javax.swing.JButton jButton3;
          private javax.swing.JButton jButton4;
          private javax.swing.JButton jButton5;
          private javax.swing.JLabel jLabel1;
          private javax.swing.JLabel jLabel10;
          private javax.swing.JLabel jLabel11;
          private javax.swing.JLabel jLabel2;
          private javax.swing.JLabel jLabel3;
          private javax.swing.JLabel jLabel4;
          private javax.swing.JLabel jLabel5;
          private javax.swing.JLabel jLabel6;
          private javax.swing.JLabel jLabel7;
          private javax.swing.JLabel jLabel9;
          private javax.swing.JProgressBar jProgressBar1;
          private javax.swing.JProgressBar jProgressBar2;
          private javax.swing.JProgressBar jProgressBar3;
          private javax.swing.JProgressBar jProgressBar4;
          private javax.swing.JProgressBar jProgressBar5;
          // End of variables declaration                   
}