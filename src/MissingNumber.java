import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,2,8,5);
        System.out.println("Original list "+list);

        Optional<Integer> min  = list.stream().min(Integer::compare);
        Optional<Integer> max = list.stream().max(Integer::compare);

        System.out.println("Min :"+ min+ " Max : "+max);

        int arr[] = {1,2,1,2,8,5};

        int min1 = Arrays.stream(arr).min().getAsInt();
        int max1 = Arrays.stream(arr).max().getAsInt();

        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());

        List<Integer> missingElement = IntStream.rangeClosed(min1, max1)
                .boxed()
                .filter(x -> !collect.contains(x))
                .collect(Collectors.toList());

        System.out.println("Missing numbers are : "+missingElement);


    }
}
