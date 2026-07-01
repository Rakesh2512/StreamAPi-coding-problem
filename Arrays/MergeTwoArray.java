package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {3,4};

        int[] ans = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();

        System.out.println(Arrays.toString(ans));
    }
}
