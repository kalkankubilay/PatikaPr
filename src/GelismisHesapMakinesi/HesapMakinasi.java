package GelismisHesapMakinesi;

import java.util.Scanner;

public class HesapMakinasi {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println(""" 
                1.Toplama İşlemi
                2.Çıkarma İşlemi
                3.Çarpma İşlemi
                4.Bölme İşlemi
                5.Üslü Sayı Hesaplama
                6.Mod Alma
                7.Dikdörtgen Alan ve Çevre Hesaplama
                8.Çıkış """);

        System.out.println("******************");
        System.out.print("İşlem seçiniz:");
        int islem = scanner.nextInt();

        System.out.print("İşlem yapmak istediğiniz değerleri giriniz: ");
        int ilkDeger = scanner.nextInt(), ikinciDeger = scanner.nextInt();

        switch (islem){
            case 1:
                System.out.println("Toplama işlemi sonucu: "+ toplamaIslemi(ilkDeger,ikinciDeger));
                break;

            case 2:
                System.out.println("Çıkarma işlemi sonucu: " +cikarmaIslemi(ilkDeger,ikinciDeger));
                break;

            case 3:
                System.out.println("Çarpma işlemi sonucu: "+carpmaIslemi(ilkDeger,ikinciDeger));
                break;
            case 4:
                System.out.println("Bölem işlemi sonucu: "+ bolmeIslemi(ilkDeger,ikinciDeger));
                break;
            case 5:
                System.out.println("Üs hesaplama sonucu: "+usAlmaIslemi(ilkDeger,ikinciDeger));
                break;
            case 6:
                System.out.println("Mod hesaplama: "+modAlmaIslemi(ilkDeger,ikinciDeger));
                break;
            case 7:
                System.out.println("Alan, çevre hesaplama sonucu: "+alanCevreIslemi(ilkDeger,ikinciDeger));
                break;
            case 8:
                break;

        }



    }

    public static int toplamaIslemi(int a, int b) {
        return a + b;
    }

    public static int cikarmaIslemi(int a, int b) {
        return a - b;
    }
    public static int carpmaIslemi(int a, int b) {
        return a * b;
    }
    public static double bolmeIslemi(int a, int b) {
        if (b==0){
            System.out.println("Bölen 0 olamaz.");
            return 0;
        }
        return (double) a / b;
    }
    public static double usAlmaIslemi(int a, int b) {
        return Math.pow(a,b);
    }
    public static int modAlmaIslemi(int a, int b) {
        return a % b;
    }
    public static String alanCevreIslemi(int a, int b) {
        int alan = a * b;
        int cevre = 2 * (a + b);
        return "Alan: " + alan + ", Çevre: " + cevre;
    }




}
