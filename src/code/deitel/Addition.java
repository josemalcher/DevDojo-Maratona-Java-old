package code.deitel;

import java.util.Scanner;

/**
 * Criado por José Stélio Malcher Jr. on 21/09/2017.
 */
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;
        int soma;

        System.out.println("Entre com o primeiro numero");
        numero1 = input.nextInt();

        System.out.println("Entre com o segundo numero");
        numero2 = input.nextInt();

        soma = numero1 + numero2;

        System.out.printf("A soma é %d%n", soma);
    }
}
