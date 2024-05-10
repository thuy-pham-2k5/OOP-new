public class Del_Add_arr_element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int del_element = 5;
        int[] newArr = new int[arr.length];
        for (int i=0; i<newArr.length; i++) {
            if (arr[i]==del_element)
                newArr[i] = 18;
            else
                newArr[i] = arr[i];
            System.out.print(newArr[i] + "  ");
        }
    }
}
