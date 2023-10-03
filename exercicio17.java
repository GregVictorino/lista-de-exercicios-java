import java.util.Scanner;
public  class exercicio17 {
    public static void main(String[] args) {
        int inteiro;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um inteiro");
        inteiro = input.nextInt();

        for (int i = 1; i <= inteiro; i++) {
            if (inteiro % i == 0) {
                System.out.println(i + " é divisor de " + inteiro);

            } else {

            }
        }
    }
}