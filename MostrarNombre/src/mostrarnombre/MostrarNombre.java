/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrarnombre;

/**
 *
 * @author Asus
 */
public class MostrarNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nombre="sebastian alexander Narvaez Usama";
          String Palabra=Nombre;
          int numero=32;
    char Buscarletra [];
    Buscarletra = Palabra.toCharArray();
    for (int x=0;x<Palabra.length();x++){
        if(numero==x){
        System.out.println(Buscarletra [x]);    
        }
        }  // TODO code application logic here
    }
    
}
