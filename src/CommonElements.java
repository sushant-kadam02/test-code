import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1,2,3,5,6,7,8,9);
        List<Integer> l2 = Arrays.asList(4,5,6,7,8,8,9,0);

        List<Integer> result = l1.stream()
                .filter(l2::contains)
                .collect(Collectors.toList());

        System.out.println("Print only common element from the both list : ");
        System.out.println(result.toString());


    }
}
