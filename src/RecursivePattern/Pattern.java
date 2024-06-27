package RecursivePattern;


import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        sayiIslem(sayi);
        scanner.close();
    }

    // Recursive method to handle subtraction and addition of 5
    public static void sayiIslem(int sayi) {
        System.out.print(sayi +" ");

        if (sayi > 0) {
            sayiIslem(sayi - 5);
        } else {
            sayiGeriIslem(sayi + 5);
        }
    }

    // Recursive method to add 5 until the original number is reached
    public static void sayiGeriIslem(int sayi) {
        System.out.print(sayi + " ");

        if (sayi < 0) {
            sayiGeriIslem(sayi + 5);
        }
    }
}

