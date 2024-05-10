import java.util.Scanner;

public class max_element {
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của ma trận mà bạn muốn:  ");
        Scanner sc = new Scanner(System.in);
        int num_element = sc.nextInt();
        double[][] matrix = new double[num_element][num_element];
        for (int row=0; row<matrix.length; row++) {
            for (int column=0; column<matrix[row].length; column++) {
                matrix[row][column] = (double) (Math.random()*(num_element*num_element));
                matrix[row][column] = Math.round(matrix[row][column]*100.0)/100.0;
                System.out.print(matrix[row][column] + "  ");
            }
            System.out.println();
        }
        double max = matrix[0][0];
        int index_row_max = 0;
        int index_column_max = 0;
        for (int row=0; row<matrix.length; row++) {
            for (int column=0; column<matrix[row].length; column++) {
                if (max<matrix[row][column]) {
                    max = matrix[row][column];
                    index_row_max = row;
                    index_column_max = column;
                }
            }
        }
        System.out.println("Phần tử có giá trị lớn nhất là " + max + " nằm ở hàng " + index_row_max + " cột " + index_column_max);
    }
}
