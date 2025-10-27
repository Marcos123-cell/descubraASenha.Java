package academy.devdojo.maratonajava.CursoFora;

import java.util.Scanner;

/*
1⿩ Peça ao usuário uma senha e só permita continuar se ele digitar a senha correta (“1234”).
2⿠ Crie um programa que simule um caixa eletrônico: o usuário digita o valor a sacar, e o programa informa quantas notas de cada valor devem ser entregues.
2⿡ Peça o nome e a idade de várias pessoas e mostre a média das idades.
2⿢ Peça ao usuário um número e verifique se ele é primo.
2⿣ Crie um programa que conte quantas vogais há em uma palavra digitada.
2⿤ Crie um jogo de adivinhação de número entre 1 e 100, com tentativas até acertar.
 */
public class exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("oi neguinha, criei uma senha para você acessar o código amoroso, tenta aí amor(se caso voce querer sair, digite(sair): ");


        while(true){
            String senha = sc.nextLine();
            if( senha.equals("1234")){
            System.out.println("Parebens neguinha, senha correta, e o código amoroso é que eu te amo demais, além do que pode ser descrevido, sua linda!!");
                break;
            }

            else if(senha.equals("sair")) {
            System.out.println("Tudo bem amor, quando quiser volta e tenta depois, te amo S2");
                    break;
            }

            else{
                System.out.println("Senha incorreta, tenta denovo neguinha");
            }
        }

        }


    }

