/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_asigantura;

import java.util.Scanner;

/**
 *
 * @author diegd
 */
public class Eva1_6_ASIGANTURA {

    public static void main(String[] args) {
        //tTodo code application logic here
        //clave, nombre, credito, hrTeo, hr Pr, carrera
        //tipoMat
        String clave, nombre, carrera;
        int creditos, horasTeoria, horasPracticas;
        boolean tipoMat;
        //CAPRURA
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la clave de la asignatura");
        clave = captu.nextLine();
        System.out.println("Introduce la nombre de la asignatura");
        nombre = captu.nextLine();
        System.out.println("Introduce la carrera de la asignatura");
        carrera = captu.nextLine();
        System.out.println("Introduce la creditos de la asignatura");
        creditos = captu.nextInt();
        System.out.println("Introduce la horas de teoria de la asignatura");
        horasTeoria = captu.nextInt();
        System.out.println("Introduce la horas de practicas de la asignatura");
        horasPracticas = captu.nextInt();
        System.out.println("Introduce la tipo de materia de la asignatura");
        tipoMat = captu.nextBoolean();
        
        //HACER ALGO CON LOS DATOS CAPTURADOS
        System.out.println("DATOS DE LA ASIGNATURA");
        System.out.println(clave);
        System.out.println(nombre);
        System.out.println(carrera);
        System.out.println(creditos);
        System.out.println(horasTeoria);
        System.out.println(horasPracticas);
        System.out.println(tipoMat);
        
    }
}
