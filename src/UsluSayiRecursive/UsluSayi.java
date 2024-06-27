package UsluSayiRecursive;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        System.out.print("Üssünü giriniz: ");
        int us = scanner.nextInt();

        int sonuc = usluSayi(sayi,us);
        System.out.println("Sonuç: " + sonuc);

    }

    public static int usluSayi(int sayi,int us){
        if (us == 0){
            return 1;
        }
        else {
            return sayi * (usluSayi(sayi, us-1));//üssü bir azaltarak bütün methodu tekrar çağırır.
        }
    }


}
