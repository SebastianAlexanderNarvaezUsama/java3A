/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Aula1
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Scanner reader = new Scanner(System.in);
        
        int N1, N2, op;
        
        System.out.println("Escriba el primer numero: ");
        N1 = reader.nextInt();
        System.out.println("Escriba el segundo numero: ");
        N2 = reader.nextInt();        
        System.out.flush();
        System.out.println("******************MENU******************");
        System.out.println("Suma de los numeros digite:             1");
        System.out.println("Resta de los numeros digite:            2");
        System.out.println("Multiplicacion de los numeros digite:   3");
        System.out.println("Divicion de los numeros digite:         4");
        op = reader.nextInt();  
        System.out.flush();
        switch (op) {
            case 1:
                System.out.println("La suma de los numeros es: "+(N1+N2) );
                break;
            case 2:
                System.out.println("La resta de los numeros es: "+(N1-N2) );
                break;
            case 3:
                System.out.println("La multiplicaciòn de los numeros es: "+(N1*N2) );
                break;
            case 4:
                System.out.println("La divisiòn de los numeros es: " + (N1/N2)); 
                break;
                
               

        /* Ejercicio 1
        if (N1>N2){
        System.out.print("El mayor es: "+ N1);
        }else
        if (N1<N2){
        System.out.print("El mayor es: "+ N2);
        }else
        if (N1==N2){
        System.out.print("Los numeros " + N1 + " y " + N2 + " son iguales " );
        }
         */
            default:      
                break;
        }
           } 
          
        }
     
        // TODO code application logic here
    
    
