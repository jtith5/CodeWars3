package Jevit.CodeWarsProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.*;

public class TotalPoints {

    static ArrayList<Integer> team1Score = new ArrayList<>();
    static ArrayList<Integer> team2Score = new ArrayList<>();


    public static int points(String[] games) {

        int points = 0;

        Pattern pattern = Pattern.compile("(?<Team1Score>\\d+):(?<Team2Score>\\d+)");


        for (int i = 0; i < games.length; i++) {
            Matcher matcher = pattern.matcher(games[i]);
            if (matcher.matches()) {
                System.out.println("Matches");
                team1Score.add(Integer.parseInt(matcher.group("Team1Score")));
                team2Score.add(Integer.parseInt(matcher.group("Team2Score")));
            }
            else {
                System.out.println("No Match");
            }
        }

        for (int i = 0; i < team1Score.size(); i++) {
            if (team1Score.get(i) > team2Score.get(i)){
                points += 3;
            } else if (team1Score.get(i) == team2Score.get(i)){
                points += 1;
            }
        }
        return points;
    }

    public static void main(String[] args) {
        String string = "1:2";
        String stringArray[] = string.split(":");
        System.out.println("original string: " + string);

        System.out.println("\n String array: " + Arrays.toString(stringArray));


    }
}
