package c5_exercuse_8;

import exercise_2.Lease;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomobileTest {
    Automobile testAutomobile;

    @BeforeEach
    public void createObject() {
        testAutomobile = new Automobile();
    }

    @Test
    void getId() {
        testAutomobile.setId(-1);
        assertEquals(0,testAutomobile.getId());
        testAutomobile.setId(564);
        assertEquals(564,testAutomobile.getId());
        testAutomobile.setId(11111);
        assertEquals(0,testAutomobile.getId());
    }

    @Test
    void getMake() {
        testAutomobile.setMake("China");
        assertEquals("China",testAutomobile.getMake());
    }

    @Test
    void getModel() {
        testAutomobile.setModel("Changcheng");
        assertEquals("Changcheng",testAutomobile.getModel());
    }

    @Test
    void getColor() {
        testAutomobile.setColor("red");
        assertEquals("red",testAutomobile.getColor());
    }

    @Test
    void getYear() {
        testAutomobile.setYear(2000);
        assertEquals(0,testAutomobile.getYear());

        testAutomobile.setYear(2008);
        assertEquals(2008,testAutomobile.getYear());

        testAutomobile.setYear(2030);
        assertEquals(0,testAutomobile.getYear());

    }

    @Test
    void getMilesPerGallon() {
        testAutomobile.setMilesPerGallon(8);
        assertEquals(0,testAutomobile.getMilesPerGallon());

        testAutomobile.setMilesPerGallon(45);
        assertEquals(45,testAutomobile.getMilesPerGallon());

        testAutomobile.setMilesPerGallon(88);
        assertEquals(0,testAutomobile.getMilesPerGallon());

    }
}