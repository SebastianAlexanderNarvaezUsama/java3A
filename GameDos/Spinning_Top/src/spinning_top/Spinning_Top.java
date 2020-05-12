/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spinning_top;

/**
 *
 * @author Asus
 */
public class Spinning_Top {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sistema de turnos en consola
        for(int turn=0;turn<4;turn++){
            if(turn==4){
                turn-=3;
            }
            System.out.println("Turno: "+(turn+1));
        }
    }
    
}
