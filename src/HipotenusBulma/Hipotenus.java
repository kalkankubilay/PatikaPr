package HipotenusBulma;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hipotenüs bulmak için 1.dik kenar uzunluğunu giriniz: ");
        int a = scanner.nextInt();

        System.out.print("Hipotenüs bulmak için 2.dik kenar uzunluğunu giriniz: ");
        int b = scanner.nextInt();

        double hipotenus = sqrt((a*a)+(b*b));

        System.out.print("Hipotenüs: " + hipotenus);



    }
}
