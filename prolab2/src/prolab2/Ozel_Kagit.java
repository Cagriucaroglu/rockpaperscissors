package prolab2;

import java.util.ArrayList;

public class Ozel_Kagit extends Kagit {

          int kalinlik;

          public Ozel_Kagit() {
          }

          public Ozel_Kagit(double dayaniklilik, int seviyePuani, int nufuz, int kalinlik) {
                    super(dayaniklilik, seviyePuani, nufuz);
                    this.dayaniklilik = dayaniklilik;
                    this.seviyePuani = seviyePuani;
                    this.nufuz = nufuz;
                    this.kalinlik = kalinlik;
          }

          @Override
          public String nesnePuaniGoster(ArrayList<Nesne> nesneler, int index, double etki, double eski_dayaniklilik_user) {

                    String text;
                    text = "<html>&nbsp;&emsp;&emsp;&emsp;ÖZEL KAĞIT<br/>&emsp;&emsp;Seviye Puanı: " + nesneler.get(index).seviyePuani
                            + "<br/>Dayanıklılık: " + eski_dayaniklilik_user + " -> " + nesneler.get(index).dayaniklilik + "<br/>&ensp;&nbsp;Round Etki Puanı: " + etki + "</html>";
                    return text;
          }

          @Override
          public double etkiHesapla(ArrayList<Nesne> nesneler, int index) {

                    double Ozel_kagit_etkisi = 0;
                    double a = 0.2;

                    if (nesneler.get(index).toString().contains("Tas")) {

                              Tas tas = (Tas) nesneler.get(index);
                              Ozel_kagit_etkisi = (nufuz * kalinlik) / (a * tas.katilik);

                    } else if (nesneler.get(index).toString().contains("Agir_Tas")) {

                              Agir_Tas agir_Tas = (Agir_Tas) nesneler.get(index);
                              Ozel_kagit_etkisi = (nufuz * kalinlik) / (a * agir_Tas.katilik * agir_Tas.sicaklik);

                    } else if (nesneler.get(index).toString().contains("Kagit")) {

                              Ozel_kagit_etkisi = (nufuz * kalinlik) / ((1 - a) * nufuz);

                    } else if (nesneler.get(index).toString().contains("Ozel_Kagit")) {

                              Ozel_kagit_etkisi = (nufuz * kalinlik) / ((1 - a) * nufuz * kalinlik);

                    } else if (nesneler.get(index).toString().contains("Makas")) {

                              Makas makas = (Makas) nesneler.get(index);
                              Ozel_kagit_etkisi = (nufuz * kalinlik) / ((1 - a) * makas.keskinlik);

                    } else if (nesneler.get(index).toString().contains("Usta_Makas")) {

                              Usta_Makas usta_Makas = (Usta_Makas) nesneler.get(index);
                              Ozel_kagit_etkisi = (nufuz * kalinlik) / ((1 - a) * usta_Makas.keskinlik * usta_Makas.direnc);

                    }
                    return Ozel_kagit_etkisi;
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
