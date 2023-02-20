package prolab2;

import java.util.ArrayList;

public class Agir_Tas extends Tas {

          int sicaklik;

          public Agir_Tas() {
          }

          public Agir_Tas(double dayaniklilik, int seviyePuani, int katilik, int sicaklik) {
                    super(dayaniklilik, seviyePuani, katilik);
                    this.sicaklik = sicaklik;
                    this.dayaniklilik = dayaniklilik;
                    this.seviyePuani = seviyePuani;
                    this.katilik = katilik;
          }

          @Override
          public String nesnePuaniGoster(ArrayList<Nesne> nesneler, int index, double etki, double eski_dayaniklilik_user) {

                    String text;
                    text = "<html>&ensp;&emsp;&emsp;&emsp;AĞIR TAŞ<br/>&emsp;&emsp;Seviye Puanı: " + nesneler.get(index).seviyePuani
                            + "<br/>Dayanıklılık: " + eski_dayaniklilik_user + " -> " + nesneler.get(index).dayaniklilik + "<br/>&ensp;&nbsp;Round Etki Puanı: " + etki + "</html>";
                    return text;
          }

          @Override
          public double etkiHesapla(ArrayList<Nesne> nesneler, int index) {

                    double agir_tas_etkisi = 0;
                    double a = 0.2;

                    if (nesneler.get(index).toString().contains("Tas")) {

                              agir_tas_etkisi = (katilik * sicaklik) / ((1 - a) * katilik);

                    } else if (nesneler.get(index).toString().contains("Agir_Tas")) {

                              agir_tas_etkisi = (katilik * sicaklik) / ((1 - a) * katilik * sicaklik);

                    } else if (nesneler.get(index).toString().contains("Kagit")) {

                              Kagit kagit = (Kagit) nesneler.get(index);
                              agir_tas_etkisi = (katilik * sicaklik) / ((1 - a) * kagit.nufuz);

                    } else if (nesneler.get(index).toString().contains("Ozel_Kagit")) {

                              Ozel_Kagit ozel_Kagit = (Ozel_Kagit) nesneler.get(index);
                              agir_tas_etkisi = (katilik * sicaklik) / ((1 - a) * ozel_Kagit.nufuz * ozel_Kagit.kalinlik);

                    } else if (nesneler.get(index).toString().contains("Makas")) {

                              Makas makas = (Makas) nesneler.get(index);
                              agir_tas_etkisi = (katilik * sicaklik) / (a * makas.keskinlik);

                    } else if (nesneler.get(index).toString().contains("Usta_Makas")) {

                              Usta_Makas usta_Makas = (Usta_Makas) nesneler.get(index);
                              agir_tas_etkisi = (katilik * sicaklik) / (a * usta_Makas.keskinlik * usta_Makas.direnc);
                    }
                    return agir_tas_etkisi;

          }

          @Override
          public void durumGuncelle(double etki, double etki2, ArrayList<Nesne> List, int index) {

                    dayaniklilik = dayaniklilik - etki2;
                    if (dayaniklilik <= 0) {
                              dayaniklilik = 0;
                    }
                    if (etki > etki2) {
                              seviyePuani = seviyePuani + 20;
                    }
          }

}