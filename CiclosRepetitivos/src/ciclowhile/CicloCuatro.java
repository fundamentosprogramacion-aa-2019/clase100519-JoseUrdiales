/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile;

/**
 *
 * @author Jose Luis
 */
public class CicloCuatro {
    public static void main(String[] args) {
        int contador = 1;
        int limite = 5;
        int suma = 0;
        String mensajeFinal = "";
        //System.out.printf("%s", "La suma de:\n");
        mensajeFinal = String.format("%s%s\n", mensajeFinal, "La suma de:");
        while (contador <= limite){
            suma = suma + contador;
            //System.out.printf("%d\n", contador);
            mensajeFinal = String.format("%s%d\n", mensajeFinal, contador);
            contador = contador + 1;
        }
        mensajeFinal = String.format("%sTiene un resultado de: %d\n", 
                mensajeFinal, suma);
        System.out.printf("%s", mensajeFinal);
    }
}
