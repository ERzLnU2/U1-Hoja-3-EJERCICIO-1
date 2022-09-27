/**
 * @author Daw120
 * 
 * 1. Un economista te ha encargado un programa para realizar cálculos con el IVA. 
      La aplicación debe solicitar la base imponible y el IVA que se debe aplicar. 
      Muestra en pantalla el importe correspondiente al IVA y al total.
 */
package com.solomongo.ejercicio1_hoja3;
import javax.swing.JOptionPane;
public class Ejercicio1_Hoja3 {
    public static void main(String[] args) {
      
        // declaracion y asignacion de variables:
        String base; // el precio se mete por user luego será String para un printf
        String iva; 
        float ivaAUX;
        float total;
        float baseImponible;   // estos valores srán del tipo float (decimal pequeño)
        
        //meter base
        base=JOptionPane.showInputDialog("🚀 Mete la Base Imponible:");
        baseImponible=Float.parseFloat(base);  // aqui pasa el Striing a Float..
        System.out.printf("\n\t- La Base Imponible sin IVA es: %,.2f", baseImponible);  // sale con MASCARA (formateado)     
       
      //meter iva
        iva=JOptionPane.showInputDialog("🚀 Mete el IVA:");
        ivaAUX=Float.parseFloat(iva);  // aqui pasa el Striing a Float..
        System.out.printf("\n\t- El IVA a aplicar es: %,.2f",ivaAUX);  // sale con MASCARA (formateado)     
     
        total=baseImponible+(baseImponible*ivaAUX/100);  // sacando el %
        System.out.printf("\nEl precio total con el porcentaje de "+iva+" IVA es: %,.2f", total); 
        System.out.print("\n"); 
}
}
