/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spinning_top;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Spinning_Top {
        Random ladosp=new Random();
        int caras=(int)(ladosp.nextDouble()*6+1);
    public static void CarasPirinola(){
        //int coins1=5,coins=0;
        Spinning_Top lados=new Spinning_Top();
        switch(lados.caras){
            case 1:
                System.out.println("Pon 1");
                Pon1();
                break;
            case 2:
                System.out.println("Pon 2");
                //coins1-=2;
                break;
            case 3:
                System.out.println("Toma 1");
                break;
            case 4:
                System.out.println("Toma 2");
                break;
            case 5:
                System.out.println("Toma todo");
                break;
            case 6:
                System.out.println("Todos ponen");
                //coins1-=1;
                break;
        }
    }
    
    public static void Menu(){
        Scanner reader=new Scanner(System.in);
        Spinning_Top monedas=new Spinning_Top();
        int /*coins1=5,*/coins2=5,coins3=20,coins4=30,coins=0;
        System.out.println("Menú");
        System.out.println("1. 5 coins");
        System.out.println("2. 10 coins");
        System.out.println("3. 20 coins");
        System.out.println("4. 30 coins");
        System.out.println("Elige una opción: \n");
        int opcion=reader.nextInt();
        //do{
        switch(opcion){
            case 1:
                System.out.println("-------------------------");
                System.out.println("Bienvenido al nivel 1");
                System.out.println("/////////////////////////");
                //CarasPirinola();
                while(coins==0){
                for(int turn=1;turn<5;turn++){
                    System.out.println("Player "+turn);
                    CarasPirinola();
                    //System.out.println("Coins Player "+turn+": ");
                    System.out.println("---------------------");
                    System.out.println("/////////////////////");
                    Esperar();
                }
                }
                break;
            case 2:
                System.out.println("Bienvenido al nivel 2");
                for(int turn=1;turn<5;turn++){
                    System.out.println("Player "+turn);
                    CarasPirinola();
                    System.out.println("---------------------");
                    System.out.println("/////////////////////");
                    Esperar();
                }
                break;
            case 3:
                System.out.println("Bienvenido al nivel 3");
                for(int turn=1;turn<5;turn++){
                    System.out.println("Player "+turn);
                    CarasPirinola();
                    System.out.println("---------------------");
                    System.out.println("/////////////////////");
                    Esperar();
                }
                break;
            case 4:
                System.out.println("Bienvenido al nivel 4");
                for(int turn=1;turn<5;turn++){
                    System.out.println("Player "+turn);
                    CarasPirinola();
                    System.out.println("---------------------");
                    System.out.println("/////////////////////");
                    Esperar();
                }
                break;
            default:
                break;
        }
        //}while(coins1==0);

    }
    
   public static int Pon1(){//una funcion
       int coins1=5;
       coins1=coins1-1;
       System.out.println("Coins: "+coins1);
       return coins1;
   }
 
   public static int Pon2(){
       int coins1=5;
       coins1=coins1-2;
       System.out.println("Coins: "+coins1);
       return coins1;
   }
    
    static void Esperar(){
        try{
            Thread.sleep(5*1000);
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu();
        /*for(int turn=0;turn<4;turn++){
            if(turn==4){
                turn-=3;
            }
            System.out.println("Turno: "+(turn+1));*/
        }
    }
    

