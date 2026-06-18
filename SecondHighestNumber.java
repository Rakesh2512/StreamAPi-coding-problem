import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,5,30,20,50,40);

        Optional<Integer>secondHighestnumber = list.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed())
                            .limit(2).skip(1).findFirst();

        System.out.println(secondHighestnumber.get());                    
    }
}
