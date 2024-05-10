import java.util.Scanner;

public class min_element {
    public static void main(String[] args) {
        System.out.print("Enter the number of element you want: ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i=0; i< arr.length; i++) {
            arr[i] = (int) (Math.random()* arr.length);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        int min = arr[0];
        int indexMax = 0;
        for (int i=1; i< arr.length; i++) {
            if (min>arr[i]) {
                min = arr[i];
                indexMax = i;
            }
        }
        System.out.println("Element " + min + " has the smallest value at position " + (indexMax+1) + ", index " + indexMax);
    }
}
