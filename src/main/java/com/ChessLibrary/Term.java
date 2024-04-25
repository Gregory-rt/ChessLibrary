package com.ChessLibrary;

public class Term implements Comparable<Term>{
    private String name;
    private String description;

    public Term(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }
    @Override 
    public String toString(){
        return "The term " + getName() + " is used to describe " +
                getDescription();
    }

    //Compares terms based on the name.
    @Override
    public int compareTo(Term other) {
        return this.name.compareTo(other.getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Term term = (Term) obj;
        return name.equals(term.name);
    }
}
