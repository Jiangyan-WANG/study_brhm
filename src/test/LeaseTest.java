package test;

import main.exercise_2.Lease;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeaseTest {

    Lease testLease;

    @BeforeEach
    public void createObject() {
        testLease = new Lease();
    }

    @Test
    void getName() {
        testLease.setName("Jack");
        assertEquals(testLease.getName(), "Jack");
        testLease.setName("Brett");
        assertEquals(testLease.getName(), "Brett");
    }

    @Test
    void getRent() {
        testLease.setRent(105.50);
        assertEquals(testLease.getRent(), 105.50);
        testLease.setRent(195.50);
        assertEquals(testLease.getRent(), 195.50);
    }

    @Test
    void getTerm() {
        testLease.setTerm(12);
        assertEquals(testLease.getTerm(), 12);
        testLease.setTerm(12);
        assertEquals(testLease.getTerm(), 12);
    }

    @Test
    void addPetFee() {
        double total = 105.50 + testLease.getFee();
        assertEquals(total, 115.50);
    }
}