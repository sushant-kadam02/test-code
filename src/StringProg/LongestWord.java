package StringProg;

import java.util.Comparator;
import java.util.stream.Stream;

public class LongestWord {

    public static void main(String[] args) {
        String sentence = "Hello my name is Sushant Kadam";

        System.out.println("sentence : "+sentence);

        String str = Stream.of(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println("longest world from sentence is : "+str);
    }
}
