/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_f;

import java.util.Scanner;

/**
 *
 * @author Aula6
 */
public class Juego_F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    
        int i=0,menu1=0,tab=0,menu3=0,menu4=0,dif=0,players=0,players_num=2;
        do{
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("************CARRERA NUMERICA***********");
        System.out.println("*****************INICIO****************");
        System.out.println("");
        System.out.println("PLAY                                  1");
        System.out.println("SALIR                                 2");
        System.out.println("");
        System.out.println("***************************************");       
        System.out.println("---------------------------------------");
        menu1 = reader.nextInt();
        
        switch (menu1){
            case 1: 
                do{
                do{
                System.out.println("---------------------------------------");
                System.out.println("");
                System.out.println("************CARRERA NUMERICA***********");
                System.out.println("******************PLAY*****************");
                System.out.println("");
                System.out.println("INGRESE NUMERO DE JUGADORES            ");
                System.out.println("");
                System.out.println("---------------------------------------");
                players=reader.nextInt();
                
                    if (2<=players && players>=5){
                        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");    
                        System.out.println("▓░░░░░░░░░  ERROR ░░░░░░░░░ ▓");
                        System.out.println("▓El numero minimo de jugadores es de dos▓");
                        System.out.println("▓y el maximo de jugadores es cuatro.    ▓");
                        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");   
                        } else{
                            System.out.println("---------------------------------------");
                            System.out.println("***************************************");    
                            System.out.println("         El numero de jugadores        ");
                            System.out.println("     fue seleccionado exitosamente.    ");  
                            System.out.println("***************************************");
                            System.out.println("---------------------------------------");
                            }
                }while(players<1 && players>5);
                
                    do{
                    System.out.println("---------------------------------------");
                    System.out.println("");
                    System.out.println("************CARRERA NUMERICA***********");
                    System.out.println("******************PLAY*****************");
                    System.out.println("");
                    System.out.println("INGRESE NIVEL DE DIFICULTAD            ");        
                    System.out.println("Basico                                1");
                    System.out.println("Medio                                 2");
                    System.out.println("Alto                                  3");
                    System.out.println("---------------------------------------");
                    dif=reader.nextInt();
                    if (1<=dif && dif>=4){
                        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");    
                        System.out.println("▓░░░░░░░░░  ERROR ░░░░░░░░░ ▓");
                        System.out.println("▓El numero minimo de jugadores es de dos▓");
                        System.out.println("▓y el maximo de jugadores es cuatro.    ▓");
                        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");   
                        } else{
                                System.out.println("---------------------------------------");
                                System.out.println("***************************************");    
                                System.out.println("         El nivel de dificultad        ");
                                System.out.println("     fue seleccionado exitosamente.    ");  
                                System.out.println("***************************************");
                                System.out.println("---------------------------------------");
                            }
                                    
                                    
                                    
                        
                    }while(dif<0 && dif>4);

                }while(dif>0 && players>=2);
                
                    System.out.println("---------------------------------------");
                    System.out.println("");
                    System.out.println("************CARRERA NUMERICA***********");
                    System.out.println("******************PLAY*****************");
                    
                    
                    
                break;
                
                
            case 2:
                i=1;
                System.out.println("---------------------------------------");
                System.out.println("***************************************");    
                System.out.println("    GRACIAS POR JUGAR VUELVA PRONTO    ");   
                System.out.println("***************************************");
                System.out.println("---------------------------------------");
                System.out.close();
                
                break;
            default:
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");    
                System.out.println("▓░░░░░░░░░  ERROR ░░░░░░░░░ ▓");
                System.out.println("▓ DATO NO VALIDO, POR FAVOR INTENTE DE ▓");
                System.out.println("▓ NUEVO, GRACIAS.                      ▓");
                System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
                break;

        }
    }while(i==0);
        
    } 
        
        
    }
    

