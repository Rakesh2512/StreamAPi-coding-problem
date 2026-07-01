package Arrays;

import java.util.Arrays;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,3};

        int smallest = Arrays.stream(arr).min().orElseThrow();

        System.out.println(smallest);
    }
}
