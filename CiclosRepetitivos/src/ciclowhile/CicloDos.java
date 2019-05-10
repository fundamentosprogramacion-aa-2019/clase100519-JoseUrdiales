/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile;

/**
 *
 * @author reroes
 */
public class CicloDos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int limite = 10;
        int contador = 1;
        int suma = 0;
        while (contador <= limite){
            suma = suma + contador;
            System.out.printf("Contador %d\n", contador);
            contador = contador + 1;
        }
        
        System.out.printf("La suma final es %d\n", suma);
        
    }
}
