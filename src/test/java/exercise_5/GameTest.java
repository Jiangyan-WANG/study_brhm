package exercise_5;

import exercise_2.Lease;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game testGame;

    @BeforeEach
    public void createObject() {
        testGame = new Game();
    }

    @Test
    void getTime() {
        testGame.setTime(7,30);
        assertEquals(testGame.getTime(), "7:30");
        testGame.setTime(16,0);
        assertEquals(testGame.getTime(), "16:0");
    }

}