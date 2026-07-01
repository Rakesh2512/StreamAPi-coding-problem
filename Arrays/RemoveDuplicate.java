package Arrays;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,52,4};

        int[] ans  = Arrays.stream(arr).distinct().toArray();
        Integer[] ans1 = Arrays.stream(arr).distinct().boxed().toArray(Integer[]::new);

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans1));
    }
}
