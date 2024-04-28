package com.ChessLibrary;

import java.util.ArrayList;

public class ChessLibrary {
    public static ArrayList<Term> ChessLibrary;

    public ChessLibrary(){
        
    }

    static {
        ChessLibrary = new ArrayList<>();
        //Adding terms to the library in order to not be empty.
        Term fianchetto = new Term("fianchetto", "the development of a bishop " + 
        "to the board's longest diagonal on the file of the adjacent knight " +
        "(b2 or g2 for White; b7 or g7 for Black). ");
        Term fork = new Term("fork", "a simultaneous attack by a single " + 
        "piece on two (or more) of the opponent's pieces (or other direct target," + 
        " such as a mate threat).");
        Term zugzwang = new Term("zugzwang", "when a player is put at a disadvantage" +
        " by having to make a move; where any legal move weakens the position. Zugzwang usually" +
        " occurs in the endgame, and rarely in the middlegame.");

        ChessLibrary.add(fianchetto);
        ChessLibrary.add(fork);
        ChessLibrary.add(zugzwang);
    }

    //Adds a term to the ChessLibrary and then sorts it.
    public void addTerm(Term term) {
        ChessLibrary.add(term);
        ChessLibrary.sort(null); // used to sort the list after each addition
    }

    //Removes a term from the ChessLibrary
    public void removeTerm(Term term) {
        ChessLibrary.remove(term);
    }

    //checks if the ChessLibrary contains inputed term
    public boolean checkForDuplicates(Term term) {
        return ChessLibrary.contains(term);
    }

    //Finds a specific term in the ChessLibrary, else it returns null.
    public Term findTerm(Term term) {
        for (Term term2: ChessLibrary) {
            if (term2.equals(term)) {
                return term2;
            }
        }
        return null;
    }

    //Updates the description of a given term if it exists in the ChessLibrary.
    public void updateTerm(Term term, String description) {
        if (ChessLibrary.contains(term)) {
            Term term2 = this.findTerm(term);
            term2.setDescription(description);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Term term : ChessLibrary) {
            result += term.toString() + "\n";
        }
        return result;
    }

}
