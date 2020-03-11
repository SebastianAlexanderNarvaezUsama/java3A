package numerosaleatorios;
import java.util.Scanner;
public class NumerosAleatorios {
    public static void main(String[] args) {
     Scanner reader = new Scanner(System.in);

        int i=1,lims=0,limi=0,par=0,imp=0,parn=0,impn=0,sumparn=0,bh=0,bhn=0;
        
        System.out.println("Ingrese el rango inicial de valores aleatorios a generar: ");
        bh=reader.nextInt();
        System.out.println("Ingrese el rango final de valores aleatorios a generar: ");
        bhn=reader.nextInt();                
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
            System.out.println("Numeros generados: ");    
            for (i=lims; i<=limi;i++){    
            //int nr = (int)(Math.random()*(bh));
            int nr=(int)Math.floor(Math.random()*(bhn-bh)+bh);
            if (nr<=-3&&nr%3==0){
               impn++;   
            }
              if(nr>=3&&nr%3==0){
              imp++;   
              }
                if (nr>=2&&nr%2==0){
                par++;
                }
                  if (nr<=-2&&nr%2==0){
                  parn++;
                  }     
                    if(nr<=-2&&nr%2==0)
                    sumparn=nr+sumparn;
            System.out.println("Numero "+i+": "+nr);                 
            }
            System.out.println("Total pares positivos:      "+par);
            System.out.println("Total impares positivos:    "+imp);
            System.out.println("Total pares negativos:      "+parn);
            System.out.println("Total impares negativos:    "+impn);
            System.out.println("Suma total pares negativos: "+sumparn);
       
    }
    
}
