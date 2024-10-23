import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Menu de opções
        String menu = """
                Operações
                1 - Verificar Saldo
                2 - Depositar valor
                3 - Sacar
                4 - Sair
                Digite a opção desejada
                """;

        //entradas do usuario
        int opcao = 0;
        double valor = 0;


        //dados do cliente
        String nome = "Agnaldo Rozario";
        String tipoConta = "Corrente";
        double saldo = 2300;



        //Inicia do programa com dados do cliente
        System.out.println("*********************************");
        System.out.println(" Nome: " + nome);
        System.out.println("\n Tipo da conta: " + tipoConta);
        System.out.println("\n Saldo atual: " + saldo);
        System.out.println("*********************************\n");

        //scanner para leitura de entrada do usuario
        Scanner leitura = new Scanner(System.in);
        //scanner para pause no sistema
        Scanner pause = new Scanner (System.in);

        //laço de repetição para menu de funcionalidades
        do {
            //imprime menu de opções
            System.out.println(menu);
            opcao = leitura.nextInt();

            //Switch de opções do menu
            switch (opcao) {
                case 1:
                    //Verifica saldo
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    //Deposito
                    System.out.println("Digite o valor que deseja depositar: ");
                    valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("Deposito realizado, valor do deposito: " + valor);
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 3:
                    //Saque
                    System.out.println("Digite o valor que deseja sacar:");
                    valor = leitura.nextDouble();
                    if (valor > saldo){
                        System.out.println("Saldo insuficiente");
                        break;
                    }
                    saldo -= valor;
                    System.out.println("Valor de saque realizado: " + valor);
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 4:
                    //Sair
                    System.out.println("Finalizando");
                    break;
                default:
                    //Retorna opção invalida
                    System.out.println("Opcão invalida");
                    break;
            }
            //pause do sistema
            System.out.println("Prescione Enter para prosseguir.");
            pause.nextLine();

        } while (opcao != 4);

    }
}