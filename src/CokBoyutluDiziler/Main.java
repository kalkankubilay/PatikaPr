package CokBoyutluDiziler;

public class Main {
    public static void main(String[] args) {
        /* int [] [] matris = {
                 {1,2,3,4},
                 {5,6,7,8},
                 {9,10,11,12},
         };
        System.out.println(matris [1][3]);*/

        int [] [] matris = new int[3][4];
        int number =1;

        for (int i=0; i < matris.length; i++){
            //matris[i]
            for (int j=0; j < matris[i].length; j++){
                matris[i][j] = number ++;
            }
        }
        for (int i=0; i<matris.length; i++){
            for (int j =0; j<matris[i].length; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
