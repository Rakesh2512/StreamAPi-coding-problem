package Arrays;

import java.util.Arrays;

public class Counting {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        long count = Arrays.stream(arr).boxed().count();

        System.out.println(count);
    }
}
