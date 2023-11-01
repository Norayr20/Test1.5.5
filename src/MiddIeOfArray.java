import java.util.Arrays;

public class MiddIeOfArray {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 17};
        int[] result = getArrayMiddle(numbers);
        System.out.println(Arrays.toString(result));

}
    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length > 2) {
            if (numbers.length % 2 == 0) {
                int[] arr = new int[5];
                arr[0] = numbers[numbers.length / 2 - 1];
                arr[1] = numbers[numbers.length / 2];
                return arr;
            } else {
                int[] arr1 = new int[1];
                arr1[0] = numbers[numbers.length / 2];
                return arr1;
            }
            }else {
                return numbers;
            }
        }
    }
