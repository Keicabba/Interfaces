package it.figuccia;

public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {
    boolean isGoingToBeAPhD;

    public Assistant(String n, String s, int id, boolean willBeAPhD) {
        name = n;
        surname = s;
        collegeId = id;
        isGoingToBeAPhD = willBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("I am an assistant and I am currently studying at home for my PhD.");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("I am an assistant and I am currently teaching a class.");
    }
}
