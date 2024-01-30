package Uslusayi;

import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 1;

        System.out.print("Üssü alıncak sayıyı giriniz: ");
        int sayi = scanner.nextInt();

        System.out.print("Üssünü giriniz: ");
        int us = scanner.nextInt();

        for (int i=1; i<=us; i++){
            total *=sayi;
        }

        System.out.println("Sonuç: " + total);

    }
}
