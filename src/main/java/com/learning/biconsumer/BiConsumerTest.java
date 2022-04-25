package com.learning.biconsumer;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerTest {
    public static void main(String[] args) {
        List<Integer> lista = List.of(101,102,103);
        List<Integer> listb = List.of(101,102,103);

        BiConsumer<List<Integer>,List<Integer>> consumer1=
                (list1,list2)->{
                  if(list1.size() != list2.size()){
                      System.out.println("False");
                  }else {
                      for(int i=0; i<list1.size(); i++){
                          if(list1.get(i) != list2.get(i)){
                              System.out.println("False");
                              return ;
                          }
                      }

                      System.out.println("True");
                  }
                };

        BiConsumer<List<Integer>,List<Integer>> consumer2 =
                (list3,list4)-> {
                 for(Integer x:list3){
                     System.out.println(x);
                 }
                    for(Integer j:list4){
                        System.out.println(j);
                    }
                };

        consumer1.andThen(consumer2).accept(lista,listb);
    }
}
