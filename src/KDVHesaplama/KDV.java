package KDVHesaplama;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kdv hesaplanıcak tutarı giriniz: ");
        double tutar = scanner.nextDouble();

        double kdvTutari = (tutar*18)/100;
        double kdvliTutar = tutar + kdvTutari;

        System.out.print("KDV'li tutar: " + kdvliTutar);


    }
}
