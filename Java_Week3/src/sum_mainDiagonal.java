import java.util.Scanner;

public class sum_mainDiagonal {
    public static void main(String[] args) {
        System.out.print("Enter the number of matrix element you want: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double[][] matrix = new double[num][num];
        for (int row=0; row<matrix.length; row++) {
            for (int column=0; column<matrix[row].length; column++) {
                matrix[row][column] = (double) (Math.random()*num*num);
                matrix[row][column] = Math.round(matrix[row][column]*100.0)/100.0;
                System.out.print(matrix[row][column] + "  ");
            }
            System.out.println();
        }
        double total=0;
        for (int row=0; row<matrix.length; row++) {
            int column = row;
            total += matrix[row][column];
        }
        System.out.println("The sum of the main diagonals is: " + total);
    }
}
