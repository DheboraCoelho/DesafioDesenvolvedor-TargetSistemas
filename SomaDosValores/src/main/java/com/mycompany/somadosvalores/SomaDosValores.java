/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somadosvalores;

/**
 *
 * @author Dhebora
 */
public class SomaDosValores {

    public static void main(String[] args) {
    int indice = 12;
        int soma= 0;
        int k = 1;

        while (k < indice) {
            k =k + 1;
            soma = soma + k;
        }

        System.out.println("O valor da variável SOMA é: " + soma);
    }
}
