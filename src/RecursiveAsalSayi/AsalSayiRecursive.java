package RecursiveAsalSayi;

import java.util.Scanner;

public class AsalSayiRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Asal olup olmadığını öğrenmek için bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi < 2){
            System.out.println(sayi + " asal bir sayı değildir.");
        }else {
            boolean sonuc = asalMi(sayi, 2);
            if (sonuc) {
                System.out.println(sayi + " asal bir sayıdır.");
            } else {
                System.out.println(sayi + " asal bir sayı değildir.");
            }
        }

    }

    // Recursive asal kontrol methodu
    public static boolean asalMi(int sayi, int bolen) {
        if (bolen == sayi) { // Taban durumu: Tüm bölenleri denedik, sayı asaldır
            return true;
        }
        if (sayi % bolen == 0) { // Taban durumu: Sayı herhangi bir bölenine bölünebiliyorsa asal değildir
            return false;
        }
        return asalMi(sayi, bolen + 1); // Rekürsif durum: Sonraki böleni kontrol et
    }




}
