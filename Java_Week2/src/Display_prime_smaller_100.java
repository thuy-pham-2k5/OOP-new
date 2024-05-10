public class Display_prime_smaller_100 {
    public static void main(String[] args) {
        int number = 2;
        int count = 1;
        while (number<100) {
            if (checkPrime(number)) {
                System.out.println("So nguyen to thu " + count + " la: " + number);
                count++;
            }
            number++;
        }
    }
    private static boolean checkPrime(int number) {
        if (number<2)
            return false;
        for (int i=2; i<=Math.sqrt(number); i++) {
            if (number%i==0) {
                return false;
            }
        }
        return true;
    }
}
