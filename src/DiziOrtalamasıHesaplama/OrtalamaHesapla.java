package DiziOrtalamasıHesaplama;

public class OrtalamaHesapla {
    public static void main(String[] args) {
        int[] dizi = {10,20,30,40,50};
        int sum = 0;
        for (int i=0; i< dizi.length; i++){
            sum += dizi[i];
        }
        System.out.println(sum/ dizi.length);

    }
}
