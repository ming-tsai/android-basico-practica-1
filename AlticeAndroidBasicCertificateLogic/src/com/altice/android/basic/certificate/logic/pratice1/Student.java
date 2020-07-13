package com.altice.android.basic.certificate.logic.pratice1;

/*
 * It represent student
 */
public class Student implements IStudent {

    private String name;
    private int age;

    /*
     * Constructor with out anythings
     */
    public Student(){

    }

    /*
     * Constructor that initialized student name and age
     * @param namme it's name of student
     * @param age it's age of student
     */
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    /*
     * Return Name of Student
     */
    @Override
    public String getName() {
        return name;
    }

    /*
     * Return Age of Student
     */
    @Override
    public int getAge() {
        return this.age;
    }
}
