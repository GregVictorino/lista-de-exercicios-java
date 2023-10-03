import java.util.Scanner;
public class exercicio20{
public static void main(String[] args) {
        float saldoInicial = 0, valorDeposito, valorSaque, saldoAtual = 0;
        Scanner input = new Scanner(System.in);
        int op;

        do {
        System.out.println("Conta Senac");
        System.out.println("Selecione uma opção");
        System.out.println("1-Realizar depósito.\n" +
        "2-Realizar saque.\n" +
        "3-Encerrar.");
        op = input.nextInt();
        if (op < 0 || op > 3) {
        System.out.println("");
        System.out.println("Digite uma opção válida");
        }

        switch (op) {
        case 1: {
        System.out.println("Digite o valor do deposito");
        valorDeposito = input.nextFloat();
        if (valorDeposito > 0) {
        saldoAtual = saldoInicial += valorDeposito;
        System.out.println("Seu saldo é: R$" + saldoAtual);
        break;
        } else {
        System.out.println("Valor Inválido");
        }
        }
        case 2: {

        System.out.println("Digite o valor do Saque");
        valorSaque = input.nextFloat();
        saldoAtual = saldoAtual - valorSaque;
        System.out.println("Seu saldo é: R$" + saldoAtual);
        break;
        }
        case 3: {
        System.out.println("O seu saldo é: R$" + saldoAtual);
        if (saldoAtual < 0) {
        System.out.println("CONTA ESTOURADA...");
        } else if (saldoAtual == 0) {
        System.out.println("CONTA ZERADA...");
        } else {
        System.out.println("CONTA PREFERENCIAL...");
        }
        break;
        }

        }

        } while (op != 3);
        }
        }