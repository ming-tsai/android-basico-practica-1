package com.altice.android.certificate.basic.ui.pratice1;

import com.altice.android.basic.certificate.logic.pratice1.Student;
import com.altice.android.basic.certificate.logic.pratice1.StudentManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class MenuPractice {

    private static final ArrayList<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student("Juan", 24),
                    new Student("Erica", 20),
                    new Student("Emilio", 23),
                    new Student("Karina", 21),
                    new Student("Eduardo", 24),
                    new Student("Tomas", 25)
            )
    );

    void printMenuPratice() {

        StudentManager studentManager = new StudentManager(students);

        int optionSelected;
        do{
            printMenu();

            optionSelected = scannerInt();

            switch (optionSelected) {
                case 1:
                    printTotal(studentManager.getTotalOfStudent());
                    break;
                case 2:
                    printMinimumAge(studentManager.getMinimumAge());
                    break;
                case 3:
                    printMaximumAge(studentManager.getMaximumAge());
                    break;
                case 4:
                    printAverageAge(studentManager.getAverageAge());
                    break;
                case 5:
                    printStudents(studentManager);
                    break;
                case 6:
                    printMessage("Bye");
                    break;
                default:
                    printMessage("No tenemos opcion: " + optionSelected);
                    break;
            }

            waitKey();
        }while (optionSelected != 6);
    }


    private void printMenu() {
        printMessage("\033[H\033[2J");
        printMessage("**Menu**");
        printMessage("  1. Total de estudiantes");
        printMessage("  2. Edad mínima");
        printMessage("  3. Edad máxima");
        printMessage("  4. Edad promedio");
        printMessage("  5. Imprimir todos los estudiantes");
        printMessage("  6. Salir");
    }

    private void printTotal(int totalStudent) {
        printMessage("Total de estudiante es: " + totalStudent);
    }

    private void printMinimumAge(int minimumAge) {
        printMessage("Edad mínima de los estudiantes es: " + minimumAge);
    }

    private void printMaximumAge(int maximumAge) {
        printMessage("Edad máxima de los estudiantes es: " + maximumAge);
    }

    private void printAverageAge(double averageAge) {
        printMessage("Edad promedio de los estudiantes es: " + averageAge);
    }

    private void printStudents(StudentManager studentManager) {
        for(Student student: studentManager.getAll()){
            printMessage("Nombre: " + student.getName());
            printMessage("Edad: " + student.getAge());
            printLine();
        }
    }

    private int scannerInt() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        return 0;
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    private void waitKey() {
        try{
            printMessage("waiting...");

            //noinspection ResultOfMethodCallIgnored
            System.in.read();
        }catch (IOException ioexception){
            printMessage(ioexception.getMessage());
        }
    }

    private void printLine(){
        printMessage("");
    }

    private void printMessage(String message){
        System.out.println(message);
    }
}