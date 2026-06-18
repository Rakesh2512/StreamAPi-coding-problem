import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        
       List<Integer> numbers = Arrays.asList(1,2,3,4,2,5,3,6);

       Set<Integer>st = new HashSet<>();
       
       List<Integer>duplicate = numbers.stream().filter(n -> !st.add(n)).collect(Collectors.toList());

       System.out.print(duplicate);

    }
}
