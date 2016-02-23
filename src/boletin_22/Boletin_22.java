package boletin_22;

import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author jano
 */
public class Boletin_22 {
    public static void main(String[] args) {
        
        Metodologia meto1=new Metodologia();
        
          int contador=1;
        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Acceder al menú?\n******************************\n1. Sí\n2.No"));
            if (opcion == 1) {
                meto1.menu();
            } else if (opcion == 2) {
                contador = -5;
            } else {
                JOptionPane.showMessageDialog(null, "Eso no es una opción");
                
            }
        } while (contador > 0);
      
    }
    
}
