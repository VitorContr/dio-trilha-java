import java.util.Scanner;

/* 

Numero	    Inteiro	        1021
Agencia	    Texto	        067-8
Nome	    Texto	        MARIO ANDRADE
Saldo	    Decimal	        237.48

*/

public class ContaTerminal {

    public String nome; 
    public int numero;
    public String agencia;
    public Double saldo;



    private ContaTerminal(String nome, int numero, String agencia, Double saldo) {
       
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome; 
        this.saldo = saldo;
    }

    public static void main(String[] args) throws Exception { 
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = sc.next(); 

        System.out.println("Por favor, digite seu Nome: ");
        String nome = sc.next(); 

        System.out.println("Por favor, digite o Saldo: ");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", Obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque !");
    }
}
