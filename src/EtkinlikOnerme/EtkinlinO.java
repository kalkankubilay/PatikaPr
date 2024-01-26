package EtkinlikOnerme;

import java.util.Scanner;

public class EtkinlinO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Havanın kaç derece olduğunu giriniz: ");
        double hava = scanner.nextDouble();

        if (hava<5){
            System.out.print("Kayak yapmak için güzel bir hava.");
        }
        else if (hava>=5 && hava <15){
            System.out.print("Sinemaya gitmek iyi fikir gibi.");
        }
        else if (hava>=15 && hava <25){
            System.out.print("Pikniğe gitmek iyi fikir olur.");
        }
        else if(hava>=25){
            System.out.print("Yüzmek için uygun hava.");
        }



    }
}
