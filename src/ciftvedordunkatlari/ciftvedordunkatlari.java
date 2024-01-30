package ciftvedordunkatlari;

import java.util.Scanner;

public class ciftvedordunkatlari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        int toplam=0;

        do {

            System.out.print("Sayı giriniz: ");
            i = scanner.nextInt();

            if(i%4==0){
                toplam += i;
            }

        }while (i%2==0);

        System.out.println("toplamı: " + toplam);
    }
}
