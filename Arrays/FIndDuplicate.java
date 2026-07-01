package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FIndDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,6};

        Set<Integer>st = new HashSet<>();

        int duplicate = Arrays.stream(arr).filter(n -> !st.add(n)).findFirst().orElse(-1);
        System.out.println(duplicate);
    }
}
