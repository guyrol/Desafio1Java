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


        Scanner leitura = new Scanner(System.in);

        do {
            System.out.println(menu);

            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja depositar: ");
                    valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("Deposito realizado, valor do deposito: " + valor);
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja sacar:");
                    valor = leitura.nextDouble();
                    saldo -= valor;
                    System.out.println("Valor de saque realizado: " + valor);
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 4:
                    System.out.println("Finalizando");
                    break;
            }

        } while (opcao != 4);

    }
}