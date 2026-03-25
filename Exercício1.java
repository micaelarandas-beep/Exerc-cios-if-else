import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número maior ou igual a 20!"  +
                " Caso o número digitado seja menor que isso, não será feita a divisão por 2");

        int n1 = scanner.nextInt();
        int n2 = n1 / 2;

        if (n1 >= 20)
            System.out.println(n1 + " foi digitado, que dividido por 2 resulta em: " + n2);
        else
            System.out.println(n1 + " foi digitado! Sem divisão para operação");

        scanner.close();

    }
}