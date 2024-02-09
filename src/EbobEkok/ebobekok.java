package EbobEkok;

import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = input.nextInt();

        int ebob = 1;
        int ekok = 1;
        int i = 1;

        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        ekok = (sayi1 * sayi2) / ebob;

        System.out.println(sayi1 + " ve " + sayi2 + " sayılarının EBOB'u: " + ebob);
        System.out.println(sayi1 + " ve " + sayi2 + " sayılarının EKOK'u: " + ekok);
    }
}

