package ManavKasa;

import java.util.Scanner;

public class Kasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Manava hoşgeldiniz fiyatlar şöyledir(kg); ");
        System.out.println("Armut 2,14 tl" +
                "Elma 3,67 tl" +
                "Domates 1,11 tl" +
                "Muz 0,95 tl" +
                "Patlıcan 5,00 tl");

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        System.out.print("Kaç kilo armut alıcaksınız ? ");
        int armutKg = scanner.nextInt();

        System.out.print("Kaç kilo elma alıcaksınız ? ");
        int elmaKg = scanner.nextInt();

        System.out.print("Kaç kilo domates alıcaksınız ? ");
        int domatesKg = scanner.nextInt();

        System.out.print("Kaç kilo muz alıcaksınız ? ");
        int muzKg = scanner.nextInt();

        System.out.print("Kaç kilo patlıcan alıcaksınız ? ");
        int patlicanKg = scanner.nextInt();

        double toplam = ((armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg));
        System.out.print("Toplam ödemeniz gereken tutar: " + toplam);


    }
}
