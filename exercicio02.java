import java.util.Scanner;
public class exercicio02 {
    //Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha,
    //inclusive o X, se for o caso. Use o laço for.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("insira o valor de x: ");
        int x=input.nextInt();
        for(int i=1;i<x;i++){
            if(i%2 !=0)
            System.out.println("impares: " +i);

        }


    }
}
