package com.altice.android.basic.certificate.tests.pratice1.student;

import com.altice.android.basic.certificate.logic.pratice1.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GetAge {
    @ParameterizedTest
    @CsvSource({"21,21","40,40"})
    public void Set_Age_Should_Get_Expected_Age(int age, int expected) {
        Student student = new Student("Test", age);

        Assertions.assertEquals(expected, student.getAge());
    }
}
