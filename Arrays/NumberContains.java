package Arrays;

import java.util.Arrays;

public class NumberContains {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,8};

        boolean find = Arrays.stream(arr).anyMatch(x -> x == 6);

        System.out.println(find);

    }
}
