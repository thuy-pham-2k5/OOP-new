import java.util.Scanner;

public class CurrencyCoversion {
    public static void main(String[] args) {
        System.out.print("Enter the mount of dollars you currently have: ");
        Scanner inputMoney = new Scanner(System.in);
        double USD = inputMoney.nextDouble();
        System.out.println("The amount of Vietnam Dong you currently have is: " + CurrencyConversion(USD) + " dong.");
    }

    public static double CurrencyConversion(double USD) {
        double VND;
        double rate = 25354.97;
        VND = USD * rate;
        return VND;
    }
}
