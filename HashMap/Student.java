package HashMap;

import java.util.HashMap;
import  java.util.*;

//Question: Write a Java code snippet to demonstrate the usage of HashMap
//        for storing and retrieving student information. Each student has
//        a unique ID (integer) and a corresponding name (string). Implement the following operations:
//
//        Add a student to the HashMap.
//        Retrieve the name of a student based on their ID.
//        Remove a student from the HashMap based on their ID.
//        Print the total number of students in the HashMap.
//
public class Student {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aryan", 12); //Add a student to the HashMap.
        map.put("Sakshi", 5);
        map.put("Kritika", 1);
        map.put("Amar", 3);
        for (Map.Entry<String, Integer> e : map.entrySet()) {//Retrieve the name of a student based on their ID.
            if(e.getValue()==1){
                System.out.println(e.getKey());
            }
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) { //Remove a student from the HashMap based on their ID.
            if(e.getValue()==5){
                map.remove(e.getKey());
                System.out.println(map);
            }
        }
        System.out.println(map.size());// Print the total number of students in the HashMap.
    }

}