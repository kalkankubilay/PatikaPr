package DizideMinMaksHesaplama;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakınSayı {
    public static void main(String[] args) {
        int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(numbers); // Diziyi sıralıyoruz

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int input = scanner.nextInt();

        Integer minClosest = null;
        Integer maxClosest = null;

        for (int num : numbers) {
            if (num < input) {
                minClosest = num;
            } else if (num > input && maxClosest == null) {
                maxClosest = num;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + (minClosest != null ? minClosest : "Yok"));
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + (maxClosest != null ? maxClosest : "Yok"));

        scanner.close();
    }
}
