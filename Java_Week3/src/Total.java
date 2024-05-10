import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        //matrix
        System.out.print("Enter the number of matrix elements you want: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double[][] matrix = new double[number][number];
        for (int row=0; row<matrix.length; row++) {
            for (int column=0; column<matrix[row].length; column++) {
                matrix[row][column] = (double) (Math.random()*number*number);
                matrix[row][column] = Math.round(matrix[row][column]*100.0)/100.0;
                System.out.print(matrix[row][column] + "  ");
            }
            System.out.println();
        }
        System.out.print("Column you want to sum: ");
        int num = sc.nextInt();
        double total = 0;
        while (num>=matrix.length) {
            System.out.println("Illegal! The column number you entered is not within the matrix range. Please enter again.");
            num = sc.nextInt();
        }
        for (int row=0; row<matrix.length; row++) {
            total +=matrix[row][num];
        }
        System.out.print(total);
    }
}
