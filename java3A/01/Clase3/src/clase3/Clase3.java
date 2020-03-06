/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;
/**/



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
      /*  
        int i=0, p=0;
        for (i=1 ; i<=30 ; i++){
           System.out.println(i);

           if(i%2 == 0)
                   p++;
         System.out.println(p);  

        }
    */
    
        
        
        
        
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
        System.out.println("Salir:                                  5");
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
            case 5:
                System.out.println("VUELVA PRONTO");
                System.out.close();
               break;
            default:
                System.out.println("*************ERROR************");
                System.out.println("*******DATOS NO VALIDOS*******");
                break;  
                
                
        /* ---------------------------------------------------------------------Ejercicio 1
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
                 
        /*-----------------------------------------------------------------------Ejercicio 2
          int N1=5, N2=6, OP=6, Res=0;
          //Generacion aritmetica
          if (OP==1)
              Res = N1+N2;
          else  
               if (OP==2)
                   Res = N1-N2;
               else 
                   if (OP==3)
                       Res = N1*N2;
                   else 
                       if (OP==4)
                          Res = N1/N2;
                          else
                             System.out.println("Incorrecto");
                             System.out.close(); 

          System.out.println("Resultado: "+Res );                                  
          */    
          
            
    
           
        
    }
}
}        // TODO code application logic here
    
    

// TODO code application logic here
    
    
