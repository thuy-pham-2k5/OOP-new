import java.util.Scanner;

public class num_into_word {
    public static void main(String[] args) {
        System.out.println("Nhập số cần đọc: ");
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt();

        while (num>=1000 || num<0) {
            System.out.println("Hãy nhập số nguyên dương từ 0 dến 999");
            num = new Scanner(System.in).nextInt();
        }

        String number, hundreds, tens, ones, tens_ones;
        number = String.valueOf(num);
        char digit1 = number.charAt(number.length()-3);
        hundreds = String.valueOf(digit1);
        char digit2 = number.charAt(number.length()-2);
        tens = String.valueOf(digit2);
        char digit3 = number.charAt(number.length()-1);
        ones = String.valueOf(digit3);
        tens_ones = "";

        switch (digit1) {
            case 9: hundreds = "nine hundred";
                break;
            case 8: hundreds = "eight hundred";
                break;
            case 7: hundreds = "seven hundred";
                break;
            case 6: hundreds = "six hundred";
                break;
            case 5: hundreds = "five hundred";
                break;
            case 4: hundreds = "four hundred";
                break;
            case 3: hundreds = "three hundred";
                break;
            case 2: hundreds = "two hundred";
                break;
            case 1: hundreds = "one hundred";
                break;
            case 0: hundreds = "";
                break;
            default: hundreds = "";
        }
        switch (digit2) {
            case 9:
                tens = "ninety";
                break;
            case 8:
                tens = "eighty";
                break;
            case 7:
                tens = "seventy";
                break;
            case 6:
                tens = "sixty";
                break;
            case 5:
                tens = "fifty";
                break;
            case 4:
                tens = "fourty";
                break;
            case 3:
                tens = "thirty";
                break;
            case 2:
                tens = "twenty";
                break;
            case 1:
                if (digit3==9) {
                    tens_ones = "nineteen";
                } if (digit3==8) {
                    tens_ones = "eighteen";
                } if (digit3==7) {
                    tens_ones = "seventeen";
                } if (digit3==6) {
                    tens_ones = "sixteen";
                } if (digit3==5) {
                    tens_ones = "fifeen";
                } if (digit3==4) {
                    tens_ones = "fourteen";
                } if (digit3==3) {
                    tens_ones = "thirteen";
                } if (digit3==2) {
                    tens_ones = "twelve";
                } if (digit3==1) {
                    tens_ones = "ten";
                }
                break;
            default:
                tens = "";
        }

        switch (digit3) {
            case 9: ones = "nine";
                break;
            case 8: ones = "eight";
                break;
            case 7: ones = "seven";
                break;
            case 6: ones = "six";
                break;
            case 5: ones = "five";
                break;
            case 4: ones = "four";
                break;
            case 3: ones = "three";
                break;
            case 2: ones = "two";
                break;
            case 1: ones = "one";
                break;
            case 0: ones = "";
                break;
            default: ones = "";
        }

         if(number.length()==3) {
             if (digit2==1) {
                 System.out.println(hundreds + " " + tens_ones);
             } else {
                 System.out.println(hundreds + " " + tens + " " + ones);
             }
         } else if (number.length()==2 && num>=20) {
             System.out.println(tens+ones);
         } else if (num>=10 && num<=20) {
             System.out.println(tens_ones);
         } else if (number.length()==1) {
             System.out.println(ones);
         }
    }
}