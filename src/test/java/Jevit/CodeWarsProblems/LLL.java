package Jevit.CodeWarsProblems;

import java.util.Arrays;
import java.util.LinkedList;

public class LLL {

    public static void main(String[] args) {

        LinkedList linkedListOne = new LinkedList();

        LinkedList<String> names = new LinkedList<>();

        names.add("Ahmed Bennani");
        names.add("Ali Syed");
        names.add(0,"Noah Peters");
        names.set(2,"Paul Newman");
//        names.remove(4);
        names.remove("Joshua Smith");



        for (String name : names){
            System.out.println(name);
        }

        System.out.println("\nFirst Index: " + names.get(0));
        System.out.println("\nLast Index: " + names.getLast());

        LinkedList<String> nameCopy = new LinkedList<>();

        System.out.println("\nnameCopy: " + nameCopy);

    }
}
