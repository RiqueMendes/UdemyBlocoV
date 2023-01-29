package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays
                .asList("Ana", "Bia", "Lia", "Gui");

        for (String nome : aprovados) {
            System.out.println(nome);
        }

        // Lambda #01
        System.out.println("\n");
        aprovados.forEach(nome -> System.out.println(nome + "!!!")); // Para cada elemento da lista execute

        System.out.println("\n");

        // Method Reference #01
        aprovados.forEach(System.out::println);

       
        // Lambda #02
        System.out.println("\n");
        aprovados.forEach(nome -> meuImprimir(nome)); // Para cada elemento da lista execute


         // Method Reference 02
         System.out.println("\n");
         aprovados.forEach(Foreach:: meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println("Oi, meu nome é " + nome);
    }
}
