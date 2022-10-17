package test;
import main.exercise_5.Team;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {
    Team thisTest;

    @BeforeEach
    void setThisTest(){
        thisTest = new Team("St Johns", "Waterpolo", "Lion");
    }

    @Test
    void getSchool(){
        assertEquals(thisTest.getSchool(), "St Johns");
    }

    @Test
    void getSport(){
        assertEquals(thisTest.getSport(), "Waterpolo");
    }
    @Test
    void getMascot(){
        assertEquals(thisTest.getMascot(), "Lion");
    }
}
