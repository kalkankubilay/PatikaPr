package UcakBileti;

import java.util.Scanner;

public class ucakbileti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age,km,type;
        System.out.print("Kaç km yol gidileceğini giriniz: ");
        km = scanner.nextInt();
        if (km<=0){
            System.out.println("Hatalı tuşlama yaptınız.");
            System.exit(0);
        }
        System.out.print("Yaşınızı giriniz: ");
        age = scanner.nextInt();
        if (age <=0){
            System.out.println("Hatalı tuşlama yaptınız.");
            System.exit(0);
        }
        System.out.println("Yolculuk tipini seçiniz: ");
        System.out.println("Tek yön için 1'e");
        System.out.println("Gidiş dönüş için 2'ye basınız.");
        type = scanner.nextInt();
        if (type !=1 && type !=2){
            System.out.println("Hatalı tuşlama yaptınız.");
            System.exit(0);
        }

        double tutar;


        switch (type){
            case 1:
                tutar = km*0.10;
                if (age < 12){
                    tutar -= tutar/2;
                } else if (age>12 && age <24) {
                    tutar = tutar-((tutar*10)/100);
                } else if (age >65) {
                    tutar = tutar-((tutar*30)/100);
                }
                System.out.println("Yolculuk tutarı: " + tutar);
                break;
            case 2:
                tutar = km*0.10;
                tutar = tutar-((tutar*20)/100);
                if (age < 12){
                    tutar -= tutar/2;
                } else if (age>12 && age <24) {
                    tutar = tutar-((tutar*10)/100);
                } else if (age >65) {
                    tutar = tutar-((tutar*30)/100);
                }
                System.out.println("Yolculuk tutarı: " +tutar*2);

        }


    }
}
