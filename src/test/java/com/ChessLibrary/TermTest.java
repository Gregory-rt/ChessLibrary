package com.ChessLibrary;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

public class TermTest {

    Term term;
    Term term2;
    Term term3;

    @Before
    public void setUp(){
        term = new Term("fianchetto", "the development of a bishop " + 
        "to the board's longest diagonal on the file of the adjacent knight " +
        "(b2 or g2 for White; b7 or g7 for Black). ");
        term2 = new Term("fork",  "a simultaneous attack by a single " + 
        "piece on two (or more) of the opponent's pieces (or other direct target," + 
        " such as a mate threat).");
        term3 = new Term("fianchetto", "description");
    }
     
    @Test
    public void testCompareTo(){
        assertTrue(term.compareTo(term2) > 0);
        assertTrue(term2.compareTo(term) < 0);
    }

    @Test
    public void testEquals(){
        assertFalse(term.equals(term2));
        assertTrue(term.equals(term3)); 
    }
}
