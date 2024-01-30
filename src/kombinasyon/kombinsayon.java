package kombinasyon;

import java.util.Scanner;

public class kombinsayon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totaln = 1;
        int totalr =1;
        int totala = 1;
        int result;

        System.out.print("n değeri giriniz: ");
        int n = scanner.nextInt();

        System.out.print("r değeri giriniz: ");
        int r = scanner.nextInt();

        //n! için
        for (int i=1; i<=n; i++){
            totaln = totaln*i;
        }

        //r! için
        for (int i=1; i<=r; i++){
            totalr = totalr*i;
        }

        //n-r! için
        int a = n-r;
        for (int i=1; i<=a; i++){
            totala = totala*i;
        }

        result = totaln / (totalr * totala);
        System.out.println("Kombinasyon: " + result);




    }
}
