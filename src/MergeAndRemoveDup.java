import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeAndRemoveDup {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,0);
        List<Integer> list2 = Arrays.asList(3,4,5,6,7,8,9,0);

        List<Integer> result = Stream.concat(list1.stream(),
                list2.stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique merged numbers are : "+result);
    }
}
