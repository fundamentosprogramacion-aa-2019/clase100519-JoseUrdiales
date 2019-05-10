/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile;

import java.util.Scanner;

/**
 *
 * @author Jose Luis
 */
public class CicloCinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        int limite = 3;
        int suma = 0;
        double promedio = 0;
        int nota = 0;
        String mensajeFinal = "";
        
        mensajeFinal = String.format("%s%s\n", mensajeFinal, 
                "Las notas ingresadas fueron:");
        while (contador <= limite){
            System.out.printf("Ingrese la nota %d: ", contador);
            nota = entrada.nextInt();
            suma = suma + nota;
            mensajeFinal = String.format("%s%d\n", mensajeFinal, nota);
            contador = contador + 1;
        }
        promedio = (double)suma/limite;
        mensajeFinal = String.format("%sY su promedio es: %.2f\n", 
                mensajeFinal, promedio);
        System.out.printf("%s", mensajeFinal);
    }
}
