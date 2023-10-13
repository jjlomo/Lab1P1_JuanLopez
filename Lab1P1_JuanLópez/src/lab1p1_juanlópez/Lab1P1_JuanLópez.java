/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p1_juanlópez;

import java.util.Scanner;

/**
 *
 * @author jjlm1
 */
public class Lab1P1_JuanLópez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int numero = 2;
        char character = 'a';
        double doble = 1.25;
        boolean VoF = true;
        
        System.out.println("Elija el ejercicio: ");
        numero=lector.nextInt();
        if (numero==1){
            int num1=15;
            int num2=30;
            int resultado;
            resultado = 15*30;
            System.out.print("Resultado: ");
            System.out.println(resultado);
            
        }else if(numero==2){
            System.out.println("Ingrese un número entero: ");
            int numerousuario=lector.nextInt();
            System.out.println("Ingrese un número entero: ");
            int numerousuario2=lector.nextInt();
            System.out.println("Ingrese un número entero: ");
            int numerousuario3=lector.nextInt();
            
            double promedio = (numerousuario+numerousuario2+numerousuario3)/3;
            
            System.out.println("Promedio: "+promedio);
            
        }else {
            System.out.println("Saliste del programa pndjo");
        }
    }
    
}
