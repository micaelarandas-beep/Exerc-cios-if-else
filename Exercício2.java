import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

public class Exercício2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade:" );

        int n1 = scanner.nextInt();


        if (n1 >= 18)
            System.out.println("Você é maior de idade!");
        else
            System.out.println("Você é menor de idade!");

        scanner.close();

    }
}