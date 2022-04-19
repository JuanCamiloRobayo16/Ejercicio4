/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author GaMerJ16
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Declaración de variables
        int K, c = 0, Suma = 0, Promedio;
        
        //Input
        K = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
        
        //Processing
        while(0 < K)
        {
            if(c == 0)
            {
                if(K%2 != 0)
                {
                    Suma+= K;
                    K-= 1;
                    Suma+= K;
                    c+=2;
                }
                else
                {
                    Suma+=K;
                    K-=2;
                    c++;
                }
            }
            else
            {
                Suma+= K;
                K= K-2;
                c++;
            }
        }
        Promedio= Suma/c;
        
        //Output
        JOptionPane.showMessageDialog(null, "\nLa suma de los números pares menores o iguales que el número ingresado es: " + Suma + "\nEl promedio es: " + Promedio);
        
        //End
        System.exit(0);
    }
    
}
