import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElementBetweenTwoList {
    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        List<Integer> l2 = Arrays.asList(3,4,5,6,7);

        List<Integer>result = l1.stream().filter(l2::contains).collect(Collectors.toList());

        System.out.println(result);

    }
}
