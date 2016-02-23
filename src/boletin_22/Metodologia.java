package boletin_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author jano
 */
public class Metodologia {

    private String listado[] = new String[10];

    public Metodologia() {
        listado[0] = JOptionPane.showInputDialog("Introduzca palabra");
        listado[1] = JOptionPane.showInputDialog("Introduzca palabra");
        listado[2] = JOptionPane.showInputDialog("Introduzca palabra");
        listado[3] = JOptionPane.showInputDialog("Introduzca palabra");
        listado[4] = JOptionPane.showInputDialog("Introduzca palabra");
        listado[5] = JOptionPane.showInputDialog("Introduzca palabra");
        listado[6] = JOptionPane.showInputDialog("Introduzca palabra");
        listado[7] = JOptionPane.showInputDialog("Introduzca palabra");
        listado[8] = JOptionPane.showInputDialog("Introduzca palabra");
        listado[9] = JOptionPane.showInputDialog("Introduzca palabra");
    }

    //Mostrar listado
    public void mostrar() {
        int numeracion = 0;
        for (int i = 0; i < (listado.length); i++) {
            numeracion++;
            System.out.println(numeracion + ". " + listado[i]);

        }

    }

    //Mostrar listado sin ordenar
    public void ordenar() {
        for (int i = 0; i < (listado.length - 1); i++) {
            for (int j = i + 1; j < listado.length; j++) {
                if (listado[i].compareToIgnoreCase(listado[j]) > 0) {
                    //Intercambiamos valores
                    String variableauxiliar = listado[i];
                    listado[i] = listado[j];
                    listado[j] = variableauxiliar;

                }
            }
        }
    }

    public void escribir() {

        String archivo = "salida.txt";
        File salidaTXT = new File(archivo);
        PrintWriter ps = null;
        try {
            ps = new PrintWriter(archivo);
            int numero = 0;
            for (String elemento : listado) {
                numero++;
                ps.println(numero + ". " + elemento);
            }
            System.out.println("Se ha generado un fichero");
            ps.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo " + archivo);
        }
    }
    
    public void menu(){
       
    int opcion=Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion:\n1.Ordenar el listado\n2.Mostrar el listado\n3. Sacar fichero con el listado"));
   switch(opcion){
       case 1:
           ordenar();
   break;
       case 2:
           mostrar();
           break;
       case 3:
           escribir();
           break;
       default:
           JOptionPane.showMessageDialog(null, "Eso no es una opción");
           break;
   }
    
    }
}
