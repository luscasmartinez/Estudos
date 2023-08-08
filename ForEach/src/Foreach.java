import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) throws Exception {
         List<String> pronomes = Arrays.asList
         ("Eu","Tu","Ele","Nós","Vós","Eles");


        //Uso mais comum do Foreach
        for (String pronomesPessoais : pronomes) {
            System.out.println(pronomesPessoais);
        }

        //Usando função Lambda
        pronomes.forEach(pronomesPessoais -> System.out.println(pronomesPessoais + " alguma coisa"));

        //Usando método por referencia 
        pronomes.forEach(System.out::println);

        //Usando função lambda mais método para adicionar informação
        pronomes.forEach(pronomesPessoais -> imprimirDiferente(pronomesPessoais));

        //Usando método de referencia junto do método para adicionar informação
        pronomes.forEach(Foreach::imprimirDiferente);

    }

    static void imprimirDiferente(String n){
        System.out.println(n + " Verbo");
    }
}
