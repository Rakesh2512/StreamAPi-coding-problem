import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceofWord {
    public static void main(String[] args) {
        String str = "java stream java api java";
        String[] word  =  str.split(" ");

        Map<String,Long>CountOccurenceofWord = Arrays.stream(word).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(CountOccurenceofWord);
    }
}
