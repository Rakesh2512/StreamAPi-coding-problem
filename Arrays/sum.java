package Arrays;

import java.util.Arrays;

public class sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
