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
        // TODO code application logic here
        int turn=1;//turno
        while(turn<=4){//el ciclo solo es para ver la efectividad de los turnos.
        System.out.println("turno "+turn);
        if(turn==4){
            turn-=4;
        }
        turn++;
        }
    }
    
}
