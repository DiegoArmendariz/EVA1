/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Mavenproject1 {

    public static void main(String[] args) {
    //DECLARAR NUESTRA VARIABLE
    String nombre ;
    int edad ;
    System.out.println("Introduce tu nombre");
    //CREAR NUESTRO SCANNER
    Scanner captura = new Scanner(System.in);
    //CAPTURA
    nombre = captura.nextLine();
    System.out.println("Introduce tu edad");
    edad = captura.nextInt();
    System.out.println("Tu nombre es");
    System.out.println(nombre);
    System.out.println("Tu edad es");
    System.out.println(edad);
    }
}
