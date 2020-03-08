/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_f;

import java.util.Scanner;

/**
 *
 * @author carolina
 */
public class Juego_F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entradas y validacion de jugadores
        int num_jugadores=3,opcion,j=0,numcasillas=0,i=0,suma=0;

       int posicion1=20;
        int sump1=0,sump2=0,sump3=0,sump4=0,turno=1;
        Scanner waitForKeypress = new Scanner(System.in);      
        int sumpt1=0,sumpt2=0,sumpt3=0,sumpt4=0;        
        String respuesta_U="s";
        //char[]num_jugadores=new char[num_jugadores];
        //Random dados_aleatorios=new Random();
        //dado1= (int)(Math.random()*6);
        //int dado2= 1 + dados_aleatorios.nextInt(6);
        //suma_dados=dado_1+dado_2;
        
        Scanner reader=new Scanner(System.in);
        do {
                System.out.println("---------------------------------------");
                System.out.println("");
                System.out.println("************CARRERA NUMERICA***********");
                System.out.println("******************PLAY*****************");
                System.out.println("");
                System.out.println("INGRESE NUMERO DE JUGADORES            ");
                System.out.println("");
                
                if(num_jugadores>4 || num_jugadores<2){
                System.out.println("---------------------------------------");
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");    
                System.out.println("▓░░░░░░░░░░░░░  ADVERTENCIA ░░░░░░░░░░░ ▓");
                System.out.println("▓El numero minimo de jugadores es de dos▓");
                System.out.println("▓y el maximo de jugadores es cuatro.    ▓");
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓"); 
                }
        


        num_jugadores=reader.nextInt();
        
        }while(num_jugadores<2 || num_jugadores>4); //ciclo do-while
      
        //Menú
        do{
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("************CARRERA NUMERICA***********");
        System.out.println("******INGRESE NIVEL DE DIFICULTAD******");
        System.out.println("");     
        System.out.println("Basico:(tablero de 20 posiciones)     1");
        System.out.println("Medio:(tablero de 30 posiciones)      2");
        System.out.println("Alto:(tablero de 50 posiciones)       3");
        System.out.println("");  
        System.out.println("---------------------------------------");

        opcion=reader.nextInt();
        switch(opcion){
            case 1:
                System.out.println("---------------------------------------");
                System.out.println("***************************************"); 
                System.out.println("♥ ♥ ♥ ♥ ♥ Nivel principiante ♥ ♥ ♥ ♥ ♥ ");
                System.out.println("***************************************");
                System.out.println("---------------------------------------");                
                numcasillas=20;
                
                break;
            case 2:
                System.out.println("---------------------------------------");
                System.out.println("***************************************"); 
                System.out.println("↑ ↑ ↑ ↑ ↑ ↑ Nivel intermedio  ↑ ↑ ↑ ↑ ↑");
                System.out.println("***************************************");
                System.out.println("---------------------------------------");                
                numcasillas=30;
                break;
            case 3:
                System.out.println("---------------------------------------");
                System.out.println("***************************************"); 
                System.out.println("⚡ ⚡ ⚡ ⚡ ⚡ ⚡ Nivel avanzado ⚡ ⚡ ⚡ ⚡ ⚡ ⚡ ");
                System.out.println("***************************************");
                System.out.println("---------------------------------------");                
                numcasillas=50;
                break;
            default:
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");   
                System.out.println("▓⚠ ⚠ ⚠ ⚠ ⚠ OPCION INCORRECTA⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ▓");
                System.out.println("▓ DATO NO VALIDO, POR FAVOR INTENTE DE  ▓");
                System.out.println("▓ NUEVO, GRACIAS.                       ▓");
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");                

                break;
            }
        }while(opcion > 3); //ciclo do-while (2)

        
        do{
            
            do{
                
            System.out.println("---------------------------------------");
            System.out.println("");
            System.out.println("************CARRERA NUMERICA***********");
            System.out.println("");
            
            do{
                    for (i=1;i<=num_jugadores;i++){
                    }
                    System.out.println("Precione enter para lanzar dados para el jugador 1.");
                    System.out.println("***************************************");
                    System.out.println("---------------------------------------");                     
                    waitForKeypress.nextLine();
                    
                   if (num_jugadores==2){
                      if (turno==1){
                    int punp1d1 = (int)(Math.random()*6+1);
                    int punp1d2= (int)(Math.random()*6+1);
                    System.out.println("dado 1: "+punp1d1);
                    System.out.println("dado 2: "+punp1d2);                    
                    sump1=punp1d2+punp1d1;
                    sumpt1=sump1+sumpt1;
                    turno=2;
                    }
                    System.out.println("Precione enter para lanzar dados para el jugador 2.");
                    System.out.println("***************************************");
                    System.out.println("---------------------------------------");                      
                    waitForKeypress.nextLine();
                    if (turno==2){
                    int punp1d1 = (int)(Math.random()*6+1);
                    int punp1d2= (int)(Math.random()*6+1);
                    System.out.println("dado 1: "+punp1d1);
                    System.out.println("dado 2: "+punp1d2);                     
                    sump2=punp1d2+punp1d1;
                    sumpt2=sump2+sumpt2;                                            
                    }
                    turno=1;
                    } 
                        if (num_jugadores==3){
                           if (turno==1){
                            int punp1d1 = (int)(Math.random()*6+1);
                            int punp1d2= (int)(Math.random()*6+1);
                            System.out.println("dado 1: "+punp1d1);
                            System.out.println("dado 2: "+punp1d2);                    
                            sump1=punp1d2+punp1d1;
                            sumpt1=sump1+sumpt1;
                            turno=2;
                            }
                            System.out.println("Precione enter para lanzar dados para el jugador 2.");
                            System.out.println("***************************************");
                            System.out.println("---------------------------------------");                      
                            waitForKeypress.nextLine();
                           if (turno==2){
                            int punp1d1 = (int)(Math.random()*6+1);
                            int punp1d2= (int)(Math.random()*6+1);
                            System.out.println("dado 1: "+punp1d1);
                            System.out.println("dado 2: "+punp1d2);                     
                            sump2=punp1d2+punp1d1;
                            sumpt2=sump2+sumpt2;                    
                            turno=3;                        
                            }
                            System.out.println("Presione enter para lanzar dados para el jugador 3.");
                            System.out.println("***************************************");
                            System.out.println("---------------------------------------");                      
                            waitForKeypress.nextLine();
                            if(turno==3){
                             int punp1d1=(int)(Math.random()*6+1);
                             int punp1d2=(int)(Math.random()*6+1);
                             System.out.println("dado 1: "+punp1d1);
                             System.out.println("dado 2: "+punp1d2);                         
                             sump3=punp1d2+punp1d1;
                             sumpt3=sump3+sumpt3;                        

                            }
                            turno=1;
                            }
                        if(num_jugadores==4){    
                         if (turno==1){
                         int punp1d1 = (int)(Math.random()*6+1);
                         int punp1d2= (int)(Math.random()*6+1);
                         System.out.println("dado 1: "+punp1d1);
                         System.out.println("dado 2: "+punp1d2);                    
                         sump1=punp1d2+punp1d1;
                         sumpt1=sump1+sumpt1;
                         turno=2;
                         }
                         System.out.println("Precione enter para lanzar dados para el jugador 2.");
                         System.out.println("***************************************");
                         System.out.println("---------------------------------------");                      
                         waitForKeypress.nextLine();
                         if (turno==2){
                         int punp1d1 = (int)(Math.random()*6+1);
                         int punp1d2= (int)(Math.random()*6+1);
                         System.out.println("dado 1: "+punp1d1);
                         System.out.println("dado 2: "+punp1d2);                     
                         sump2=punp1d2+punp1d1;
                         sumpt2=sump2+sumpt2;                    
                         turno=3;                        
                         }
                         System.out.println("Presione enter para lanzar dados para el jugador 3.");
                         System.out.println("***************************************");
                         System.out.println("---------------------------------------");                      
                         waitForKeypress.nextLine();
                         if(turno==3){
                             int punp1d1=(int)(Math.random()*6+1);
                             int punp1d2=(int)(Math.random()*6+1);
                             System.out.println("dado 1: "+punp1d1);
                             System.out.println("dado 2: "+punp1d2);                         
                             sump3=punp1d2+punp1d1;
                             sumpt3=sump3+sumpt3;                        
                             turno=4;
                         }
                         System.out.println("Presione enter para lanzar dados para el jugador 4.");
                         System.out.println("***************************************");
                         System.out.println("---------------------------------------");                      
                         waitForKeypress.nextLine();
                         if(turno==4){
                             int punp1d1=(int)(Math.random()*6+1);
                             int punp1d2=(int)(Math.random()*6+1);
                             System.out.println("dado 1: "+punp1d1);
                             System.out.println("dado 2: "+punp1d2);                         
                             sump4=punp1d2+punp1d2;
                             sumpt4=sump4+sumpt4;                        
                         }
                         turno=1;
                        }   
                    
                    
                
            }while(sumpt1>=numcasillas || sumpt2>=numcasillas || sumpt3>=numcasillas || sumpt4>=numcasillas);
            
            
                
 
            }while(sumpt1>=numcasillas || sumpt2>=numcasillas || sumpt3>=numcasillas || sumpt4>=numcasillas);
            
            if (sump1>numcasillas){
                System.out.println("---------------------------------------");
                System.out.println("");
                System.out.println("************CARRERA NUMERICA***********");
                System.out.println("");
                System.out.println("El jugador 1 a ganado la partida.      ");
                System.out.println("");  
                System.out.println("---------------------------------------");                
            }else
                if (sump2>numcasillas){
                    System.out.println("---------------------------------------");
                    System.out.println("");
                    System.out.println("************CARRERA NUMERICA***********");
                    System.out.println("");
                    System.out.println("El jugador 2 a ganado la partida.      ");
                    System.out.println("");  
                    System.out.println("---------------------------------------");                    
                }else
                    if (sump1>numcasillas){
                        System.out.println("---------------------------------------");
                        System.out.println("");
                        System.out.println("************CARRERA NUMERICA***********");
                        System.out.println("");
                        System.out.println("El jugador 3 a ganado la partida.      ");
                        System.out.println("");  
                        System.out.println("---------------------------------------");                
                    }else
                        if (sump2>numcasillas){
                            System.out.println("---------------------------------------");
                            System.out.println("");
                            System.out.println("************CARRERA NUMERICA***********");
                            System.out.println("");
                            System.out.println("El jugador 4 a ganado la partida.      ");
                            System.out.println("");  
                            System.out.println("---------------------------------------");                    
                        }
                           
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");   
                System.out.println("▓♥ ♥ ♥ ♥ ♥ ♥ ♥  GAME OVER ♥ ♥ ♥ ♥ ♥ ♥ ♥ ▓");
                System.out.println("▓        ¿QUIERE SEGUIR JUGANDO?        ▓");
                System.out.println("▓       S/s                   N/n       ▓");
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
                respuesta_U=reader.nextLine();
                
        }while(respuesta_U.equals("N") || respuesta_U.equals("n"));

    }
   }
