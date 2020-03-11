
package burbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Burbuja {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int arreglo [],nElementos, aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("cantidad de elementos"));
        arreglo = new int[nElementos];
        
        for(int i=0;i<nElementos ;i++){
            System.out.print("digite un numero ");
            arreglo[i] = entrada.nextInt();
        }
        
        //burbuja 
        for (int i=0;i<(nElementos-1);i++){
            for (int j=0; j<(nElementos-1);j++){
                if (arreglo[j]>arreglo[j+1]){
                    aux = arreglo[j];
                            
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
           
        //mostrar arreglo ordenado
        System.out.println("ordenadoo");
          for(int i=0;i<nElementos;i++){
              System.out.print(arreglo[i]+"-");
          }          
    }
    
}
