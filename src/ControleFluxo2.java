/**
 * Criado por José Stélio Malcher Jr. on 22/09/2017.
 */
public class ControleFluxo2 {
    public static void main(String[] args) {
        int idade = 15;
        String status;

        //status = idade < 18 ? "Não Adulto" : "Adulto";
        status = idade < 15 ? "Infantil" : idade >=15 && idade < 18 ? "Juvenil" : "adulto"; //forma mais complicada de ler!
        System.out.println(status);


    }
}