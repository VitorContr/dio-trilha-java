package DesafioControleFluxo;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		Scanner terminal  = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {
			//chamando o método contendo a lógica de contagem		
			contar(parametroUm, parametroDois);
			
		
		} catch (RuntimeException e)  {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(e.getMessage());
		}	
	}
	
    static void contar( int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção

		if (parametroDois > parametroUm) {
			
			int contagem = parametroDois - parametroUm;
			
			System.out.println("A contagem e igual a : " + contagem);
			
			for (int count = 0; count < contagem; count++ ) {
				System.out.println("Imprimindo o numero: " + count);
			}

		} else {
			throw new ParametrosInvalidosException("\"O segundo parâmetro deve ser maior que o primeiro !");
		}
	}
}