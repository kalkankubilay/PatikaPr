package ucvedordebolunenortalama;

import java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k;
        double avg;
        int toplam=0;
        int adet=0;
        System.out.print("Bir sayı giriniz.");
        k=scanner.nextInt();
        for (int i=0; i<=k; i++){
            if (i%3 == 0 && i%4==0){
                System.out.println(i);
                toplam += i;
                adet++;
            }
        }

        if (adet == 0){
            System.out.println("Değer aralığında koşula uygun sayı yok.");
        }
        else{
            avg= (double) toplam /adet;
            System.out.println("3'e ve 4'e bölünebilen sayıların ortalaması: " + avg);
        }



    }
}
