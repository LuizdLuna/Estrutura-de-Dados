// #Exercício 2: Estruturas de Decisão (faça esse em  Java)
//Descrição: Crie um programa que solicite ao usuário uma nota (0-10) e exiba uma mensagem indicando se ele foi aprovado (nota >= 7), está de recuperação (nota entre 5 e 6.9) ou foi reprovado (nota < 5).

import java.util.*;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (entre 0 e 10): ");
        double nota = input.nextDouble();

        if (nota >= 7){
            System.out.println("Aluno aprovado!!");
        } else if (nota <= 6.9 && nota >= 5){
            System.out.println("Aluno de recuperacao!!");
        } else {
            System.out.println("Aluno REPROVADO!!!");
        }
        input.close();
    }
}