package Sinav;

import java.util.Scanner;

public class OgrenciOzelListe {
    Scanner sc = new Scanner(System.in);
    String[] ogrenciDizi;
    int boyut = 0;

    public void add(String ogrenciAdi) {
        String[] tmp;
        if (ogrenciDizi == null) {
            ogrenciDizi = new String[1];
            ogrenciDizi[0] = ogrenciAdi;
        } else {
            tmp = new String[boyut + 1];
            for (int i = 0; i < boyut; i++) {
                tmp[i] = ogrenciDizi[i];
            }
            tmp[boyut] = ogrenciAdi;
            ogrenciDizi = tmp;
        }
        boyut++;
    }

    public String[] getlist() {
        return ogrenciDizi;
    }
}
