package Arrays;

import java.util.Arrays;

public class square {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        Arrays.stream(arr).map(n -> n*n).forEach(System.out::println);

    }
}
