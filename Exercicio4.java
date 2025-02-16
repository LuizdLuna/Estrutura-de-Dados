//#Exercício 4: Variáveis e Entrada/Saída Básica (faça esse em  Java)
//Descrição: Crie um programa que solicite ao usuário seu nome, idade e altura. Em seguida, exiba uma mensagem com essas informações formatadas.

import java.util.*;

public class Exercicio4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println(" ");
        System.out.println("BEM VINDO AO CADASTRO DE USUARIOS, POR FAVOR, SIGA AS ETAPAS A SEGUIR:");
        System.out.println(" ");

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.print("Digite sua altura em centimetros: ");
        int altura = input.nextInt();

        System.out.println("----------------------------------------------------------------");
        System.out.println("INFORMACOES DO USUARIO");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " centimetros");

        System.out.println("----------------------------------------------------------------");
        System.out.println("OBRIGADO POR SE CADASTRAR "  + nome + "!!!" );

        input.close();
    }
}
