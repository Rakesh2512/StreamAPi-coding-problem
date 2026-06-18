import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateNumber {

    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,2,3,4,2,5,3,6);

        List<Integer>removeDuplicate = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println(removeDuplicate);
    }
}