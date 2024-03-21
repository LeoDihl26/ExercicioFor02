/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. 
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações conforme exemplo 
(use a palavra "dentro do intervalo" para dentro do intervalo, e "fora do intervalo" para fora do intervalo).
 */

package com.mycompany.exerciciofor02;

import java.util.Scanner;

public class ExercicioFor02 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 
        System.out.printf("Digite a quantidade: ");
        
        int n = teclado.nextInt();
        int dentro = 0;
        int fora = 0;
        
        System.out.println("\nDigite os números:");
        
        for(int i = 0; i<n ; i++) {
            
            int x = teclado.nextInt();
            
            if (x >= 10 && x <= 20) {
                dentro = dentro + 1; System.out.printf("|>>> este número está dentro do Intervalo\n");
                
            }else {
                fora = fora + 1; System.out.printf("|>>> este número está fora do Intervalo\n");
            }    
        }   
        System.out.println("");
        System.out.println(dentro + " Dentro do Intervalo (10,20)");
        System.out.println(fora + " Fora do Intervalo (10,20)");
        teclado.close();
    }
}

