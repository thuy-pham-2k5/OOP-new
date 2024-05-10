import java.util.Scanner;

public class check_prime_num {
    public static void main(String[] args) {
        System.out.println("Vui lòng nhập số bạn muốn kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        int prime;
        prime = scanner.nextInt();

        if (prime<2) {
            System.out.println(prime + " không phải là số nguyên tố");
        } else {
            int i =2;
            boolean check = true;
            while (i<=Math.sqrt(prime)) {
                if (prime % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(prime + " là số nguyên tố");
            } else {
                System.out.println(prime + " không phải là số nguyên tố");
            }
        }
    }
}
