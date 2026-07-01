package Arrays;

import java.util.Arrays;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int sumOfOdd = Arrays.stream(arr).filter(n -> n%2 != 0).sum();
        System.out.println(sumOfOdd);
    }
}
