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
public class CicloTres {
    public static void main(String[] args) {
        int contador = 1;
        int limite = 5;
        int suma = 0;
        System.out.printf("%s", "La suma de:\n");
        while (contador <= limite){
            suma = suma + contador;
            System.out.printf("%d\n", contador);
            contador = contador + 1;
        }
        System.out.printf("Tiene un resultado de: %d\n", suma);
    }
}
