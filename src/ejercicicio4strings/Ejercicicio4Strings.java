/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicio4strings;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Ejercicicio4Strings {

    /**
     * @param args the command line arguments
     *  Alumno: Francisco Javier Fernández Morales
        C.F.G.S. Desarrollo de Aplicaciones Multiplataforma
        Módulo Profesional: Programación
        Curso escolar: 2018/2019
        Profesor: Francisco Jesús Delgado Almirón
        Instituto Tecnológico Poniente
     */
    public static void main(String[] args) 
    {
        String nombre = "";
        String apellido1 = "";
        String apellido2 = "";
        int posicion = -1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        nombre = teclado.nextLine();
        System.out.println("Introduce el primer apellido");
        apellido1 = teclado.nextLine();
        System.out.println("Introduce el segundo apellido");
        apellido2  = teclado.nextLine();
       
            String subcadena = nombre.substring(posicion+1, posicion+4);
            String subcadena2 = apellido1.substring(posicion+1, posicion+4);
            String subcadena3 = apellido2.substring(posicion+1, posicion+4);
            System.out.println("El código es = " + subcadena2 + subcadena3 + subcadena);
 
        
    }
    
}
