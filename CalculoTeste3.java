package lambdas;


import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    

    public static void main(String[] args) {
        
        BinaryOperator<Double> soma = (x, y) -> { return x + y; }; 
        System.out.println(soma.apply(5.0, 6.0));


        Calculo calc = (x , y) -> x * y;   
        System.out.println(calc.executar(5, 6));


        BinaryOperator<Integer> soma1 = (x, y) ->  x + y;; 
        System.out.println(soma1.apply(5, 6));

       
    }
}
