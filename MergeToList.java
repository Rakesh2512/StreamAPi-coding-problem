import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class MergeToList {
    public static void main(String[] args) {
        List<String>name = Arrays.asList("Rakesh","Ranveer");
        List<String>fruit = Arrays.asList("Banana","Guava");

        List<String>marge = Stream.concat(name.stream(), fruit.stream()).toList();

        System.out.println(marge);


        //using flatmap

        List<String>marge1 = Stream.of(name,fruit).flatMap(Collection::stream).toList();

        System.out.println(marge1);
    }
}
