import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Double VND=(double) 0;
        Double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD bạn có: ");
        USD = scanner.nextDouble();
        if(USD>0) {
            VND=USD*24975;
            System.out.println("Giá trị tiền VNĐ là: " + VND);
        } else {
            System.out.println("Không hợp lệ");
        }
    }
}
