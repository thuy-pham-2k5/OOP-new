import java.util.Scanner;

public class demo_method {
    public static void main(String[] args) {
        //tạo bảng
        int[][] matrix = new int[10][10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " row and " + matrix[0].length + " column: ");
//        tạo giá trị cho bảng = nhập tay
//        for (int row=0; row< matrix.length; row++) {
//            for (int column=0; column<matrix[row].length; column++) {
//                matrix[row][column] = input.nextInt();
//            }
//        }

        //tạo giá trị cho bảng
        for (int row=0; row<matrix.length; row++) {
            for (int column=0; column<matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random()*100);
            }
        }

        //in giá trị
        System.out.println("Mảng thứ nhất chưa xáo trộn");
        for (int row=0; row<matrix.length; row++) {
            for (int column=0; column<matrix[row].length; column++) {
                System.out.print(matrix[row][column] + "  ");
            }
            System.out.println();
        }

//        for (int i=0; i<3; i++) {
//            System.out.println();
//        }

        //tạo mảng thứ hai
//        System.out.println("Mảng thứ hai");
//        int[][] matrix2 = new int[10][10];
//        for (int row=0; row<matrix2.length; row++) {
//            for (int column=0; column<matrix2[row].length; column++) {
//                matrix2[row][column] = matrix[row][column];
//                System.out.print(matrix2[row][column] + "  ");
//            }
//            System.out.println();
//        }

       //tính tổng của cột
//       for (int column=0; column<matrix.length; column++) {
//           int total=0;
//           for (int row=0; row<matrix.length; row++)
//               total+=matrix[row][column];
//           System.out.println("Sum for column " + column + " is " + total);
//        }
//        tính tổng hàng
//                for (int row=0; row< matrix.length; row++) {
//                    int total=0;
//                    for (int column=0; column<matrix[row].length; column++) {
//                        total+=matrix[row][column];
//                    }
//                    System.out.println("Sum of row " + row + " is " + total);
//                }

//tìm hàng có giá trị lớn nhất
//        int maxRow=0;
//        int indexofMaxRow=0;
//        for (int column=0; column<matrix[0].length; column++) {
//            maxRow += matrix[0][column];
//        }
//        for (int row=1; row< matrix.length; row++) {
//            int totalofThisRow=0;
//            for (int column=0; column<matrix[row].length; column++)
//                totalofThisRow+=matrix[row][column];
//            if (totalofThisRow>maxRow) {
//                maxRow=totalofThisRow;
//                indexofMaxRow=row;
//            }
//
//        }
//        System.out.println("Row " + indexofMaxRow + " has the maximum sum of " + maxRow);
//        for (int i=0; i<3; i++) {
//            System.out.println();
//        }
//
//        //Mảng một xáo trộn
//        System.out.println("Mảng một đã xáo trộn");
//        for (int i=0; i< matrix.length; i++) {
//            for (int j=0; j<matrix[i].length; j++) {
//                int i1= (int) (Math.random() * matrix.length);
//                int j1= (int) (Math.random() * matrix[i].length);
//
//                //swap matrix[i][j] with matrix[i1][j1]
////                int temp = matrix[i][j];
//                matrix[i][j] = matrix[i1][j1];
////                matrix[i1][j1] = temp;;
//                System.out.print(matrix[i][j] + "  ");
//            }
//            System.out.println();
//        }
//
//        //So sánh 2 mảng
//        for (int row2=0; row2<2; row2++) {
//            for (int column2=0; column2<matrix2[row2].length; column2++) {
//                for (int row1=0; row1<matrix.length; row1++) {
//                    for (int column1=0; column1<matrix[row1].length; column1++) {
//                        if (matrix2[row2][column2]==matrix[row1][column1]) {
//                            System.out.println("Giá trị của dòng " + row2 + " cột " + column2 + " bảng 2 = giá trị dòng " + row1 + " cột " + column1 + " bảng 1 đã xáo trộn = " + matrix[row1][column1]);
//                            break;
//                        }
//                    }
//                }
//            }
//            System.out.println();
//        }
    }

}


