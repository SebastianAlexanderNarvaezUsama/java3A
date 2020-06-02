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
    //int coins[]={5};
    int modenas=5;
    int turn;
    Random ladosp=new Random();
    int caras=(int)(ladosp.nextDouble()*6+1);
   public static void CarasPirinolaLevel1(){ //Caras Level1
        //int coins1=5,coins=0;
        Spinning_Top lados=new Spinning_Top();
        switch(lados.caras){
            case 1:
                System.out.println("Pon 1");
                //Pon1L1();
                CoinsPlayL1();
                break;
            case 2:
                System.out.println("Pon 2");
                Pon2L1();
                break;
            case 3:
                System.out.println("Toma 1");
                Toma1L1();
                break;
            case 4:
                System.out.println("Toma 2");
                Toma2L1();
                break;
            case 5:
                System.out.println("Toma todo");
                TomatodoL1();
                break;
            case 6:
                System.out.println("Todos ponen");
                TodosPonenL1();
                break;
        }
    }
    
   ////////////////////////////////////////////////////////////////
    
   public static void CarasPirinolaLevel2(){ //Caras Level2
        Spinning_Top lados=new Spinning_Top();
        switch(lados.caras){
            case 1:
                System.out.println("Pon 1");
                Pon1L2();
                break;
            case 2:
                System.out.println("Pon 2");
                Pon2L2();
                break;
            case 3:
                System.out.println("Toma 1");
                Toma1L2();
                break;
            case 4:
                System.out.println("Toma 2");
                Toma2L2();
                break;
            case 5:
                System.out.println("Toma todo");
                TomatodoL2();
                break;
            case 6:
                System.out.println("Todos ponen");
                TodosPonenL2();
                break;
        }
    }
    
   ///////////////////////////////////////////////////////////////
    
   public static void CarasPirinolaLevel3(){ //Caras Level3
        Spinning_Top lados=new Spinning_Top();
        switch(lados.caras){
            case 1:
                System.out.println("Pon 1");
                Pon1L3();
                break;
            case 2:
                System.out.println("Pon 2");
                Pon2L3();
                break;
            case 3:
                System.out.println("Toma 1");
                Toma1L3();
                break;
            case 4:
                System.out.println("Toma 2");
                Toma2L3();
                break;
            case 5:
                System.out.println("Toma todo");
                TomatodoL3();
                break;
            case 6:
                System.out.println("Todos ponen");
                TodosPonenL3();
                break;
        }
    }
    
   ///////////////////////////////////////////////////////////////////////
    
   public static void CarasPirinolaLevel4(){ //Caras Level4
        Spinning_Top lados=new Spinning_Top();
        switch(lados.caras){
            case 1:
                System.out.println("Pon 1");
                Pon1L4();
                break;
            case 2:
                System.out.println("Pon 2");
                Pon2L4();
                break;
            case 3:
                System.out.println("Toma 1");
                Toma1L4();
                break;
            case 4:
                System.out.println("Toma 2");
                Toma2L4();
                break;
            case 5:
                System.out.println("Toma todo");
                TomatodoL4();
                break;
            case 6:
                System.out.println("Todos ponen");
                TodosPonenL4();
                break;
        }
    }
    
   ///////////////////////////////////////////////////////////////////
    
    
   public static void Menu(){
        Scanner reader=new Scanner(System.in);
        Spinning_Top turno=new Spinning_Top();
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
                for(turno.turn=1;turno.turn<5;turno.turn++){
                    System.out.println("Player "+turno.turn);
                    CarasPirinolaLevel1();
                    //System.out.println("Coins Player "+turn+": ");
                    System.out.println("---------------------");
                    System.out.println("/////////////////////");
                    Esperar();
                }
                }
                break;
            case 2:
                System.out.println("--------------------------");
                System.out.println("Bienvenido al nivel 2");
                System.out.println("//////////////////////////");
                while(coins==0){
                for(int turn=1;turn<5;turn++){
                    System.out.println("Player "+turn);
                    CarasPirinolaLevel2();
                    System.out.println("---------------------");
                    System.out.println("/////////////////////");
                    Esperar();
                }
                }
                break;
            case 3:
                System.out.println("-------------------------");
                System.out.println("Bienvenido al nivel 3");
                System.out.println("/////////////////////////");
                while(coins==0){
                for(int turn=1;turn<5;turn++){
                    System.out.println("Player "+turn);
                    CarasPirinolaLevel3();
                    System.out.println("---------------------");
                    System.out.println("/////////////////////");
                    Esperar();
                }
                }
                break;
            case 4:
                System.out.println("-------------------------");
                System.out.println("Bienvenido al nivel 4");
                System.out.println("/////////////////////////");
                while(coins==0){
                for(int turn=1;turn<5;turn++){
                    System.out.println("Player "+turn);
                    CarasPirinolaLevel4();
                    System.out.println("---------------------");
                    System.out.println("/////////////////////");
                    Esperar();
                }
                }
                break;
            default:
                break;
        }
        //}while(coins1==0);

    }
   
   //////////////////////////////////////////////////////////////////////
   public static void CoinsPlayL1(){
       int monedas1=2;
       Spinning_Top coinsplayers=new Spinning_Top();
        while(monedas1>=0){
            monedas1--;
       }
       System.out.println("arreglo: "+Integer.toString(monedas1));
       //return coinsplayers.modenas;
   }
   
   /////////////////////////////////////////////////////////////////////
   
   public static int Pon1L1(){//Metodos Level1
       int coins1=5;
       int acumulado=0;
       coins1=coins1-1;
       acumulado++;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
 
   public static int Pon2L1(){
       int coins1=5;
       int acumulado=0;
       coins1=coins1-2;
       acumulado+=2;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   public static int Toma1L1(){
       int coins1=5;
       int acumulado=2;
       coins1++;
       acumulado--;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   public static int Toma2L1(){
       int coins1=5;
       int acumulado=2;
       coins1+=2;
       acumulado-=2;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   public static int TomatodoL1(){
       int coins1=5;
       int acumulado=2;
       coins1+=acumulado;
       acumulado=0;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   public static int TodosPonenL1(){
       int coins1=5;
       int acumulado=2;
       coins1--;
       acumulado++;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   ////////////////////////////////////////////////////////////////////////////////////7
   
   public static int Pon1L2(){//Metodos level2
       int coins1=10;
       int acumulado=0;
       coins1=coins1-1;
       acumulado++;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
 
   public static int Pon2L2(){
       int coins1=10;
       int acumulado=0;
       coins1=coins1-2;
       acumulado+=2;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   public static int Toma1L2(){
       int coins1=10;
       int acumulado=2;
       coins1++;
       acumulado--;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   public static int Toma2L2(){
       int coins1=10;
       int acumulado=2;
       coins1+=2;
       acumulado-=2;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   public static int TomatodoL2(){
       int coins1=10;
       int acumulado=2;
       coins1+=acumulado;
       acumulado=0;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   public static int TodosPonenL2(){
       int coins1=10;
       int acumulado=2;
       coins1--;
       acumulado++;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   //////////////////////////////////////////////////////////////////
   
   public static int Pon1L3(){//Metodos level3
       int coins1=20;
       int acumulado=0;
       coins1=coins1-1;
       acumulado++;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
 
   public static int Pon2L3(){
       int coins1=20;
       int acumulado=0;
       coins1=coins1-2;
       acumulado+=2;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   public static int Toma1L3(){
       int coins1=20;
       int acumulado=2;
       coins1++;
       acumulado--;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   public static int Toma2L3(){
       int coins1=20;
       int acumulado=2;
       coins1+=2;
       acumulado-=2;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   public static int TomatodoL3(){
       int coins1=20;
       int acumulado=2;
       coins1+=acumulado;
       acumulado=0;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   public static int TodosPonenL3(){
       int coins1=20;
       int acumulado=2;
       coins1--;
       acumulado++;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   ///////////////////////////////////////////////////////////////////////////
   
   public static int Pon1L4(){//Metodos level4
       int coins1=30;
       int acumulado=0;
       coins1=coins1-1;
       acumulado++;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
 
   public static int Pon2L4(){
       int coins1=30;
       int acumulado=0;
       coins1=coins1-2;
       acumulado+=2;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   public static int Toma1L4(){
       int coins1=30;
       int acumulado=2;
       coins1++;
       acumulado--;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   public static int Toma2L4(){
       int coins1=30;
       int acumulado=2;
       coins1+=2;
       acumulado-=2;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   public static int TomatodoL4(){
       int coins1=30;
       int acumulado=2;
       coins1+=acumulado;
       acumulado=0;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
       return coins1;
   }
   
   public static int TodosPonenL4(){
       int coins1=30;
       int acumulado=2;
       coins1--;
       acumulado++;
       System.out.println("Coins: "+coins1);
       System.out.println("Acumulado: "+acumulado);
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
    

