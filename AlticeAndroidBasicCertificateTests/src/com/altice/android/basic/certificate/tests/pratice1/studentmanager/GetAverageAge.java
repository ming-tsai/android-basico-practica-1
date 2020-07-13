package com.altice.android.basic.certificate.tests.pratice1.studentmanager;

import com.altice.android.basic.certificate.logic.pratice1.Student;
import com.altice.android.basic.certificate.logic.pratice1.StudentManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class GetAverageAge {

    @Test
    public void Pass_Students_The_Average_Should_Be_Expected() {

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

        double expected = 21.33d;

        Assertions.assertEquals(expected, studentManager.getAverageAge());
    }
}
