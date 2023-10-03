import java.util.Scanner;
//Faça um programa que leia um número N do usuário, some todos os números inteiros de 1 a N, e mostre o
//resultado obtido. Use o laço WHILE.
public class exercicio2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,soma=0,numero=1;
        System.out.println("insira n:\n");
        n=input.nextInt();
        while(numero<=n){
            soma=soma+numero;
            numero=numero+1;
            System.out.println(+soma);
        }

    }
}
