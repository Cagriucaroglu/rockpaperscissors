package prolab2;

import java.util.ArrayList;

public class Usta_Makas extends Makas {

          int direnc;

          public Usta_Makas() {
          }

          public Usta_Makas(double dayaniklilik, int seviyePuani, int keskinlik, int direnc) {
                    super(dayaniklilik, seviyePuani, keskinlik);
                    this.dayaniklilik = dayaniklilik;
                    this.seviyePuani = seviyePuani;
                    this.keskinlik = keskinlik;
                    this.direnc = direnc;
          }

          @Override
          public String nesnePuaniGoster(ArrayList<Nesne> nesneler, int index, double etki, double eski_dayaniklilik_user) {

                    String text;
                    text = "<html>&emsp;&emsp;&emsp;USTA MAKAS<br/>&emsp;&emsp;Seviye Puanı: " + nesneler.get(index).seviyePuani
                            + "<br/>Dayanıklılık: " + eski_dayaniklilik_user + " -> " + nesneler.get(index).dayaniklilik + "<br/>&ensp;&nbsp;Round Etki Puanı: " + etki + "</html>";
                    return text;
          }

          @Override
          public double etkiHesapla(ArrayList<Nesne> nesneler, int index) {

                    double usta_makas_etkisi = 0;
                    double a = 0.2;

                    if (nesneler.get(index).toString().contains("Tas")) {

                              Tas tas = (Tas) nesneler.get(index);
                              usta_makas_etkisi = (keskinlik * direnc) / ((1 - a) * tas.katilik);

                    } else if (nesneler.get(index).toString().contains("Agir_Tas")) {

                              Agir_Tas agir_Tas = (Agir_Tas) nesneler.get(index);
                              usta_makas_etkisi = (keskinlik * direnc) / ((1 - a) * agir_Tas.katilik * agir_Tas.sicaklik);

                    } else if (nesneler.get(index).toString().contains("Kagit")) {

                              Kagit kagit = (Kagit) nesneler.get(index);
                              usta_makas_etkisi = (keskinlik * direnc) / (a * kagit.nufuz);

                    } else if (nesneler.get(index).toString().contains("Ozel_Kagit")) {

                              Ozel_Kagit ozel_Kagit = (Ozel_Kagit) nesneler.get(index);
                              usta_makas_etkisi = (keskinlik * direnc) / (a * ozel_Kagit.nufuz * ozel_Kagit.kalinlik);

                    } else if (nesneler.get(index).toString().contains("Makas")) {

                              usta_makas_etkisi = (keskinlik * direnc) / ((1 - a) * keskinlik);

                    } else if (nesneler.get(index).toString().contains("Usta_Makas")) {

                              usta_makas_etkisi = (keskinlik * direnc) / ((1 - a) * keskinlik * direnc);

                    }
                    return usta_makas_etkisi;
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