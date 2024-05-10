import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=0;
        do {
            System.out.print("Nhập độ dài tam giác bạn muốn (nhap -1 de exit): ");
            number = scanner.nextInt();
            for (int i=number; i>=1; i--) {
                for (int j = i; j < number; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * i - 1); k++) {  // nếu là k<(i-1) thì sẽ chỉ bị -1 ở bên trái, tam giác đều cần cân bằng 2 đầu nên mỗi bên phải -1
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        } while (number!=-1);
    }
}
