package prolab2;

import java.util.*;

public class Kullanici extends Oyuncu {

          public Kullanici(int oyuncuID, int skor, String oyuncuAdi) {
                    super(oyuncuID, skor, oyuncuAdi);
                    this.oyuncuID = oyuncuID;
                    this.skor = skor;
                    this.oyuncuAdi = oyuncuAdi;
          }

          public Kullanici() {

          }

          ArrayList<Nesne> nesneListesi_kullanici = new ArrayList<Nesne>();

          @Override
          public void nesneSec(int max) {

          }

          public void Nesne_Goster() {

                    System.out.println(nesneListesi_kullanici.get(0).dayaniklilik);

          }

}