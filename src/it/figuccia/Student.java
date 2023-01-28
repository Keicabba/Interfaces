package it.figuccia;

public class Student extends CollegePerson implements LearningPerson {
    // attribute
    public int academicYear;

    // constructor that takes 4 params and assigns their values to the right attributes
    public Student(String n, String s, int id, int year) {
        name = n;
        surname = s;
        collegeId = id;
        academicYear = year;
    }

    // method that overrides the abstract method from the interface with an informative message
    @Override
    public void studyAtHome() {
        System.out.println("I am studying at home.");
    }
}
