package ArraysSınıfıveMetotları;


import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void diziElemanıBastır(){
        int dizi[]= {1,2,3,4,5,6};
        System.out.println(Arrays.toString(dizi));
    }

    public static void ArraysFill(){
        int liste[]= {1,2,3,4,5,6};

        Arrays.fill(liste,3);
        System.out.println(Arrays.toString(liste));

        int liste2[] = {3,5,7,9,1,2,8,15};
        Arrays.fill(liste2,0,8,6); //hangi indexten hangi indekse ne ile değişeceğini yazıyoruz
        System.out.println(Arrays.toString(liste2));
    }

    public static void ArraySort(){
        int listele[] = {30,69,52,02,20,34,27};
        Arrays.sort(listele);
        System.out.println(Arrays.toString(listele));
    }

    public static void ArrayBinarySearch(){
        int liste[] = {30,69,52,2,20,34,27};
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));

        int index=Arrays.binarySearch(liste,2);
        System.out.println("2'nin indexi: " + index);

    }

    public static void ArrayCopyRange(){
        int liste[] = {1,3,5,8,9,11};

        int[] copyArray = Arrays.copyOf(liste,5);
        System.out.println(Arrays.toString(copyArray));

        int[] copyOfRangeArray = Arrays.copyOfRange(liste,3,6);
        System.out.println(Arrays.toString(copyOfRangeArray));
    }

    public static void ArraysEqual(){
        //arrayler bire bir aynı omak zorunda eşit olması için
        int yaslar[] = {20,22,25,29,35};
        int plakalar[] = {35,34,1,6,23,10};
        int liste[] = {20,22,25,29,35};

        System.out.println(Arrays.equals(yaslar,plakalar));
        System.out.println(Arrays.equals(liste,plakalar));
        System.out.println(Arrays.equals(liste,yaslar));
    }


    public static void main(String[] args) {
        diziElemanıBastır();
        System.out.println("*****");
        ArraysFill();
        System.out.println("*****");
        ArraySort();
        System.out.println("*****BS");
        ArrayBinarySearch();
        System.out.println("*****");
        ArrayCopyRange();
        System.out.println("*****");
        ArraysEqual();
    }



}
