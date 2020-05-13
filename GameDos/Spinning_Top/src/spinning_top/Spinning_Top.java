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

    static void CarasPirinola(){
        Random ladosp=new Random();
        int caras=(int)(ladosp.nextDouble()*6+1);
        switch(caras){
            case 1:
                System.out.println("Pon 1");
                break;
            case 2:
                System.out.println("Pon 2");
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
        }    
    }
    
    static void Menu(){
        Scanner reader=new Scanner(System.in);
        int coins1=5,coins2=10,coins3=20,coins4=30;
        System.out.println("Menú");
        System.out.println("1. 5 coins");
        System.out.println("2. 10 coins");
        System.out.println("3. 20 coins");
        System.out.println("4. 30 coins");
        System.out.println("Elige una opción: ");
        int opcion=reader.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Bienvenido al nivel 1");
                for(int turn=1;turn<5;turn++){
                    System.out.println("Player "+turn);
                    CarasPirinola();
                }
                break;
            case 2:
                System.out.println("Bienvenido al nivel 2");
                for(int turn=1;turn<5;turn++){
                    System.out.println("Player "+turn);
                    CarasPirinola();
                }
                break;
            case 3:
                System.out.println("Bienvenido al nivel 3");
                for(int turn=1;turn<5;turn++){
                    System.out.println("Player "+turn);
                    CarasPirinola();
                }
                break;
            case 4:
                System.out.println("Bienvenido al nivel 4");
                for(int turn=1;turn<5;turn++){
                    System.out.println("Player "+turn);
                    CarasPirinola();
                }
                break;
            default:
                break;
        }

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sistema de turnos en consola
        Menu();
        /*for(int turn=0;turn<4;turn++){
            if(turn==4){
                turn-=3;
            }
            System.out.println("Turno: "+(turn+1));*/
        
        
        }
    }
    

