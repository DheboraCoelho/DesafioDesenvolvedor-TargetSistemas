/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.faturamentodistribuidora;

/**
 *
 * @author Dhebora
 */
public class FaturamentoDistribuidora {
    public static void main(String[] args) {
       
        double[] faturamentoDiario = {1200, 1300, 0, 1500, 0, 1700, 1600, 0, 1800, 0, 1400, 0}; // Exemplo
        
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

      
        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }
        }

        
        double mediaFaturamento = somaFaturamento / diasComFaturamento;
        
     
        int diasAcimaDaMedia = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0 && faturamento > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }

       
        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Dias com faturamento superior à média: " + diasAcimaDaMedia);
    }
}

