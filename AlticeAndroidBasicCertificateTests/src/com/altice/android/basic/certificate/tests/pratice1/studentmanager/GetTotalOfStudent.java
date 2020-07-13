package com.altice.android.basic.certificate.tests.pratice1.studentmanager;

import com.altice.android.basic.certificate.logic.pratice1.Student;
import com.altice.android.basic.certificate.logic.pratice1.StudentManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class GetTotalOfStudent {

    @Test
    public void Pass_2_Students_Should_Have_2_Students() {

        StudentManager studentManager = new StudentManager(new ArrayList<>(
                Arrays.asList(
                        new Student("Juan", 24),
                        new Student("Erica", 20),
                        new Student("Emilio", 23)
                )
        ));

        int expected = 3;

        Assertions.assertEquals(expected, studentManager.getTotalOfStudent());
    }

    @Test
    public void Pass_5_Students_Should_Have_5_Students() {

        StudentManager studentManager = new StudentManager(new ArrayList<>(
                Arrays.asList(
                        new Student("Juan", 24),
                        new Student("Erica", 20),
                        new Student("Emilio", 23),
                        new Student("Karina", 21),
                        new Student("Eduardo", 24),
                        new Student("Tomas", 16)
                )
        ));

        int expected = 6;

        Assertions.assertEquals(expected, studentManager.getTotalOfStudent());
    }
}
