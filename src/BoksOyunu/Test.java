package BoksOyunu;

public class Test {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Kubilay", 10, 120,100, 30);
        Fighter f2 = new Fighter("Çato", 10,120,85,40);

        Match match = new Match(f1,f2,85,100);
        match.run();
    }
}
