package prolab2;

import java.util.ArrayList;

public class Tas extends Nesne {

          int katilik;

          public Tas() {

          }

          public Tas(double dayaniklilik, int seviyePuani, int katilik) {
                    super(dayaniklilik, seviyePuani);
                    this.katilik = katilik;
                    this.dayaniklilik = dayaniklilik;
                    this.seviyePuani = seviyePuani;
          }

          @Override
          public String nesnePuaniGoster(ArrayList<Nesne> nesneler, int index, double etki, double eski_dayaniklilik_user) {

                    String text;
                    text = "<html>&emsp;&ensp;&emsp;&emsp;&emsp;TAŞ<br/>&emsp;&emsp;Seviye Puanı: " + nesneler.get(index).seviyePuani
                            + "<br/>Dayanıklılık: " + eski_dayaniklilik_user + " -> " + nesneler.get(index).dayaniklilik + "<br/>&ensp;&nbsp;Round Etki Puanı: " + etki + "</html>";
                    return text;
          }

          @Override
          public double etkiHesapla(ArrayList<Nesne> nesneler, int index) {

                    double tas_etkisi = 0;
                    double a = 0.2;

                    if (nesneler.get(index).toString().contains("Tas")) {

                              tas_etkisi = katilik / ((1 - a) * katilik);

                    } else if (nesneler.get(index).toString().contains("Agir_Tas")) {

                              Agir_Tas agir_Tas = (Agir_Tas) nesneler.get(index);
                              tas_etkisi = katilik / ((1 - a) * katilik * agir_Tas.sicaklik);

                    } else if (nesneler.get(index).toString().contains("Kagit")) {

                              Kagit kagit = (Kagit) nesneler.get(index);
                              tas_etkisi = katilik / ((1 - a) * kagit.nufuz);

                    } else if (nesneler.get(index).toString().contains("Ozel_Kagit")) {

                              Ozel_Kagit ozel_Kagit = (Ozel_Kagit) nesneler.get(index);
                              tas_etkisi = katilik / ((1 - a) * ozel_Kagit.nufuz * ozel_Kagit.kalinlik);

                    } else if (nesneler.get(index).toString().contains("Makas")) {

                              Makas makas = (Makas) nesneler.get(index);// = den sonraki kısımı tam anlamadım
                              tas_etkisi = katilik / (a * makas.keskinlik);

                    } else if (nesneler.get(index).toString().contains("Usta_Makas")) {

                              Usta_Makas usta_Makas = (Usta_Makas) nesneler.get(index);
                              tas_etkisi = katilik / (a * usta_Makas.keskinlik * usta_Makas.direnc);

                    }
                    return tas_etkisi;
          }

          @Override
          public void durumGuncelle(double etki1, double etki2, ArrayList<Nesne> List, int index) {

                    dayaniklilik = dayaniklilik - etki2;
                    if (dayaniklilik <= 0) {
                              dayaniklilik = 0;
                    }

                    if (etki1 > etki2) {

                              seviyePuani = seviyePuani + 20;
                              if (seviyePuani > 30) {
                                        Agir_Tas agir_Tas = new Agir_Tas(dayaniklilik, seviyePuani, 2, 2);
                                        List.set(index, agir_Tas);
                              }

                    }
          }

}
