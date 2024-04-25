package com.ChessLibrary;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ChessLibrary cl = new ChessLibrary();
        Scanner input = new Scanner(System.in);
        String menu = "Press: \n0 to exit \n" +
                      "1 for the whole list of supported chess terminology \n" +
                      "2 in order to check for a specific term \n" +
                      "3 to add a new term";
        System.out.println("Hi there! This is ChessLibrary, the perfect place " + 
                           "for Beginner-Intermediate chess players that want to " +
                           "broaden their chess vocabulary.");
        System.out.println(menu);
        int x = input.nextInt();
        input.nextLine();
        while (x != 0) {
            if (x == 1) {
                System.out.println(cl.toString());
            } else if (x == 2) {
                System.out.println("Please enter the term you are searching for:");
                String termname = input.nextLine();
                Term term = new Term(termname, "");
                if (cl.checkForDuplicates(term)) {
                    Term term2 = cl.findTerm(term);
                    System.out.println(term2.toString());
                } else {
                    System.out.println("The term you are searching for was not found." +
                    "Check for misspells or consider adding it to ChessLibrary.");
                }
            } else if (x == 3) {
                System.out.println("Please enter the term's name:");
                String termname2 = input.nextLine();
                System.out.println("Please enter the term's description." +
                "The description should be continuing the sentence" +
                " 'the term is used to describe...'");
                String description = input.nextLine();
                Term term3 = new Term(termname2, description);
                if (cl.checkForDuplicates(term3)) {
                    System.out.println("The term " + term3.getName() + " already exists in" +
                    "the ChessLibrary");
                } else {
                    cl.addTerm(term3);
                    System.out.println("The term " + term3.getName() + " has been added succefully");
                }
            } else {
                System.out.println("Please enter a valid option. ");
                System.out.println(menu);
            }
            System.out.println(menu);
            x = input.nextInt();
            input.nextLine();
        }
        input.close();
    }
}
