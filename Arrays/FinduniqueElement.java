package Arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FinduniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5,6,3};

        int[] ans =  Arrays.stream(arr).boxed()
                          .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                          .entrySet()
                          .stream()
                          .filter(v -> v.getValue() == 1)
                          .mapToInt(k -> k.getKey()).toArray();

        System.out.println(Arrays.toString(ans)); 
        
        

        //Frequency of Each number

        Map<Integer,Long>fre = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(fre);                          
                       
                       
    }
}
