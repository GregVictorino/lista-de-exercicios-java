import java.util.Scanner;
public class exercicio01 {
    public static void main(String[] args) {
        //Faça um programa que mostre os números pares entre 1 e 100, inclusive. Use o laço
        //while.
        Scanner input = new Scanner(System.in);
        System.out.println("Números pares entre 0 e 100:\n");
        int i = 0;
        while (i < 100) {
            i = i + 2;
            System.out.println(+i);
        }
    }
}
