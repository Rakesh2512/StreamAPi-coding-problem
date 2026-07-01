package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighestNumber {
    
    public static void main(String[] args) {
        int[] arr = {1,6,4,3,5};

        int second = Arrays.stream(arr)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .distinct()
        .skip(1)
        .findFirst()
        .orElse(-1);   

        System.out.println(second);

        Optional<Integer>secondHighest = Arrays.stream(arr).boxed().sorted(Comparator.comparingInt(Integer::intValue).reversed()).limit(2)
        .skip(1).findFirst();

        System.out.println(secondHighest.get());
    }

}
