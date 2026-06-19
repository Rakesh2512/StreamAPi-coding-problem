package FindMinumNumber;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMinumNumber {
    public static void main(String[] args) {
        List<Integer>number = Arrays.asList(3,5,4,1,10);
        int minNumber = number.stream().min(Comparator.comparingInt(Integer::intValue)).orElse(-1);

        System.out.println(minNumber);
    }
}
