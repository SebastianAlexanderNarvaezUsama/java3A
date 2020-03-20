/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangoli;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Rangoli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner reader = new Scanner (System.in);
    int i=1,ban=1,rep=0;    
    char abc[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
    /*abc[1]='a';
    abc[2]='b';
    abc[3]='c';
    abc[4]='d';
    abc[5]='e';
    abc[6]='f';
    abc[7]='g';
    abc[8]='h';
    abc[9]='i';
    abc[10]='j';
    abc[11]='k';
    abc[12]='l';
    abc[13]='m';
    abc[14]='n';
    abc[15]='ñ';
    abc[16]='o';
    abc[17]='p';
    abc[18]='q';
    abc[19]='r';
    abc[20]='s';
    abc[21]='t';
    abc[22]='u';
    abc[23]='v';
    abc[24]='w';
    abc[25]='x';
    abc[26]='y';
    abc[27]='z';
    */
while(ban==1){
    System.out.println("Digite un numero entero:");
    System.out.println("el numero representa la ");
    System.out.println("letra del abecedario a  ");
    System.out.println("escribir. ");
    System.out.println("a=1,b=2,c=3...");
    i=reader.nextInt();
    rep=i;
    if(i<=0){
    ban=1;   
    System.out.println("ERROR: el numero debe ser mayor que: 0");    
    }else
    if(i>=28){
    ban=1;
    System.out.println("ERROR: el numero debe ser menor que: 28");
    }else{
        ban=0; 
        System.out.println("el dato fue exitosamente guardado.");
    }
}
System.out.println(" "+" "+abc[i]+" ");
while(i>=0){
    System.out.print(abc[i]+" ");
    i--;
}
  i=rep;
while(i<=rep){
    System.out.println(abc[i]);
    i++;
}
i=rep;
System.out.print(" "+" "+abc[i]+" ");    
}
}

