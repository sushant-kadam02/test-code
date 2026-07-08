package com.sample.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MoveZeros {
    public static void main(String[] args) {
        int num[] = {0,1,0,3,12};
        int counter = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                int tmp = num[i];
                num[i] = num[counter];
                num[counter] = tmp;
                counter++;
            }
        }
        System.out.println("num array: "+ Arrays.toString(num));

    }

}
