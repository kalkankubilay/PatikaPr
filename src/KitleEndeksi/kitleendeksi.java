package KitleEndeksi;

import java.util.Scanner;

public class kitleendeksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        double boy = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        double indeks = kilo / (boy*boy);
        System.out.println("Kitle indeksiniz: " + indeks);


    }
}
