import java.util.Scanner;
public class exercicio15{
    public static void main(String[] args) {
        int x,fat=1;
        Scanner input=new Scanner(System.in);
        System.out.println("escreva um valor maior que zero:");
        x=input.nextInt();


        while (x>0){
            fat=fat*x;
            x--;
        }
        System.out.println("fatorial: "+fat);

    }
}