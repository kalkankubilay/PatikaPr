package ArmstrongSayi;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int basamakSayisi=0;
        int tempSayi = sayi;
        int basValue;
        int result =0;
        int basPow;

        while (tempSayi !=0){
            tempSayi /= 10;
            basamakSayisi++;
        }

        tempSayi =sayi;
        while (tempSayi !=0){
            basValue=tempSayi%10;
            basPow=1;
            for (int i=1; i<=basamakSayisi; i++){
                basPow *= basValue;
            }
            result +=basPow;
            tempSayi/= 10;
        }
        System.out.println(result);


    }
}
