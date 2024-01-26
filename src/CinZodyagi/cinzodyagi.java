package CinZodyagi;

import java.util.Scanner;

public class cinzodyagi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz:");
        int year = scanner.nextInt();

        int cinzodyagi = year % 12;
        //System.out.println(cinzodyagi);

        if (cinzodyagi==0){
            System.out.println("Çin zodyağı burcunuz: Maymun ");
        }else if (cinzodyagi ==1) {
            System.out.println("Çin zodyağı burcunuz: Horoz ");
        }else if (cinzodyagi ==2) {
            System.out.println("Çin zodyağı burcunuz: Köpek ");
        }else if (cinzodyagi ==3) {
            System.out.println("Çin zodyağı burcunuz: Domuz ");
        }else if (cinzodyagi ==4) {
            System.out.println("Çin zodyağı burcunuz: Fare ");
        }else if (cinzodyagi ==5) {
            System.out.println("Çin zodyağı burcunuz: Öküz ");
        }else if (cinzodyagi ==6) {
            System.out.println("Çin zodyağı burcunuz: Kaplan ");
        }else if (cinzodyagi ==7) {
            System.out.println("Çin zodyağı burcunuz: Tavşan ");
        }else if (cinzodyagi ==8) {
            System.out.println("Çin zodyağı burcunuz: Ejderha ");
        }else if (cinzodyagi ==9) {
            System.out.println("Çin zodyağı burcunuz: Yılan ");
        }else if (cinzodyagi ==10) {
            System.out.println("Çin zodyağı burcunuz: At ");
        }else if (cinzodyagi ==11) {
            System.out.println("Çin zodyağı burcunuz: Koyun ");
        }


    }
}
