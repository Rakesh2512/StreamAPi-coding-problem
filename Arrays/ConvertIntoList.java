package Arrays;

import java.util.Arrays;
import java.util.List;

public class ConvertIntoList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4};

        List<Integer>list = Arrays.stream(arr).boxed().toList();

        System.out.println(list);
    }
}
