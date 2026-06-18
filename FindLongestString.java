import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLongestString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java","SpringBoot","Microservice");

        Optional<String>longestString = names.stream().sorted(Comparator.comparingInt(String::length).reversed()).limit(1).findFirst();
        System.out.println(longestString.get());
    }
}
