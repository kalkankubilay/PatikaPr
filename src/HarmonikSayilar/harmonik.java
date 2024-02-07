package HarmonikSayilar;

import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = 0;
        System.out.print("Bir N değeri giriniz: ");
        int n = scanner.nextInt();

        for (double i=1; i<=n; i++){
            result += (1/i);
        }

        System.out.println("Reuslt: " + result);

    }
}
