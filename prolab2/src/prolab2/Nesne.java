package prolab2;

import java.util.*;

public abstract class Nesne {

          double dayaniklilik;
          int seviyePuani;

          public Nesne() {

          }

          public Nesne(double dayaniklilik, int seviyePuani) {
                    this.dayaniklilik = dayaniklilik;
                    this.seviyePuani = seviyePuani;
          }

          public abstract String nesnePuaniGoster(ArrayList<Nesne> nesneler, int index, double etki, double eski_dayaniklilik_user);

          public abstract double etkiHesapla(ArrayList<Nesne> nesneler, int index);

          public abstract void durumGuncelle(double etki, double etki2, ArrayList<Nesne> List, int index);
}

