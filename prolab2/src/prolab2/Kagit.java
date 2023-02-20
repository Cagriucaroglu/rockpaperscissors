package prolab2;

import java.util.ArrayList;

public class Kagit extends Nesne {

          int nufuz;

          public Kagit() {

          }

          public Kagit(double dayaniklilik, int seviyePuani, int nufuz) {
                    super(dayaniklilik, seviyePuani);
                    this.dayaniklilik = dayaniklilik;
                    this.seviyePuani = seviyePuani;
                    this.nufuz = nufuz;
          }

          @Override
          public String nesnePuaniGoster(ArrayList<Nesne> nesneler, int index, double etki, double eski_dayaniklilik_user) {

                    String text;
                    text = "<html>&emsp;&emsp;&emsp;&emsp;KAĞIT<br/>&emsp;&emsp;Seviye Puanı: " + nesneler.get(index).seviyePuani
                            + "<br/>Dayanıklılık: " + eski_dayaniklilik_user + " -> " + nesneler.get(index).dayaniklilik + "<br/>&ensp;&nbsp;Round Etki Puanı: " + etki + "</html>";
                    return text;
          }

          @Override
          public double etkiHesapla(ArrayList<Nesne> nesneler, int index) {
                    double kagit_etkisi = 0;
                    double a = 0.2;

                    if (nesneler.get(index).toString().contains("Tas")) {

                              Tas tas = (Tas) nesneler.get(index);
                              kagit_etkisi = nufuz / (a * tas.katilik);

                    } else if (nesneler.get(index).toString().contains("Agir_Tas")) {

                              Agir_Tas agir_Tas = (Agir_Tas) nesneler.get(index);
                              kagit_etkisi = nufuz / (a * agir_Tas.katilik * agir_Tas.sicaklik);

                    } else if (nesneler.get(index).toString().contains("Kagit")) {

                              kagit_etkisi = nufuz / ((1 - a) * nufuz);

                    } else if (nesneler.get(index).toString().contains("Ozel_Kagit")) {

                              Ozel_Kagit ozel_Kagit = (Ozel_Kagit) nesneler.get(index);
                              kagit_etkisi = nufuz / ((1 - a) * nufuz * ozel_Kagit.kalinlik);

                    } else if (nesneler.get(index).toString().contains("Makas")) {

                              Makas makas = (Makas) nesneler.get(index);
                              kagit_etkisi = nufuz / ((1 - a) * makas.keskinlik);

                    } else if (nesneler.get(index).toString().contains("Usta_Makas")) {

                              Usta_Makas usta_Makas = (Usta_Makas) nesneler.get(index);
                              kagit_etkisi = nufuz / ((1 - a) * usta_Makas.keskinlik * usta_Makas.direnc);

                    }
                    return kagit_etkisi;
          }

          @Override
          public void durumGuncelle(double etki, double etki2, ArrayList<Nesne> List, int index) {

                    dayaniklilik = dayaniklilik - etki2;
                    if (dayaniklilik <= 0) {
                              dayaniklilik = 0;
                    }
                    if (etki > etki2) {
                              seviyePuani = seviyePuani + 20;
                              if (seviyePuani > 30) {
                                        Ozel_Kagit ozel_Kagit = new Ozel_Kagit(dayaniklilik, seviyePuani, 2, 2);
                                        List.set(index, ozel_Kagit);
                              }
                    }
          }
}