package Arrays;

import java.util.Arrays;

public class allPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        boolean positive = Arrays.stream(arr).allMatch(x -> x > 0);

        System.out.println(positive);
    }
}
