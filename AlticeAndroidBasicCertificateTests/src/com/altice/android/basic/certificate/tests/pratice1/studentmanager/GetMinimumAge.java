package com.altice.android.basic.certificate.tests.pratice1.studentmanager;

import com.altice.android.basic.certificate.logic.pratice1.Student;
import com.altice.android.basic.certificate.logic.pratice1.StudentManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;

public class GetMinimumAge {
    @ParameterizedTest
    @ValueSource(ints = 20)
    public void Pass_Student_Should_Be_Expected_Age_20(int expected) {

        StudentManager studentManager = new StudentManager(new ArrayList<>(
                Arrays.asList(
                        new Student("Juan", 24),
                        new Student("Erica", 20),
                        new Student("Emilio", 23),
                        new Student("Karina", 21),
                        new Student("Eduardo", 24),
                        new Student("Tomas", 25)
                )
        ));

        Assertions.assertEquals(expected, studentManager.getMinimumAge());
    }

    @ParameterizedTest
    @ValueSource(ints = 16)
    public void Pass_Student_Should_Be_Expected_Age_16(int expected) {

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

        Assertions.assertEquals(expected, studentManager.getMinimumAge());
    }
}
