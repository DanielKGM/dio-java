package exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
 * FUNCTIONS -> argumento e resultado -> usa no map()
 * CONSUMER -> argumento sem resultado -> usa no forEach()
 * SUPPLIER -> resultado sem argumento -> usa no generate()
 */
public class FunctionExemplo {
    public static void main(String[] args) {
        // Exemplo: eu quero dobrar todos elementos de uma lista
        // Também quero que eles passem a ser STRINGS
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Sem lambda
        Function<Integer, String> dobrarOld = new Function<Integer, String>() {
            @Override
            public String apply(Integer t) {
                t = 2 * t;
                return t.toString();
            }
        };

        List<String> numerosDobrados = numeros.stream().map(dobrarOld).toList();
        numerosDobrados.forEach(System.out::println);

        // Com lambda
        numerosDobrados = numeros.stream().map(numero -> String.valueOf(numero * 2)).toList();
        numerosDobrados.forEach(System.out::println);
    }
}
