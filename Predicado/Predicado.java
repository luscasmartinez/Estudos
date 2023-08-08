// Importa a classe Predicate do pacote java.util.function
import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        // Cria um objeto da classe Produto com nome "Celular", preço 500.99 e quantidade 0
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

        if (isCaroComDesconto.test(p)) {
            System.out.println("É caro");
        } else {
            System.out.println("Não é caro");
        }
    }
}
