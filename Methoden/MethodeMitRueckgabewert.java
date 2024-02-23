package Methoden;

public class MethodeMitRueckgabewert {

    public static void main(String[] args) {
        
        double diff = berechneDiff(4.6, 2.3);
        
        System.out.println("Differenz:"+diff);


    }

    private static double berechneDiff(double a, double b) {
        return a-b;
    }
}