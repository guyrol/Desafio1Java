import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //entradas do usuario
        Scanner leitura = new Scanner(System.in);
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




        do {
            System.out.println("- Operações -\n");
            System.out.println("1 - Verificar Saldo");
            System.out.println("2 - Depositar valor");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair\n");
            System.out.println("Digite a opção desejada\n");

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