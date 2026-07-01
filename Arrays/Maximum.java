package Arrays;

import java.util.Arrays;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {3,2,5,6};

        int maximum = Arrays.stream(arr).max().orElse(-1);
        System.out.println(maximum);
    }
}
