package Arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7};

        
        
        Set<Integer>st = Arrays.stream(arr).boxed().collect(Collectors.toSet());

        int missing = IntStream.rangeClosed(1,arr.length).filter(n -> !st.contains(n)).findFirst().orElse(-1);
        System.out.println(missing);

        //second approach

        int expected = IntStream.rangeClosed(1, arr[arr.length-1]).sum();
        int arrSum = Arrays.stream(arr).sum();

        System.out.println(expected-arrSum);
    }
}
