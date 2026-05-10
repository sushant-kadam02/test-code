package StringProg;

import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {

        String str = "happy weekend";

        System.out.println("Original String : "+str);
        String newStr = "";

        char[] ch = str.toCharArray();
        for (int i = ch.length-1; i >= 0; i--) {
            newStr += ch[i];

        }

        System.out.println("Old style Revers String : "+newStr);

        String rev = Stream.of(str.split(""))
                .reduce("", (p, n) -> n + p);

        System.out.println("Reverse string with stream : "+rev);

    }

}
