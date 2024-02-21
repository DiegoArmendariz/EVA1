/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_3_tipo_datos;

/**
 *
 * @author diegd
 */
public class EVA1_3_TIPO_DATOS {

    public static void main(String[] args) {
byte pruebaByte; // 1 byte = 8 bits -> 256
pruebaByte = 127; // 256 1 byte = 8 bits -> 256
//prueba = 256; //256 no cabe en la variacion
pruebaByte = -127;
pruebaByte = 127; //acepta de -128 a 127
pruebaByte = -128;

short pruebaShort; //2 byte = 16 bits = --> 65536
//pruebaShort = -32769; no cabe
pruebaShort = -32768;
pruebaShort = 32767;
System.out.print(pruebaShort);//imprime la variable prueba
pruebaShort++;//++ --> operador, suma uno al contenido de la 
System.out.print(pruebaShort);
    }
}
