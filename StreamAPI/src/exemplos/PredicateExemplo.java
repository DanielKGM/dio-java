package exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * FUNCTIONS -> argumento e resultado -> usa no map()
 * CONSUMER -> argumento sem resultado -> usa no forEach()
 * SUPPLIER -> resultado sem argumento -> usa no generate()
 * 
 * PEDICATE -> argumento e resultado em BOOLEAN de acordo com uma condição -> usa no filter()
 */
public class PredicateExemplo {
    public static void main(String[] args) {
        // Exemplo: imprimir em uma lista de palavras quais tem mais que cinco
        // caracteres
        List<String> palavras = Arrays.asList("Daniel", "Julia", "Pedro", "Astrogildo", "Australopiteco", "Bob", "José",
                "Pneumoultrassilicovulcanoconiose");

        Predicate<String> avaliaTamanho = new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.length() > 5;
            }
        };

        palavras.stream().filter(avaliaTamanho).forEach(System.out::println);

        // Com lambda
        palavras.stream().filter(palavra -> palavra.length() > 5).forEach(System.out::println);
    }

}
