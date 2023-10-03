import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("insira um número");
        int N=input.nextInt();
        int  X, a, b, c, d = 0;
        N = input.nextInt();
        for (a = 1; a <= N; a++) {
            X = input.nextInt();
            c = X / 2;
            d = 0;
            for (b = 1; b <= c; b++) {
                if (X % b == 0)
                    d += b;
            }
            if (d == X)
                System.out.printf("%d eh perfeito\n", X);
            else
                System.out.printf("%d nao eh perfeito\n", X);
        }
    }
}