package Arrays;

import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arrb = {1,6,2,8};


        Arrays.stream(arr).filter(x -> Arrays.stream(arrb).anyMatch(y -> y == x)).forEach(System.out::println);
    }
}
