package Arrays;

import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1};

        int ans = Arrays.stream(arr).reduce((q,b)-> b).orElse(-1);

        System.out.println(ans);
    }
}
