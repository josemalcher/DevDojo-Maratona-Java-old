/**
 * Criado por José Stélio Malcher Jr. on 22/09/2017.
 */
public class ControleFluxo {
    public static void main(String[] args) {
        // idade < 15 cat infantil
        // idade >= 15 && idade < 18 Ccat juvenil
        // idade >= 18 cat adulto

        int idade = 18;
        String categoria;

        if(idade < 15){
            categoria = "infantil";
        }else if(idade >=15 && idade < 18){
            categoria = "Juvenil";
        }else{
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}
