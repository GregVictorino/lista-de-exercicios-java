import java.util.Scanner;
public class exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i = 1, m ;
        do {
            System.out.println("digite um número: ");
            n = input.nextInt();
            for (i = 1; i <= 10; i++) {

                if (n >= 2 && n <= 1000) ;
                m = n * i;
                System.out.println(+m);

            }
        }while(n<2);
        System.out.println("digite um número");
        }
    }

