//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Square s1 = new Square(20);
//        s1.size = 10;
        int area = s1.getArea();
        System.out.println("Dien tich: " + area);
        int perimeter = s1.getPerimeter();
        System.out.println("Chu vi: " + perimeter);
    }
}