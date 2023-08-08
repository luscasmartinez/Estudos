import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        
        //Documentação -> https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
        
        // Criação de um consumidor que imprime o nome do produto
        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);

        // Criação de objetos da classe Produto
        Produto p1 = new Produto("Guarana", 10, 0);
        Produto p2 = new Produto("Pepsi", 10, 0.01);
        Produto p3 = new Produto("Fanta", 10, 0.05);
        Produto p4 = new Produto("Charrua", 10, 0.03);
        Produto p5 = new Produto("Sprite", 10, 0.1);
        
        // Imprime o nome do primeiro produto usando o consumidor
        imprimirNome.accept(p1);

        // Criação de uma lista contendo os objetos de produto
        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        // Utilização do consumidor para imprimir o nome de cada produto na lista
        produtos.forEach(imprimirNome);

        // Utilização do forEach para imprimir o preço de cada produto na lista
        produtos.forEach(p -> System.out.println(p.preco));

        // Utilização do forEach com referência a método (method reference) para imprimir cada produto
        produtos.forEach(System.out::println);
    }
}
