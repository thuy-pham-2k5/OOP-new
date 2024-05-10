import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("1. Print the retangcle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Please choose 1 of 4 menu types above: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int row = 1; row <= 3; row++) {
                        for (int column = 1; column <= 5; column++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("The corner is square at 4 different angles");
                    System.out.println("1. Top-left");
                    for (int row = 5; row >= 1; row--) {
                        for (int column = 1; column <= row; column++) {
                            System.out.print(" *");
                        }
                        System.out.println("");
                    }
                    System.out.println("2. Top-right");
                    for (int row = 5; row >= 1; row--) {
                        for (int column_space = 1; column_space <= (5 - row); column_space++) {
                            System.out.print("  ");
                        }
                        for (int column = 1; column <= row; column++) {
                            System.out.print(" *");
                        }
                        System.out.println("");
                    }
                    System.out.println("3. Bottom-left");
                    for (int row = 5; row >= 1; row--) {
                        for (int column = 5; column >= row; column--) {
                            System.out.print(" *");
                        }
                        System.out.println("");
                    }
                    System.out.println("4. Bottom-right");
                    for (int row = 1; row <= 5; row++) {
                        for (int column_space = 1; column_space <= (5 - row); column_space++) {
                            System.out.print("  ");
                        }
                        for (int column = 1; column <= row; column++) {
                            System.out.print(" *");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int row = 5; row >= 1; row--) {
                        for (int column_space = 1; column_space <= (5 - row); column_space++) {
                            System.out.print("  ");
                        }
                        for (int column = 1; column <= (2 * row - 1); column++) {
                            System.out.print(" *");
                        }
                        System.out.println("");
                    }
                    break;
            }
        } while (choice!=4);

    }
}
