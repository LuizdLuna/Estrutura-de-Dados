//Exercício 3: Estruturas de Repetição com for (faça esse em  Java)
//Descrição: Crie um programa que exiba uma tabuada de um número que será informado pelo usuário (de 1 a 10).

import java.util.*;

public class Exercicio3 {
    
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite um numero (de 1 a 10): ");
        float num = input.nextFloat();

        if (num > 10){
            System.out.print("Numero invalido, digite um numero de 1 a 10: ");
            num = input.nextFloat();
        }

        for (int i = 0; i <= 10; i++){
            float mult = num * i;
            System.out.println(num + " multiplicado por " + i + " = " + mult);
        }
    }
}
