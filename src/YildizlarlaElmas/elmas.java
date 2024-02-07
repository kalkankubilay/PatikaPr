package YildizlarlaElmas;
import java.util.Scanner;

public class elmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmasın yüksekliği (tek sayı): ");
        int yukseklik = scanner.nextInt();

        for (int i = 1; i <= yukseklik; i += 2) {
            for (int j = 0; j < (yukseklik - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = yukseklik - 2; i >= 1; i -= 2) {
            for (int j = 0; j < (yukseklik - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

