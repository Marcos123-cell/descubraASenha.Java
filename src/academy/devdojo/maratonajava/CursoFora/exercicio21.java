package academy.devdojo.maratonajava.CursoFora;

import java.util.Scanner;

/*
2⿠ Crie um programa que simule um caixa eletrônico: o usuário digita o valor a sacar, e o programa informa quantas notas de cada valor devem ser entregues.
2⿡ Peça o nome e a idade de várias pessoas e mostre a média das idades.
2⿢ Peça ao usuário um número e verifique se ele é primo.
2⿣ Crie um programa que conte quantas vogais há em uma palavra digitada.
2⿤ Crie um jogo de adivinhação de número entre 1 e 100, com tentativas  até acertar.
 */
public class exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1° pessoa; Digite seu nome: ");
        String nome1 = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade1 = sc.nextInt();
        sc.nextLine(); //só para pular

        System.out.println("2° pessoa; Digite seu nome: ");
        String nome2 = sc.nextLine();
        System.out.println("agora sua idade: ");
        int idade2 = sc.nextInt();
        sc.nextLine();


        System.out.println("3° pessoa; Digite seu nome: ");
        String nome3 = sc.nextLine();
        System.out.println("Agora digite sua idade:");
        int idade3 = sc.nextInt();
        sc.nextLine();

        System.out.println("4° pessoa; Digite seu nome: ");
        String nome4 = sc.nextLine();
        System.out.println("agora digite sua idade: ");
        int idade4 = sc.nextInt();

        String [] nomes = new String[4];
        String[] nomes2 = {nome1, nome2, nome3, nome4};


        int media = (idade1 + idade2 + idade3 + idade4) / 4;


        System.out.println("Dos nomes: " + nomes2[0] + " ," + nomes2[1] + " ," + nomes2[2] + " ," + nomes2[3] + ". A média da idade deles é: " + media);


    }
}
