package DesafioControleFluxo;


public class ParametrosInvalidosException extends RuntimeException {
    
    public ParametrosInvalidosException(String message) {
        super("O segundo parâmetro deve ser maior que o primeiro !");
    }
} 


