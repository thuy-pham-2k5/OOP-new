import java.util.Scanner;

public class count_char {
    public static void main(String[] args) {
        String string = "Trong phần này, chúng ta sẽ phát triển một cho phép đếm số lần xuất hiện của một ký tự được nhập vào từ bàn phím cho một chuỗi cho trước.";
        System.out.println(string);
        char character = 't';
        int count=0;
        for (int i=0; i<string.length(); i++) {
            if (string.charAt(i)==character)
                count++;
        }
        System.out.println("Ký tự " + character + " xuất hiện " + count + " lần");
    }
}
