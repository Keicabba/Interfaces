package it.figuccia;

public class Professor extends CollegePerson implements TeachingPerson {
    // attribute
    public String teachingSubject;

    // constructor that takes 4 params and assigns their values to the right attributes
    public Professor(String n, String s, int id, String subject) {
        name = n;
        surname = s;
        collegeId = id;
        teachingSubject = subject;
    }

    // method that overrides the abstract method from the interface with an informative message
    @Override
    public void teachToOtherPeople() {
        System.out.println("I am teaching " + teachingSubject + " to other people.");
    }
}