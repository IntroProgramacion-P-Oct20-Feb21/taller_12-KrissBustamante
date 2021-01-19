/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema00 {

     public static void main(String[] args) {
        int[] datos = {10, 2, 4, 1};
        System.out.printf("%d\n", misterio(datos, datos.length));
    }

    public static int misterio(int[] datos, int tamaño) {

        if (tamaño == 1) {
            return datos[0];
        } else {
            return datos[tamaño - 1] + misterio(datos, tamaño - 1);
        }
    }
}