
package Funcao;
import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        // Documentação -> https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html
        
        // Criação de uma função que verifica se um número é par ou ímpar
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
    
        // Aplica a função parOuImpar ao número 45 e imprime o resultado
        System.out.println(parOuImpar.apply(45));

        // Criação de uma função que adiciona uma mensagem ao valor
        Function<String, String> oResultadoEh = valor -> "O Resultado é " + valor;

        // Criação de uma função que adiciona exclamações ao valor
        Function<String, String> empolgado = valor -> valor + "!!!";

        // Composição de funções: Aplica as funções em sequência ao número 32 e armazena o resultado final
        String resultFinal = parOuImpar
            .andThen(oResultadoEh) // Aplica parOuImpar e em seguida oResultadoEh
            .andThen(empolgado)     // Aplica oResultadoEh e em seguida empolgado
            .apply(32);             // Aplica a sequência de funções ao número 32
        
        // Imprime o resultado final
        System.out.println(resultFinal);
    }
}
