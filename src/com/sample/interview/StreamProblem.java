package com.sample.interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProblem {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(8);
        list.add(9);
        list.add(0);

        System.out.println("List : "+list);

        //1. Find all distinct elements
        List<Integer> ls = list.stream()
                .distinct()
                .toList();  //collect(Collectors.toList());

        System.out.println("Distinct : "+ls);


        //Sort the data

        List<Integer> sort = list.stream()
                .sorted()
                .toList();
        System.out.println("Sorted : "+sort);

        //Sort distinct

        List<Integer> sortDist = list.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toUnmodifiableList());

        System.out.println("Sort Distinct : "+sortDist);

        // frequency count
        Map<Integer, Long> frequency = list.stream()
                .collect(Collectors.groupingBy(X-> X, Collectors.counting()));

        System.out.println("frequency : "+frequency);

        // find mix element
        int max  = list.stream()
                .sorted(Comparator.reverseOrder())
                .findFirst().get();

        System.out.println("Max : "+max);

        int maxx = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("maxx : "+ maxx);

        int min = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Min : "+min);

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum : "+sum);

        int add = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Summ add : "+add);

        Double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        System.out.println("Average : "+avg);

        //find duplicate
        List<Integer> dup = list.stream()
                .filter(x -> Collections.frequency(list, x) > 1)
                .distinct()
                .collect(Collectors.toUnmodifiableList());
        System.out.println("Duplicate : "+dup);



    }
}
