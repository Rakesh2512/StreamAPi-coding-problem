package Arrays;

import java.util.Arrays;

public class SortAsc {
    public static void main(String[] args) {
        int[] arr = {1,6,4,2,7};

        Integer[] ans = Arrays.stream(arr).sorted().boxed().toArray(Integer []::new);
        System.out.println(Arrays.toString(ans));
    }
}
