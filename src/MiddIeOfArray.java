import java.util.Arrays;

public class MiddIeOfArray {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 17};
        int[] result = getArrayMiddle(numbers);
        System.out.println(Arrays.toString(result));

    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length == 0) {
            return new int[0];
        }
        int start = numbers.length / 2;
        if (numbers.length % 2 == 0) {
            return new int[]{numbers[start - 1], numbers[start]};
        } else {
            return new int[]{numbers[start]};
        }
    }
}