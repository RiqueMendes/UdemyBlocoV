package lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750 ? true : false; // percorrer lista
                                                                                                      // e pegar alguma
                                                                                                      // info

        Produto produto = new Produto("Notebook", 3805.89, 0.15);
        System.out.println(isCaro.test(produto));
    }
}
