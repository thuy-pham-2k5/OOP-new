public class Test {
    public static void main(String[] args) {
        int[] arrayNumbers = {6, 3, 7, 8, 1, 2};

        showResult(arrayNumbers);

    }

    public static void showResult(int[] inputArray) {
        showValueInArray(inputArray);
        int sum = sumInArray(inputArray);
        System.out.println();
        System.out.println("Sum in array: " + sum);

    }

    public static void showValueInArray(int[] inputArray) {
        System.out.print("Number in array: ");
        for (int number : inputArray) {
            System.out.print(number + "   ");
        }
    }

    public static int sumInArray(int[] array) {
        int sum = 0;

        for (int number : array) {
            sum = sum + number;
        }

        return sum;
    }


}
