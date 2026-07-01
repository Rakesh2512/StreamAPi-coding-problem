package Arrays;

import java.util.Arrays;

public class Even {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        Arrays.stream(arr).filter(n -> n %2 == 0).forEach(System.out::println);
    }
}
