package com.ChessLibrary;

import static org.mockito.Mockito.when;

import org.junit.Before;
public class ChessLibraryTest {

    
    Term term;
    Term term2;
    Term term3;
    ChessLibrary cl;

    @Before
    public void setUp(){
        term = new Term("fianchetto", "the development of a bishop " + 
        "to the board's longest diagonal on the file of the adjacent knight " +
        "(b2 or g2 for White; b7 or g7 for Black). ");
        term2 = new Term("fork",  "a simultaneous attack by a single " + 
        "piece on two (or more) of the opponent's pieces (or other direct target," + 
        " such as a mate threat).");
        term3 = new Term("fianchetto", "description");
        cl = new ChessLibrary();
        cl.addTerm(term);
    }

    

    public void InputTest() {
        when(cl.checkForDuplicates(term)).thenReturn(true);
    }

}