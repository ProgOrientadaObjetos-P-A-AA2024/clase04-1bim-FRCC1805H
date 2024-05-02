/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos*/
        
        Hospital h1 = new Hospital();
        h1.establecerNombre(n);
        h1.establecerCiudad(n);
        h1.establecerNumeroDoctores(0);
        h1.establecerNumeroEnfermeros(0);
        System.out.printf("%s\n", h1);
        
    }
}
