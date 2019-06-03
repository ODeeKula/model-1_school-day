package schoolDay;

import java.util.ArrayList;
import java.util.List;

public class Teachers extends Person {

    private List<Subjects> teachersQualification = new ArrayList();

    public Teachers(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
    }

    public void addTeacherQualification(Subjects subjects)
    {
        if (!teachersQualification.contains(subjects)) teachersQualification.add(subjects);
    }

    /*
    Define a method that will get the size of added subjects:
     */
    public Integer getQualificationCount(){
        return teachersQualification.size();
    }
    /*
    define a method that returns all subjects a specific teacher teaches
     */
    public String getTeacherSubjects(){

        StringBuilder builder = new StringBuilder("SPECIFIC SUBJECTS A TEACHER QUALIFIED TO TEACH: \n");
        List<Subjects> subjects = teachersQualification;

        for(Subjects subs: subjects){
            builder.append(String.format("\t %s\n", subs));
        }
        return builder.toString();
    }
    /*
        // A teacher teach 1-more subjects
        Define a method called teachLessons that take subjects as parameter.
            * first check if subjects are there
            * that will check if subjects that a specific teacher teaches are >= 1
            * if then that teacher can teach
    */
    public boolean canTeachSubject(Subjects subject) {
        return teachersQualification.contains(subject);
    }
}
