package Arrays;

import java.util.Arrays;

public class CountOddNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

       long ans =  Arrays.stream(arr).filter(n -> n%2 != 0).count();
       System.out.println(ans);
    }
}
