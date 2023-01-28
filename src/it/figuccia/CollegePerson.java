package it.figuccia;

public class CollegePerson {
    // attributes
    public String name;
    public String surname;
    public int collegeId;

    // method that prints all the CollegePerson attributes
    public void goToCollege() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("College ID: " + collegeId);
    }
}