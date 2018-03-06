package javaapplication25;

import java.util.Scanner;

public class AdivinhaNum {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int chute = 1;
        int tentativas = 1;
        int numeroCerto = (int) (1 + Math.random() * 100);
        int opcao;
        boolean jogo = true;
        while (jogo) {
            System.out.println("Tentativa Nº: " + chute + " de 20" + "\nDigite um numero de sua escolha: ");
            tentativas = leitor.nextInt();
            while (tentativas < 1 || tentativas > 100) {
                System.out.println("Digite um numero válido(1-100)");
                tentativas = leitor.nextInt();
            }
            while (tentativas != numeroCerto) {
                if (tentativas < numeroCerto) {
                    System.out.println("Tente um numero maior!");
                } else {
                    System.out.println("Tente um numero menor!");
                }

                tentativas++;
                chute++;
                System.out.println("Tentativa Nº: " + chute + " de 20" + "\nDigite um numero de sua escolha: ");
                tentativas = leitor.nextInt();
                while (tentativas < 1 || tentativas > 100) {
                    System.out.println("Digite um numero válido(1-100)");
                    tentativas = leitor.nextInt();
                }

                if (tentativas == numeroCerto && chute == 1) {
                    System.out.println("QUE SORTE!! DE 1ª!!");
                }
                if (tentativas == numeroCerto && chute > 1 && chute <= 5) {
                    System.out.println("MUITO BEM!! Você acertou na " + chute + "ª tentativa");
                }
                if (tentativas == numeroCerto && chute > 5) {
                    System.out.println("Infelizmente você perdeu! Meu numero foi " + numeroCerto + "");
                    System.out.println("Gostaria de jogar de novo?\n1- SIM | 2- NÃO");
                    opcao = leitor.nextInt();
                    if (opcao == 1) {
                        jogo = true;
                    } else {
                        System.exit(0);
                    }
                }
                if (chute == 15) {
                    System.out.println("Suas tentativas acabaram! Gostaria de jogar de novo? 1- SIM | 2- NÃO");
                    opcao = leitor.nextInt();
                    if (opcao == 1) {
                        chute = 0;
                        jogo = true;
                    } else {
                        System.exit(0);
                    }
                }
            }
        }
    }
}
