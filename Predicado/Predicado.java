
import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        
        //Documentação -> https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html

        Produto p = new Produto("Celular", 3500.99, 0.9);
    
        // Declara um predicado chamado isCaro que verifica se o preço do produto é maior ou igual a 1000
        Predicate<Produto> isCaro = prod -> prod.preco >= 1000;
        Predicate<Produto> isCaroComDesconto = prod -> prod.preco * (1 - prod.desconto) >= 1000;
    
        System.out.print("Sem desconto: ");
        // Verifica se o produto p atende ao critério do predicado isCaro
        if (isCaro.test(p)) {
            // Se o produto é considerado caro, imprime "É caro"
            System.out.println("É caro");
        } else {
            // Se o produto não é considerado caro, imprime "Não é caro"
            System.out.println("Não é caro");
        }

        System.out.print("Com desconto: ");

        System.out.println(isCaroComDesconto.test(p) ? "É caro" : "Não é caro");
    }
}
