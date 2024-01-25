package KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName,password;
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = scanner.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = scanner.nextLine();

        if (userName.equals("kube") && password.equals("k1234")){
            System.out.print("Giriş başarılı.");
        }else {
            System.out.print("Giriş bilgileriniz hatalı, giriş yapılamadı.");
        }

        /*if (userName == userName && password == password){
            System.out.print("Girişiniz başarılı.");
        }
        else if(userName != userName && password == password){
            System.out.print("Kullanıcı adınız hatalı.");
        }
        else if (userName == userName && password != password){
            System.out.println("Şifreniz hatalı.");
        }*/



    }
}
