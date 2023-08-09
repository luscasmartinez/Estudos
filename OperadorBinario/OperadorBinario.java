package OperadorBinario;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) /2;
        //System.out.println(media.apply(8.0, 9.0));
    
        BiFunction<Double, Double, String> resultado = (n1, n2) ->  ((n1 + n2) / 2) >= 6.0 ? "Aprovado" : "Reprovado";
        System.out.println(resultado.apply(7.0, 7.0));

        Function<Double, String> conceito = m -> m >= 6 ? "Aprov" : "Reprov";
        System.out.println(media.andThen(conceito).apply(8.0, 5.0));
        }
    
    }