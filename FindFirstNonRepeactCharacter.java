import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeactCharacter {
    public static void main(String[] args) {
        String str = "aabbccddef";

        char ans = str.chars().mapToObj(c -> (char)c)
                  .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                  .entrySet()
                  .stream()
                  .filter(value -> value.getValue() == 1)
                  .map(key -> key.getKey())
                  .findFirst().orElse(null);

        System.out.println(ans);          

    }
}
