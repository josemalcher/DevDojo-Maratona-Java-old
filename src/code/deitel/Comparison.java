package code.deitel;

import java.util.Scanner;

/**
 * Criado por José Stélio Malcher Jr. on 21/09/2017.
 */
public class Comparison {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2;

        System.out.println("Entre com o primeiro valor: ");
        num1 = entrada.nextInt();

        System.out.println("Entre com o segundo valor: ");
        num2 = entrada.nextInt();

        if(num1 == num2)
            System.out.printf("%d == %d%n",num1,num2);
        if(num1 != num2)
            System.out.printf("%d != %d%n",num1,num2);
        if(num1 < num2)
            System.out.printf("%d < %d%n",num1,num2);
        if(num1 > num2)
            System.out.printf("%d > %d%n",num1,num2);
        if(num1 <= num2)
            System.out.printf("%d <= %d%n",num1,num2);
        if(num1 >= num2)
            System.out.printf("%d >= %d%n",num1,num2);
    }
}
