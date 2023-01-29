package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



public class Consumidor {
    

    public static void main(String[] args) {


        Produto p1 = new Produto("Notebook", 1525.00, 0.09);
        Produto p2 = new Produto("Caneta", 1.00, 0.09);
        Produto p3 = new Produto("Caderno", 15.00, 0.09);


        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        imprimir.accept(p1);
      

        List<Produto> produtos = Arrays.asList(p1, p2, p3);

        produtos.forEach(imprimir); //percorrer imprimir
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);

    }
}
