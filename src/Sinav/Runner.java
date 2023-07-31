package Sinav;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        OgrenciOzelListe ogrenciDizi = new OgrenciOzelListe();
        Scanner sc = new Scanner(System.in);
        int secim = 0;
        int ogrenciSayisi = 0;
        boolean kontrol=true;
        boolean[] yurumeHobi;
        boolean[] kitapOkumaHobi;
        boolean[] sporHobi;
        boolean[] kodYazmaHobi;

        while (kontrol) {
            System.out.println("MENÜ");
            System.out.println("1- Sınıf arkadaşı tanımla");
            System.out.println("2- Hobilerini gir");
            System.out.println("3- Maaş beklentilerini gir");
            System.out.println("4- Sınıf listesi");
            System.out.println("0- ÇIKIŞ");
            secim = sc.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Kaç öğrenci tanımlayacaksınız? : ");
                    ogrenciSayisi = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < ogrenciSayisi; i++) {
                        System.out.println((i + 1) + ". Öğrencinin adı: ");
                        String ogrenciAdi = sc.nextLine();
                        ogrenciDizi.add(ogrenciAdi);
                    }
                    break;

                case 2:
                    yurumeHobi = new boolean[ogrenciSayisi];
                    kitapOkumaHobi = new boolean[ogrenciSayisi];
                    sporHobi = new boolean[ogrenciSayisi];
                    kodYazmaHobi = new boolean[ogrenciSayisi];

                    System.out.println("Öğrencilerin hobilerini giriniz: ");

                    for (int i = 0; i < ogrenciSayisi; i++) {
                        System.out.println(ogrenciDizi.getlist()[i] + " için hobilerini giriniz (true/false): ");
                        System.out.print("Yürümekten hoşlanır mısın? ");
                        yurumeHobi[i] = sc.nextBoolean();
                        System.out.print("Kitap okumaktan hoşlanır mısın? ");
                        kitapOkumaHobi[i] = sc.nextBoolean();
                        System.out.print("Spor rutinlerin var mı? ");
                        sporHobi[i] = sc.nextBoolean();
                        System.out.print("Kod yazmaktan hoşlanır mısın? ");
                        kodYazmaHobi[i] = sc.nextBoolean();
                        sc.nextLine();
                    }

                    break;

                case 3:
                    for (int i = 0; i < ogrenciSayisi; i++) {
                        System.out.print("Maaş beklentisi giriniz: ");
                        double maas = sc.nextDouble();
                        sc.nextLine();
                        System.out.println(ogrenciDizi.getlist()[i] + "'nın maaş beklentisi: " + maas);
                    }

                    break;

                case 4:
                	//olmadı hocam
                    break;

                case 0:
                    System.out.println("ÇIKIŞ");
                    kontrol=false;
                    break;

                default:
                    System.err.println("Geçerli bir seçim yapınız.");
            }
        }
    }
}
