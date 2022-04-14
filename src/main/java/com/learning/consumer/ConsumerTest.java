package com.learning.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (a)-> System.out.println(a);
        consumer.accept(200);

        Consumer<List<Integer> > consumer1 = list -> {
            for( int i=0; i<list.size(); i++){
                list.set(i, list.get(i)*4);
            }
        };
        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.stream().forEach(a-> System.out.println(a));
        consumer1.accept(list2);

        list2.stream().forEach(a-> System.out.println(a));

        Consumer<String> consumer2 = (a)-> System.out.println(a+" u r good");
        consumer2.accept("Rhea ");
    }




}
