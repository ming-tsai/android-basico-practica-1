package com.altice.android.basic.certificate.tests.pratice1.studentmanager;

import com.altice.android.basic.certificate.logic.pratice1.Student;
import com.altice.android.basic.certificate.logic.pratice1.StudentManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class GetAll {

    @Test
    public void Pass_Students_Should_Be_Same_Students() {

        ArrayList<Student> expectedStudents = new ArrayList<>(
                Arrays.asList(
                        new Student("Juan", 24),
                        new Student("Erica", 20),
                        new Student("Emilio", 23),
                        new Student("Karina", 21),
                        new Student("Eduardo", 24),
                        new Student("Tomas", 25)
                )
        );

        StudentManager studentManager = new StudentManager(expectedStudents);

        Assertions.assertEquals(expectedStudents, studentManager.getAll());
    }
}
