package Arrays;

import java.util.Arrays;

public class average {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        double average = Arrays.stream(arr).average().orElse(0.0);
        System.out.println(average);
    }
}
