package Taksimetre;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kmBasina = 2.20;
        double total = 10;

        System.out.print("Kaç km gidileceğini giriniz: ");
        double km = scanner.nextDouble();

        total += (km * kmBasina);

        if (total<=20){
            System.out.print("Ödenmesi gereken tutar: 20TL");
        } else if (total >20) {
            System.out.print("Ödenmesi gereken tutar: " + total);
        }



    }
}
