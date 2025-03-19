package DiziOrtalamasıHesaplama;

public class HarmonikHesaplama {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5}; // Örnek dizi
        double harmonicMean = calculateHarmonicMean(numbers);
        System.out.println("Dizinin harmonik ortalaması: " + harmonicMean);
    }

    public static double calculateHarmonicMean(double[] numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            sum += 1.0 / num;
        }
        return numbers.length / sum;
    }
}
