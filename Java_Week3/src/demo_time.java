import java.time.LocalTime;
import java.util.Scanner;

public class demo_time {
    public static <Int> void main(String[] args) {
        System.out.println("Enter timer to display the time");
        System.out.println("Enter exit to exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhấn 1 để vào cách 1");
        System.out.println("Nhấn 2 để vào cách 2");
        System.out.println("Nhấn 3 để vào cách 3");
        int method = scanner.nextInt();

        //cách 1
        if (method==1) {
            String time1;
            do {
                time1 = scanner.nextLine();
                while (!time1.equals("timer") && !time1.equals("exit")) {
                    System.out.println("I don't know");
                    time1 = scanner.nextLine();
                }
                if (time1.equals("timer")) {
                    System.out.println("10:44 AM");
                }
            } while (!time1.equals("exit"));
        }

        //cách 2
//        if (method==2) {
//            String command;
//            do {
//                command = scanner.nextLine();
//                switch (command) {
//                    case "time":
//                        System.out.println("10:40 AM");
//                        break;
//                    case "exit":
//                        return;
//                    default:
//                        System.out.println("I don't know");
//                }
//            } while (true);
//        }

        //cách 3
//        if (method==3) {
//            do {
//                System.out.print("Enter: ");
//                String text = scanner.nextLine();
//                switch (text) {
//                    case "time":
//                        LocalTime time = LocalTime.now();
//                        int gio = time.getHour();
//                        int phut = time.getMinute();
//                        int giay = time.getSecond();
//                        System.out.println(gio + "+" + phut + "+" + giay);
//                        break;
//                    case "exit":
//                        return;
//                    default:
//                        System.out.println("I don't know");
//                }
//            } while (true);
//        }
    }
}
