/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veiculos;

/**
 *
 * @author Dhebora
 */
public class Veiculos {
    public static void main(String[] args) {
        
        double distanciaTotal = 125.0; 
        double velocidadeCarro = 90.0; 
        double velocidadeCaminhao = 80.0; 
        int numeroPedagios = 3;
        double atrasoCarro = 15.0 / 60.0; 
        
        // Tempo que o carro levaria sem pedágios
        double tempoCarroSemAtraso = distanciaTotal / velocidadeCarro;

        // O carro leva 15 minutos a mais por causa dos pedágios
        double tempoCarroComAtraso = tempoCarroSemAtraso + atrasoCarro;

        

        // Tempo até o encontro
        double tempoEncontro = distanciaTotal / (velocidadeCarro + velocidadeCaminhao);

        // Distância percorrida pelo carro até o ponto de encontro
        double distanciaCarro = velocidadeCarro * tempoEncontro;

        // Distância percorrida pelo caminhão até o ponto de encontro
        double distanciaCaminhao = velocidadeCaminhao * tempoEncontro;

        
        System.out.println("Distância percorrida pelo carro: " + distanciaCarro + " km");
        System.out.println("Distância percorrida pelo caminhão: " + distanciaCaminhao + " km");

        // Verificar quem está mais perto de Ribeirão Preto
        if (distanciaCarro < distanciaCaminhao) {
            System.out.println("O carro está mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
        }
    }
}

