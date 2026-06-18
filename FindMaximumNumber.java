import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaximumNumber {
    public static void main(String[] args) {
        List<Integer>number = Arrays.asList(3,5,4,1,10);
        
        int maxNumber = number.stream().max(Comparator.comparingInt(Integer::intValue)).orElse(-1);
        System.out.println(maxNumber);
    }
}
