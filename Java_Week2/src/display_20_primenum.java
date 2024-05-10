import java.util.Scanner;

public class display_20_primenum {
    public static void main(String[] args) {
        int number = 2;
        int count=1;
        while (count<=20) {
            if (checkPrime(number)) {
                System.out.println("Lan lap thu " + count + ": " + number);
                count++;
            }
            number++;
        }
    }
    private static boolean checkPrime(int number) {
        if (number<2) {
            return false;
        }
        for (int i=2; i<=Math.sqrt(number); i++) {
            if (number%i==0) {
                return false;
            }
        }
        return true;
    }
}