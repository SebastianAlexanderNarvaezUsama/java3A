/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retogame;

import java.util.Scanner;

/**
 *
 * @author Aula1
 */
public class RetoGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
      
       
     
        int i=1, lims=0, limi=0, par=0, imp=0,parn=0,impn=0,sumparn=0;
        
       
        
        while (i==1){
        System.out.println("ingrese un limite inicial de datos: ");
        System.out.println("");
        lims = reader.nextInt();
        System.out.println("ingrese un limite final de datos: ");
        System.out.println("");
        limi = reader.nextInt();
            if (lims <limi){
            i=0;
            }else
                if(lims>limi ){
               System.out.println("");
               System.out.println("********************ERROR********************");
               System.out.println("LIMITE INICIAL DEBE SER MENOR AL LIMITE FINAL");
               System.out.println("*********************************************");
               System.out.println("");
               i=1;         
                }
        }
    

            for (i=lims; i<=limi;i++){
            int nr = (int)(Math.random()*-100+100);
            System.out.println(nr);
                if (nr>0&&(nr%2==0)){
                    par++;
                }else
                    if(nr>0&&(nr%3==0)){
                        imp++;   
                    }else
                        if (nr<0&&(nr%2==0)){
                            parn++;
                        }else
                            if (nr<0&&(nr%3==0)){
                            impn++;   
                            }else
                                if(nr<0&&(nr%2==0))
                                    sumparn=sumparn+sumparn;
                
                           
            }
            System.out.println("Total pares positivos:      "+par);
            System.out.println("Total impares positivos:    "+imp);
            System.out.println("Total pares negativos:      "+parn);
            System.out.println("Total impares negativos:    "+impn);
            System.out.println("Suma totla pares negativos: "+sumparn);
      /*  
        EJEMPLO 3
        int i=1, lims=0, limi=0, num=0 ;
         
        while (i==1){
        System.out.println("ingrese un limite inicial de datos: ");
        System.out.println("");
        lims = reader.nextInt();
        System.out.println("ingrese un limite final de datos: ");
        System.out.println("");
        limi = reader.nextInt();
            if (lims <limi){
            i=0;
            }else
                if(lims>limi ){
               System.out.println("");
               System.out.println("********************ERROR********************");
               System.out.println("LIMITE INICIAL DEBE SER MENOR AL LIMITE FINAL");
               System.out.println("*********************************************");
               System.out.println("");
               i=1;         
                }        
        }        
        System.out.println("ingrese un numero: ");
        System.out.println("");
        num = reader.nextInt();
            for (i=lims; i<=limi;i++){
                System.out.println(num+" x "+i+ " = "+ (num*i) ); 
            }     
    }    
        */
        /*
        EJEMPLO 2
        int i=1, lim=0,imp=0, par=0, sumimp=0, sumpar=0;
        System.out.println("ingrese un limite de datos: ");
        System.out.println("");
        lim = reader.nextInt();
        while (i<=lim){
          System.out.println(i);
            System.out.println("");
            if (i%2==0){
                par++;
                sumpar = sumpar + i;
            }else {
                 imp++;
                 sumimp = sumimp + i;  
        }
            i++;
        }
                System.out.println("");
        System.out.println("Total de pares: " + par);
        System.out.println("suma total de numeros pares: " + sumpar);
        System.out.println("Total de impares: " + imp);
        System.out.println("suma total de numeros impares: " + sumimp);
        */
        
        /*
        EJEMPLO 1
        int i=0, lim=20,imp=0, par=0, sumimp=0, sumpar=0;
        System.out.println("ingrese un limite de datos: ");
        System.out.println("");
        lim = reader.nextInt();
        for (i=1;i<=lim;i++){
            System.out.println(i);
            System.out.println("");
            if (i%2==0){
                par++;
                sumpar = sumpar + i;
            }else {
                 imp++;
                 sumimp = sumimp + i;
        }
        }
        System.out.println("");
        System.out.println("Total de pares: " + par);
        System.out.println("suma total de numeros pares: " + sumpar);
        System.out.println("Total de impares: " + imp);
        System.out.println("suma total de numeros impares: " + sumimp);
        */
        
        
        
        // TODO code application logic here
}
}