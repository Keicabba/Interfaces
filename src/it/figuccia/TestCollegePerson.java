package it.figuccia;

public class TestCollegePerson {
    public static void main(String[] args) {
        // create 3 objects
        Student student = new Student("Peter", "Parker", 123, 2);
        Professor professor = new Professor("Otto", "Octtavius", 456, "Science");
        Assistant assistant = new Assistant("Scarlett", "Johansson", 789, true);

        // Test goToCollege() of objects
        System.out.println("- student");
        student.goToCollege();
        System.out.println("- Professor");
        professor.goToCollege();
        System.out.println("- Assistant");
        assistant.goToCollege();

        // test implementations
        student.studyAtHome();
        professor.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}