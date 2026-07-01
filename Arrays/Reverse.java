package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Reverse {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4};

        int[] ans = IntStream.rangeClosed(1,arr.length).map(i -> arr[arr.length-i]).toArray();
        System.out.println(Arrays.toString(ans));
    }
}
