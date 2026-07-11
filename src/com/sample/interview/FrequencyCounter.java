package com.sample.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCounter {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,6,7,4,1,7,8,9,0,5,6,8,9,0,1};

        Map<Integer, Integer> frqMap = new HashMap<>();

        for (int num : arr) {
            frqMap.put(num, frqMap.getOrDefault(num, 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : frqMap.entrySet()) {
            System.out.println("Element : "+entry.getKey() +" Count : "+entry.getValue());
        }

         Map<Integer, Long> collectFreq = Arrays.stream(arr)
                 .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        collectFreq.forEach((key, value) ->
                System.out.println("Key : "+key +" Value : "+value)
        );


    }
}
