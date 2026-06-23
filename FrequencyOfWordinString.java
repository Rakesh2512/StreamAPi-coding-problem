import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWordinString {
    public static void main(String[] args) {
        String s = "Rakesh paswan is Rakesh";
        String[] ss = s.split(" ");

        Map<String,Long>countOfWord = Arrays.stream(ss).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(countOfWord);
    }
}
