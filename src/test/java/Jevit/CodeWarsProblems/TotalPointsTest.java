package Jevit.CodeWarsProblems;

import org.junit.Test;

import static org.junit.Assert.*;

public class TotalPointsTest {

    @Test
    public void points() {
        assertEquals(30, TotalPoints.points(new String[]
                {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));
    }
}