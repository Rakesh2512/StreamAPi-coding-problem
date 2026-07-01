package Arrays;

import java.util.Arrays;

public class FindFirst {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int ans = Arrays.stream(arr).findFirst().orElseThrow();
        System.out.println(ans);
    }
}
