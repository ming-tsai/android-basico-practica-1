package com.altice.android.basic.certificate.logic.pratice1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Managing your Students
 */
public class StudentManager implements IStudentManager {

    private static List<Student> students;
    private final static int oneHundred = 100;

    /*
     * Register your students to manage it
     */
    public StudentManager(List<Student> students) {
        StudentManager.students = students;
    }

    /*
     * Get list of your students
     */
    @Override
    public List<Student> getAll() {
        return students;
    }

    /*
     * Get oldest student age
     */
    @Override
    public int getMaximumAge() {
        int maximumAge = 0;

        try {
            maximumAge = doGetMaximumAge();
        } catch (NullPointerException exception){
            System.out.println("No tienen edad maximo");
        }
        catch (Exception exception) {
            System.out.println("Hubo un excepcion obteniendo edad maxio: " + exception.getCause());
        }
        return maximumAge;
    }

    private int doGetMaximumAge() {
        if (getMaxAge().isPresent()){
            return getMaxAge().get().getAge();
        }
        return 0;
    }

    private Optional<Student> getMaxAge() {
        return getStudentsStream().max(getComparingStudentAge());
    }

    /*
     * Get youngest student age
     */
    @Override
    public int getMinimumAge() {
        int minimumAge = 0;
        try {
            minimumAge = doGetMinimumAge();
        } catch (NullPointerException exception){
            System.out.println("No tienen edad minimo");
        }catch (Exception exception) {
            System.out.println("Hubo un excepcion obteniendo edad minimo: " + exception.getCause());
        }

        return minimumAge;
    }

    private int doGetMinimumAge() {

        if(getMinAge().isPresent()){
            return getMinAge().get().getAge();
        }
        return 0;
    }

    private Optional<Student> getMinAge() {
        return getStudentsStream().min(getComparingStudentAge());
    }

    private Comparator<Student> getComparingStudentAge() {
        return Comparator.comparing(Student::getAge);
    }

    /*
     * Get how much student do you have
     */
    @Override
    public int getTotalOfStudent() {
        int totalOfStudent = 0;
        try{
            totalOfStudent = doGetTotalOfStudent();
        }catch (NullPointerException exception){
            System.out.println("No tienen total de estudiante");
        }catch (Exception exception){

            System.out.println("Hubo un excepcion obteniendo total de estudiante: " + exception.getCause());
        }
        return totalOfStudent;
    }

    private int doGetTotalOfStudent() {
        return students.size();
    }

    /*
     * Get average age in your students
     */
    @Override
    public double getAverageAge() {
        double averageAge = 0;
        try{
            averageAge = doGetAverageAge();
        }catch (NullPointerException exception){
            System.out.println("No tienen edad promedio");
        }catch (Exception exception){

            System.out.println("Hubo un excepcion obteniendo edad promedio: " + exception.getCause());
        }
        return averageAge;
    }

    private double doGetAverageAge(){
        return  getTwoDecimal(getStudentsStream().collect(getStudentAverageAgeDoubleCollector()));
    }

    private Stream<Student> getStudentsStream() {
        return students.stream();
    }

    private Collector<Student, ?, Double> getStudentAverageAgeDoubleCollector() {
        return Collectors.averagingDouble(Student::getAge);
    }

    private double getTwoDecimal(double value) {
        return Math.floor(value * oneHundred) / oneHundred;
    }
}
