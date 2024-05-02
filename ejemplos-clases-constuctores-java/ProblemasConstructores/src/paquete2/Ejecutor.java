/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
//import paquete2.

import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
         */
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        String ciudad;
        int numeroDoctores;
        int numeroEnfermeros;
        
        Hospital h1 = new Hospital("Militar", "Loja", 1000, 3000);
        
        System.out.print("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.print("Ingrese la Ciudad");
        ciudad = entrada.nextLine();
        System.out.print("Ingrese el numero de Doctores");
        numeroDoctores = entrada.nextInt();
        System.out.print("Ingrese el numero de Enfermeros");
        numeroEnfermeros = entrada.nextInt();
        
        
        
        h1.establecerNombre(nombre);
        h1.establecerCiudad(ciudad);
        h1.establecerNumeroDoctores(numeroDoctores);
        h1.establecerNumeroEnfermeros(numeroEnfermeros);
        
        
        System.out.printf("\nNombre :%s\n"
                + "Ciudad : %s\n"
                + "Numero de Doctores : %s\n"
                + "Numero de Enfermeros : %d\n"
                + "",
                h1.obtenerNombre(),
                h1.obtenerCiudad(),
                h1.obtenerNumeroDoctores(),
                h1.obtenerNumeroEnfermeros());

          entrada.nextLine();
        Hospital h2 = new Hospital("Militar DOS", "Loja", 1000, 3000);
        System.out.print("Ingrese su nombre");
        String nombre2 = entrada.nextLine();
        System.out.print("Ingrese la Ciudad");
        String ciudad2 = entrada.nextLine();
        System.out.print("Ingrese el numero de Doctores");
        int numeroDoctores2 = entrada.nextInt();
        System.out.print("Ingrese el numero de Enfermeros");
        int numeroEnfermeros2 = entrada.nextInt();
        
        
        h2.establecerNombre(nombre2);
        h2.establecerCiudad(ciudad2);
        h2.establecerNumeroDoctores(numeroDoctores2);
        h2.establecerNumeroEnfermeros(numeroEnfermeros2);
        
        
        System.out.printf("Nombre : %s\n"
                + "Ciudad : %s\n"
                + "Numero de Doctores : %d\n"
                + "Numero de Enfermeros : %d\n",
                h2.obtenerNombre(),
                h2.obtenerCiudad(),
                h2.obtenerNumeroDoctores(),
                h2.obtenerNumeroEnfermeros());

    }
}
