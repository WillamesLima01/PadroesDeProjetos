import java.util.Scanner;

public class URI1067 {

    public static void main(String[] args) {

        int valorInteiro;

        Scanner leitor = new Scanner(System.in);
        valorInteiro = leitor.nextInt();

        int x = 1;

        while (x <= valorInteiro){

            if (x % 2 != 0){
                System.out.println(x);
            }
            x++;
        }

        for (int i = 1; i <= valorInteiro ; i ++) {

            if (i % 2 != 0){
                System.out.println(i);
            }
        }

    }
}
