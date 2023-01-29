package lambdas;

public class CalculoTeste {
    
    public static void main(String[] args) {
        
        Calculo soma = new Soma();
        Calculo multiplicar = new Multiplicar();

        System.out.println(soma.executar(5, 6));
        System.out.println(multiplicar.executar(5, 6));
    }
}
