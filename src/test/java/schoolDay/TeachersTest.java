package schoolDay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeachersTest {

    @Test
    void shouldReturnTeacherIdentity() {
        Teachers teachers = new Teachers("Henry", "Osei-Wusu", "osei1wusu@gmail.com");
        assertEquals("Henry Osei-Wusu , osei1wusu@gmail.com" , teachers.getFirstName() + " " + teachers.getLastName() + " , " + teachers.getEmail());

    }

    @Test
    public void shouldBeAbleToCheckHowManySubjectsATeacherTeach(){
        Teachers teachers = new Teachers("Henry","Osei", "osei1wusu@gmail.com");
        teachers.addTeacherQualification(Subjects.Mathematics);
//        assertEquals(1, teachers.getQualificationCount());
    }





}
