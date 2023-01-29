package lambdas;


@FunctionalInterface //Somente um unico método
public interface Calculo {


     double executar(double a, double b); // Por padrão publico e abstrato

     default String legal(){
        return "legal";
     }
     
     static String massa(){
        return "massa";
     }
    
}
