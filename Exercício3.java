import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int n2 = scanner.nextInt();

        if (n1 == n2) {
            System.out.println("Números iguais");
        } else {
            int maior, menor;

            if (n1 > n2) {
                maior = n1;
                menor = n2;
            } else {
                maior = n2;
                menor = n1;
            }

            int diferenca = maior - menor;
            System.out.println("Diferença: " + diferenca);
        }

        scanner.close();
    }
}