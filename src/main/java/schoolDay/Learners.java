package schoolDay;

import java.util.ArrayList;
import java.util.List;

public class Learners extends Person{

    private List<Subjects> learnerSubjects = new ArrayList();

    public Learners(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
    }


    /*
   Define a method that will allow students to register subjects
    */
    public void addStudentSubjects(Subjects subjects){
        if (!learnerSubjects.contains(subjects)) learnerSubjects.add(subjects);
    }
    /*
    Define a method that will allow students to attend Lesson.
        * if registered subjects for learners are less than 3 then learners doesn't qualify to attend lesson
     */
    public  boolean attendLesson(Subjects subjects){
        return learnerSubjects.contains(subjects) && getRegisteredSubjectsLength() >= 3;
//        return "Learn can attend class";
//        else return  "Your Subjects Are less Than Three";
    }
    /*
    Define a method that will get all subjects that a particular student registered for
     */
    public String getRegisteredSubjects(){
        //Define a String Builder to bundle subjects
        StringBuilder builder = new StringBuilder("REGISTERED SUBJECTS:\n");
        //Define an empty list to store bundled data
        List<Subjects> subjects = learnerSubjects;
        for(Subjects subs: subjects){
            builder.append(String.format("\t %s\n", subs));
        }
        return builder.toString();
    }
    /*
    Define a method that will get the length of subjects for learners
     */
    public Integer getRegisteredSubjectsLength(){
        return learnerSubjects.size();
    }
}
