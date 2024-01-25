package HesapMakinesi;

import java.util.Scanner;

public class HesapM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.print("İşlem Seçiniz:");
        System.out.println("***** İşlemler *****");
        System.out.println("Toplama için 1'e\n" +
                "Çıkarma için 2'ye\n" +
                "Çarpma için 3'e\n" +
                "Bölme için 4'e \n" +
                "Çıkış için 0'ya basınız.");
        int islemler = scanner.nextInt();

        switch (islemler){
            case 1:
                int toplam=sayi1+sayi2;
                System.out.print("Sayıların toplamı: " + toplam);
                break;
            case 2:
                int fark=sayi1-sayi2;
                System.out.print("Sayıların farkı: " + fark);
                break;
            case 3:
                int carpma=sayi1*sayi2;
                System.out.print("Sayıların çarpımı: " + carpma);
                break;
            case 4:
                int bolme=sayi1/sayi2;
                System.out.print("Sayıların bölümü: " + bolme);
                break;
            case 5:
                break;
        }





    }
}
