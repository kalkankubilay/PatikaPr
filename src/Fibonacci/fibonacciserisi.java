package Fibonacci;

import java.util.Scanner;

public class fibonacciserisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisi eleman sayısını giriniz: ");
        int elemanSayisi = scanner.nextInt();

        int ilkEleman = 0;
        int ikinciEleman = 1;

        System.out.print("Fibonacci Serisi: " + ilkEleman + ", " + ikinciEleman);

        for (int i = 2; i < elemanSayisi; i++) {
            int sonrakiEleman = ilkEleman + ikinciEleman;
            System.out.print(", " + sonrakiEleman);

            ilkEleman = ikinciEleman;
            ikinciEleman = sonrakiEleman;
        }
    }
}

