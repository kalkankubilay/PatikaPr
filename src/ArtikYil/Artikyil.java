package ArtikYil;

import java.util.Scanner;

public class Artikyil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yılı girin: ");
        int yil = scanner.nextInt();

        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

        scanner.close();
    }
}
