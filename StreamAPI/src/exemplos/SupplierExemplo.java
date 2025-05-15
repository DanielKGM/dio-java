package exemplos;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
 * FUNCTIONS -> argumento e resultado -> usa no map()
 * CONSUMER -> argumento sem resultado -> usa no forEach()
 * SUPPLIER -> resultado sem argumento -> usa no generate()
 */
public class SupplierExemplo {
    public static void main(String[] args) {
        // Definição do SUPPLIER
        Supplier<String> saudacaoNotLambda = new Supplier<>() {
            @Override
            public String get() {
                return "Seja bem-vindo!";
            }
        };

        Supplier<String> saudacao = () -> "Seja bem-vindo!";

        // Aplicação do SUPPLIER:
        // Obter uma lista com 5 saudações
        List<String> lista = Stream.generate(saudacao)
                .limit(5)
                .toList();

        lista.forEach(System.out::println);
    }
}
