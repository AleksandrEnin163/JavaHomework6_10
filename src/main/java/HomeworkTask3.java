import java.util.Scanner;

public class HomeworkTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter EUR value: ");
        double eur_value = scanner.nextDouble();
        System.out.println("Value in EUR " + eur_value + " is in USD " + convertToUsd(eur_value));
        scanner.close();
    }
    static double convertToUsd(double eur_value) {
        double coeff = 0.97;
        double result = coeff * eur_value;

        return result;
    }
}
