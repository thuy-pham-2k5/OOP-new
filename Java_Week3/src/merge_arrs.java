import java.util.Scanner;

public class merge_arrs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng 1 bạn muốn: ");
        int[] arr1 = new int[sc.nextInt()];
        System.out.print("Nhập số phần tử mảng 2 bạn muốn: ");
        int[] arr2 = new int[sc.nextInt()];
        int[] arr_merge = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * arr1.length);
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * arr2.length);
            System.out.print(arr2[i] + "  ");
        }
        System.out.println();
        System.out.print("Mảng gộp gồm các phần tử là: ");
        for (int i = 0; i < arr_merge.length; i++) {
            if (i < arr1.length)
                arr_merge[i] = arr1[i];
            else
                arr_merge[i] = arr2[i - arr1.length];
            System.out.print(arr_merge[i] + "  ");
        }
    }
}
