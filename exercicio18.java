import java.io.IOException;
import java.util.Scanner;

public class exercicio18 {

public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
    System.out.println("insira um numero N menor que 46");
        int N = input.nextInt();
        int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= N; i++) {
        if (i == N) System.out.println(anterior);
        else System.out.print(anterior + " ");
        proximo = anterior + atual;
        anterior = atual;
        atual = proximo;
        }
        }

        }