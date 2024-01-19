package Daire;

import java.util.Scanner;

public class DaireHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenizin yarıçapını giriniz: ");
        int yaricap = scanner.nextInt();
        double pi = 3.14;
        double alan = pi*yaricap*yaricap;
        double cevre = 2*pi*yaricap;
        System.out.print("Dairenin alaı: " + alan);
        System.out.println(" ");
        System.out.print("Dairenin çevresi: " + cevre);


    }
}
