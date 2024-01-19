package NotOrtalamasi;

import java.util.Scanner;

public class notOrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mat,fizik,kimya,tarih,turkce,muzik;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = scanner.nextDouble();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scanner.nextDouble();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scanner.nextDouble();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = scanner.nextDouble();
        System.out.print("Turkce notunuzu giriniz: ");
        turkce = scanner.nextDouble();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = scanner.nextDouble();

        double ort = ((mat+fizik+kimya+tarih+turkce+muzik)/6);
        System.out.print("Not ortalamanız: " + ort);

        if (ort >= 60){
            System.out.println(" ");
            System.out.println("Sınıfı geçtiniz.");
        }else{
            System.out.println("Seneye görüşürüz.");
        }

    }
}
