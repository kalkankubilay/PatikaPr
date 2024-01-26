package BuyuktenKucugeSiralama;

import java.util.Scanner;

public class siralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        if ((sayi1 > sayi2) && (sayi1 > sayi3)){
            if (sayi2>sayi3){
                System.out.println("sayi1 > sayi2 > sayı3");
            }
            else{
                System.out.println("sayi1 > sayi3 > sayi2");
            }
        }
        else if ((sayi2 > sayi1) && (sayi2 > sayi3)){
            if (sayi1 > sayi3){
                System.out.println("sayi2 > sayi1 > sayi3");
            }
            else{
                System.out.println("Sayi2 > sayi3 > sayi1");
            }
        }
        else if ((sayi3 > sayi2) && (sayi3 > sayi1)){
            if (sayi1 > sayi2){
                System.out.println("sayi3 > sayi1 > sayi2");
            }
            else{
                System.out.println("Sayi3 > sayi2 > sayi1");
            }
        }


    }
}
