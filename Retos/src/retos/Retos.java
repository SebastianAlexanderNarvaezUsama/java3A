
package retos;

import java.util.Scanner;

public class Retos {
public static void main(String[] args) {
// int dado1 = (int)(Math.random()*(6)+1);   
    
/*    
    1.1.Escribaunprograma,quereciba4númerosporconsola,ymuestreporpantalla,cuáles el mayor de todos. (EstructuraIF)    
           int numero_mayor;
        int arreglo[]=new int [5];
        Scanner reader=new Scanner(System.in);
        for(int i=1;i<arreglo.length;i++){
            System.out.println("Ingrese el número "+i);
            arreglo[i]=reader.nextInt();
        }
        numero_mayor=arreglo[0];
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]>numero_mayor){
                numero_mayor=arreglo[i];
            }
        }
        System.out.println("El número mayor es: "+numero_mayor);     
 
     */      
    
/*
1.2.Valide  elejercicio  1.1., de manera  que,  si  los  4números  son iguales,muestre por pantalla  un  mensaje  que  indique  su  igualdad(SÍ  Y  SÓLO  SÍlos  4  son  iguales). (EstructuraIF)
    
     
        int numero_mayor=0,ban=0;
        int arreglo[]=new int [5];
        Scanner reader=new Scanner(System.in);
        for(int i=1;i<arreglo.length;i++){
            System.out.println("Ingrese el número "+i);
            arreglo[i]=reader.nextInt();
        }
        if(arreglo[1]==arreglo[2]&&arreglo[3]==arreglo[4]&&arreglo[2]==arreglo[3]){
                  System.out.println("TODOS LOS NUMEROS SON IGUALES.");
                  ban=1;
                }
        if(ban<=0){
        numero_mayor=arreglo[0];
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]>numero_mayor){
                numero_mayor=arreglo[i];
            }
                
        }
        }
        if(ban<=0){
        System.out.println("El número mayor es: "+numero_mayor);        
        }
        
    */
    
/*        
    1.5.Escriba un  programa que solicite el número de la tabla de multiplicar a operar y el límite de la serie a mostrar (El intervalo de datos a visualizar debe iniciar en1).    
     int i=0,n=0,m=0;   
     Scanner reader=new Scanner(System.in); 
     Scanner scanner = new Scanner(System.in);
     System.out.println("TABLAS DE MULTIPLICAR");
     System.out.println("Ingrese el numero: ");n=reader.nextInt();
     System.out.println("ingrese el numero limite para mostrar la tabla: ");m=reader.nextInt();
     System.out.println("Precione enter para generar la tabla.");
     scanner.nextLine();
     for(i=1;i<=m;i++){
     System.out.println(n+" x "+i+" = "+(n*i));   
     }
     */        
        
        
     
        
  /*      
   1.6.Escribaunprograma,quereciba4númerosporconsola,ymuestreporpantalla,cuáles el mayor de todos.Al finalizar debevisualizar el siguiente reporte:Suma de los paresSuma de los impares     
        int numero_mayor,num2=0,num3=0;
        int arreglo[]=new int [5];
        Scanner reader=new Scanner(System.in);
        for(int i=1;i<arreglo.length;i++){
            System.out.println("Ingrese el número "+i);
            arreglo[i]=reader.nextInt();
            if(arreglo[i]%2==0){
                num2=arreglo[i]+num2;
            }else{
                num3=arreglo[i]+num3;
            }       
        }
        numero_mayor=arreglo[0];
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]>numero_mayor){
                numero_mayor=arreglo[i];
            }
        }
        System.out.println("El número mayor es: "+numero_mayor);
        System.out.println("la suma de los pares: "+num2);
        System.out.println("la suma de los impares: "+num3);    
    
  */ 

       
    
  
    }
}


