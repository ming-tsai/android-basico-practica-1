package com.altice.android.certificate.basic.ui.pratice1;

/*
 * Main of program
 */
public class Main {

    public static void main(String[] args) {

        MenuPractice menuPratice1 = new MenuPractice();
        try{
            menuPratice1.printMenuPratice();
        }catch (Exception exception){
            System.out.println("Hubo un excepcion de obtener interface");
        }
    }
}