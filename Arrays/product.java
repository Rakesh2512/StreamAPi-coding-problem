package Arrays;

import java.util.Arrays;

public class product {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        int ans = Arrays.stream(arr).reduce(1, (a,b) -> a*b);
        System.out.println(ans);
    }
}
