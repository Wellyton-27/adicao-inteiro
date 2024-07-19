package projetos;
/*Programa de adição que pede dois números e mostra a soma deles;
Soma apenas números inteiros;
Feito por Wellyton no dia 19/07/2024;
*/

import java.util.Scanner;

public class Adicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
        int soma;

        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();

        soma = numero1 + numero2;

        System.out.printf("A soma é: " + soma);

    }
}
