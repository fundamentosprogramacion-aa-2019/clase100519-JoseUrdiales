/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos2;

/**
 *
 * @author reroes
 */
public class Ciclos3 {

    public static void main(String args[]) {
        // el encabezado de la instrucción for incluye la inicialización,
        // la condición de continuación de ciclo y el incremento
        
        String cadena = "";
                
        for (int contador = 1; contador <= 10; contador++) {
            
            cadena = String.format("%s%d\t\t%d\n", cadena,  
                    contador, contador+10);
        }
        System.out.print(cadena); // imprime una nueva línea

    } // fin de la clase ContadorFor

}
