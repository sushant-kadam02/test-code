package StringProg;

import java.util.Arrays;

public class reverseWords {

    public static void main(String[] args) {

        //String input = "the sky is blue";
        String input = "  a good   example ";

        String[] splitStr = input.trim().split("\\s+");

        int start = 0;
        int end = splitStr.length - 1;

        while (start < end) {
            String temp = splitStr[start];
            splitStr[start] = splitStr[end];
            splitStr[end] = temp;
            start++;
            end--;
        }
        System.out.println(String.join(" ", splitStr));
    }

}
