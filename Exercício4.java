import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        float n1 = scanner.nextFloat();

        System.out.print("Digite o valor 2: ");
        float n2 = scanner.nextFloat();

        while (n1 > 0 || n2 > 0) {
            System.out.println("n1: " + n1 + " e n2: " + n2);

            if (n1 > 0) {
                n1--; 
            }

            if (n2 > 0) {
                n2--; 
            }
        }

        System.out.println("Ambos chegaram a 0!");
        scanner.close();
    }
}