package prolab2;

import java.util.*;

public class Bilgisayar extends Oyuncu {

          public Bilgisayar(int oyuncuID, int skor, String oyuncuAdi) {
                    super(oyuncuID, skor, oyuncuAdi);
                    this.oyuncuID = oyuncuID;
                    this.skor = skor;
                    this.oyuncuAdi = oyuncuAdi;
          }

          public Bilgisayar() {

          }

          ArrayList<Nesne> nesneListesi_bilgisayar = new ArrayList<Nesne>();

          private static int max = 5;
          private static int max2 = 5;

          @Override
          public void nesneSec(int max) {//random şekilde nesne oluşturma kısmını anlamadım

                    int sayi = 0;
                    Random random = new Random();

                    ArrayList<Nesne> tmp = new ArrayList<Nesne>();
                    sayi = random.nextInt(0, max);
                    tmp.add(nesneListesi_bilgisayar.get(max - 1));
                    nesneListesi_bilgisayar.set(max - 1, nesneListesi_bilgisayar.get(sayi));
                    nesneListesi_bilgisayar.set(sayi, tmp.get(0));
                    tmp.clear();
                    if (oyuncuID == 1) {
                              setMax(getMax() - 1);
                    } else {
                              setMax2(getMax2() - 1);
                    }

          }

          public static int getMax() {
                    return max;
          }

          public static void setMax(int aMax) {
                    max = aMax;
          }

          public static int getMax2() {
                    return max2;
          }

          public static void setMax2(int aMax2) {
                    max2 = aMax2;
          }

}
