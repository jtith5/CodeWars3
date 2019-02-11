package Jevit.CodeWarsProblems;

import java.util.ArrayList;

public class CountTheDigit {
    public static int nbDig(int n, int d) {

        ArrayList<Integer> squareInts = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        int count = 0;

        String c = Integer.toString(d);

        for (int i = 0; i <= n; i++) {
            squareInts.add(i*i);
            str.append(squareInts.get(i));
        }
        System.out.println(squareInts.toString());
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1).equals(c) ){
                count ++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        nbDig(10,1);
    }
}
