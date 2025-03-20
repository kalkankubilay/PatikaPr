package DizideMinMaksHesaplama;

public class MinMaxHesapla {
    public static void main(String[] args) {
        int [] liste = { 1,4,5,6,7,12,33};

        int min = liste [0];
        int max = liste [1];

        for (int i : liste){
            if (i < min) {
                min = i;
            }
            else if (i > max){
                max = i;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
