package com.altice.android.basic.certificate.logic.pratice1;

import java.util.List;

public interface IStudentManager {
    List<Student> getAll();
    int getMaximumAge();
    int getMinimumAge();
    int getTotalOfStudent();
    double getAverageAge();
}
