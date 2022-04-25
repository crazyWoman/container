package com.learning.biconsumer;



import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;


public class BiConsumerPractise {


    public static void main(String[] args) {
        Map<Integer, String> person = new HashMap();
        person.put(1,"smitha");
        person.put(2,"rhea");

        Consumer<Map<Integer, String>> updatePersons = Util::updateData;

        Consumer<Map<Integer, String>> displayPersons = Util::displayData;

        updatePersons.accept(person);

        displayPersons.accept(person);

    }

}
class Util{
    static void updateData(Map<Integer, String>  persons) {
        persons.replaceAll((k, v) -> "Helloo- ".concat(v));
    }

    static void displayData(Map<Integer, String> persons) {
        for (Map.Entry<Integer, String> entry : persons.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}



