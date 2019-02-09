package Jevit.CodeWarsProblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class Collections {

    public static void main(String[] args) {
        ArrayList arrayListOne;

        arrayListOne = new ArrayList();

        ArrayList arrayListTwo = new ArrayList();

        ArrayList<String> names = new ArrayList<>();

        names.add("John Smith");
        names.add("Mohamed Alami");
        names.add("Oliver Miller");

        names.add(2,"Jack Ryan");

        names.set(0,"John Adams");

        names.remove(3);


        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        Iterator indivItems = names.iterator();

        while(indivItems.hasNext()){
            System.out.println(indivItems.next());
        }

        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        nameCopy.addAll(names);

        String paulYoug = "Paul young";

        names.add(paulYoug);

        if (names.contains(paulYoug)){
            System.out.println("Paul is here");
        }

        if (names.contains(nameCopy)){
            System.out.println("Everything in nameCopy is in names");
        }

        if (names.isEmpty()){
            System.out.println("ArrayList is Empty");
        }

        Object[] moreNames = new Object[4];
        moreNames = nameCopy.toArray();

        System.out.println(Arrays.toString(moreNames));
    }
}
