package org.brujula;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class FighterTest {

    @Test
    public void fighterTest(){
        Fighter fighter = new Fighter("Toni", 10, 10);
        setLife(5);
        assertEquals(5, fighter.getLife());
        assertEquals(10, fighter.getAttack);
        assertEquals("Toni", fighter.getName());
        //assertEquals(0, fighter.combat());
    }
    /*
    @Test
    public void basicTests() {
        assertEquals("Lew", Kata.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4)));
        assertEquals("Harry", Kata.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4)));
        assertEquals("Harald", Kata.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4)));
        assertEquals("Harald", Kata.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4)));
        assertEquals("Harald", Kata.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5)));
        assertEquals("Harald", Kata.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5)));
    }*/
}