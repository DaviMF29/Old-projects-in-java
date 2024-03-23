package Lambdas;

import java.util.function.Function;

/**
 *
 * @author Miguel
 */
public class Função {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Ímpar";
        
        
        Function<String, String> oResultadoE =
                valor -> "O resultado é " + valor;
        
        Function<String, String> empolgado = 
                valor -> valor + "!!!!";
        Function<String,String> duvida = 
                valor -> valor + "??";
        
                
                
        String resultadoFinal =
                parOuImpar
                        .andThen(oResultadoE)
                        .andThen(empolgado)
                        .apply(4);
        
          
        String testeFinal2 = parOuImpar.andThen(oResultadoE).andThen(duvida).apply(23);
        
        String teste = "ola";
        
        System.out.println(duvida.apply("testando"));
        System.out.println(parOuImpar.apply(4));
        System.out.println(resultadoFinal);
        System.out.println(empolgado.apply(teste));
        System.out.println("\n"+testeFinal2);
        
    }
    
}
