import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor entre 50 e 100: ");
        float n1 = scanner.nextFloat();

            if (n1 >= 50 && n1 <= 100) {
                System.out.println("Está no intervalo correto!");
            } else
                System.out.println("Está fora do intervalo");
        scanner.close();
    }
}