package exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * FUNCTIONS -> argumento e resultado -> usa no map()
 * CONSUMER -> argumento sem resultado -> usa no forEach()
 * SUPPLIER -> resultado sem argumento -> usa no generate()
 */
public class ConsumerExemplo {
    public static void main(String[] args) {
        // Lista de Inteiros a qual serão imprimidos os números PARES
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                if (t % 2 == 0) {
                    System.out.println(t);
                }
            }
        };

        // Stream API

        numeros.stream().forEach(consumer);

        /*
         * Lista -> Stream -> forEach
         * forEach recebe um consumer, que pode ser resumido com um lambda
         * posso resumir ainda mais com uso do Predicate
         */
        numeros.stream().forEach(numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        });
    }
}
