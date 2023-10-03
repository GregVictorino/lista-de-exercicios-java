import java.util.Scanner;
public class exercicio12 {


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("digite um número natural N");
        int n=input.nextInt();
        double soma=0;
        for(int i=1;i<=n;i++){
            soma+=1/i;

        }
        System.out.println(+soma);

    }
}
