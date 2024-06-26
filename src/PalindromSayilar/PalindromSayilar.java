package PalindromSayilar;

import java.util.Scanner;

public class PalindromSayilar {

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an intiger");
        int sayi = scanner.nextInt();

        System.out.println(isPalindrom(sayi));

    }



}
