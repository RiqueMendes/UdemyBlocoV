package lambdas;

public class CalculoTeste2 {
    
    public static void main(String[] args) {
        
        Calculo soma = (x, y) -> { return x + y; }; //Funcao Lambda
    
        System.out.println(soma.executar(5, 6));


        Calculo calc = (x , y) -> x * y;     // O que passamos será retornado
        System.out.println(calc.executar(5, 6));

        // Explicando: 

        //Calculo  O Tipo (de onde vem, nesse caso de CALCULO)
        //  soma   //O nome atribuito (neste caso, soma)
        //= (x, y) //  Parametro 
        // -> { return x + y; }; // O que retorna.   // Se tem par de chaves, precisa do Return.



      
    }
}
