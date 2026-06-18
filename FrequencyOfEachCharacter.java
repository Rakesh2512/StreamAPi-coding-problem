import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {

        String str = "hello";

        Map<Character,Long>FrequencyOfEachCharacter = str.chars().mapToObj(c -> (char)c)
        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));


        System.out.println(FrequencyOfEachCharacter);

        FrequencyOfEachCharacter.forEach((key,value)->{System.out.println(key+" "+value);});


    }
}
