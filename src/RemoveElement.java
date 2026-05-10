import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Remove duplicate and show in sorted order
 */

public class RemoveElement {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0,1,5,3,0,5,2,1,2);

        List<Integer> list1 =  list.stream()
                .distinct()
                .sorted()
                //.skip(2)
                .collect(Collectors.toList());

        System.out.println(list1);

    }
}
