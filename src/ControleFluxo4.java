public class ControleFluxo4 {
    public static void main(String[] args) {

        int contador = 11;

        while (contador < 10) {
            System.out.println(++contador);
        }
        contador = 0;
        do {
            System.out.println("Dentro do Do While: " + contador++);
        } while (contador < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("Valor de i é: " + i);
        }
    }
}
