package ATM;


import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName, password;
        int balance = 1500;
        int rights = 3;

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = scanner.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = scanner.nextLine();

        if (userName.equals("kube") && password.equals("1234k")){
            System.out.println("Bankaya Hoşgeldiniz.");
            System.out.println("Yapmak istediğiniz işlemi seçiniz.");
            System.out.println("1. Para Yatırma");
            System.out.println("2. Para Çekme");
            System.out.println("3. Bakiye Sorgulama");
            System.out.println("4. Çıkış Yap");
            int islemer = scanner.nextInt();

            switch (islemer){
                case 1:
                    System.out.println("Yatırmak istediğiniz tutarı giriniz:");
                    int yatirmaTutari = scanner.nextInt();
                    balance += yatirmaTutari;
                    System.out.println("Yeni bakiyeniz: " + balance);
                    break;

                case 2:
                    System.out.println("Çekmek istediğiniz tutarı giriniz:");
                    int cekmeTutari = scanner.nextInt();
                    balance -= cekmeTutari;
                    System.out.println("Yeni bakiyeniz: " + balance);
                    break;

                case 3:
                    System.out.println("Bakiyeniz: " + balance);
                    break;

                case 4:
                    break;
            }

        }else {
            rights--;
            System.out.println("Hatalı giriş yaptınız.Tekrar deneyiniz.");
            if (rights==0){
                System.out.println("Hesabınız bloke olmuştur.Bankaya gidiniz.");
            }else{
                System.out.println("Kalan hakkınız: " + rights);
            }
        }





    }
}
