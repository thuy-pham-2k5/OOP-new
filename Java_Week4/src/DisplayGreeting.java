import java.util.Scanner;

public class DisplayGreeting {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        DisplayGreeting(name);
    }

    public static void DisplayGreeting(String greeting) {
        System.out.println("Hello: " + greeting);
    }
}
