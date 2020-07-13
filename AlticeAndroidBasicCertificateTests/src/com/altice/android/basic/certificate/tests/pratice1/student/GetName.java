package com.altice.android.basic.certificate.tests.pratice1.student;

import com.altice.android.basic.certificate.logic.pratice1.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GetName {

    @ParameterizedTest
    @CsvSource({"Juan,Juan","Jhon,Jhon"})
    public void Set_Name_Should_Get_Expected_Name(String name, String expected) {
        Student student = new Student(name, 20);

        Assertions.assertEquals(expected, student.getName());
    }
}
