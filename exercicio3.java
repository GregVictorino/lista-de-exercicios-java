import java.util.Scanner;
//Escreva um programa que leia um conjunto de 10 números inteiros positivos. Seu programa deve determinar
//e imprimir o maior deles. Use o laço FOR.
public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, maior, numero;
        maior = 0;
        System.out.println("digite 10 números aleatórios");

        for (i = 0; i <= 10; i++) {
            numero = input.nextInt();

            if (numero > maior) {
                maior = numero;


            }
            System.out.println("o maior número é: " + maior);


        }


    }
}

