package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class Stream {
    public static void main(String args[]) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6,1,2,3);
        integerList.forEach(System.out::println);

        System.out.println(integerList.stream()
                   .filter(e -> e%2 == 0)
                   .mapToInt(e -> e*2)
                   .sum());

        List<Integer> doubleOfOddNumbers= integerList.stream()
                                                .filter(e -> e%2 != 0)
                                                .map(e -> e*2)
                                                .collect(toList());
        System.out.println(doubleOfOddNumbers);

//        Set<Integer> doubleOfOddNumbersInSet= integerList.stream()
//                                                .filter(e -> e%2 != 0)
//                                                .map(e -> e*2)
//                                                .collect(toSet());
//        System.out.println(doubleOfOddNumbersInSet);

        System.out.println(integerList.stream()
                                      .collect(toMap(e-> e, e->e*2)));

        integerList.stream()
                    .filter(e -> e%2==0)
                    .distinct()
                     .forEach(System.out::println);


    }
}