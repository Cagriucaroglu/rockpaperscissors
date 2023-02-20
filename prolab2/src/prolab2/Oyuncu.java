package prolab2;

import java.util.*;

public abstract class Oyuncu {

          int oyuncuID, skor;
          String oyuncuAdi;

          public Oyuncu() {

          }

          public Oyuncu(int oyuncuID, int skor, String oyuncuAdi) {
                    this.oyuncuID = oyuncuID;
                    this.skor = skor;
                    this.oyuncuAdi = oyuncuAdi;
          }

          public abstract void nesneSec(int max);

          public void SkorGoster() {

          }

}