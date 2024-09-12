import java.util.Scanner;

public class VerificaServicoContratado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        System.out.println("Qual o nome do serviço que deseja verificar ?");
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        System.out.println("Por favor digite seu nome em seguida o serviços contratados:  ");
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados


        
        for (int i = 1; i < partes.length; i++) {
            
            if(partes[i].trim().equalsIgnoreCase(servico)) {
                contratado = true;
                break;
            }

        }

        System.out.println("Nome do cliente : " + nomeCliente);

        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
        
        scanner.close();
    }
}