import java.util.Scanner;

public class Exercício6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura com decimais: ");
        float altura = scanner.nextFloat();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        float pesoIdeal;

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7f * altura) - 58;
            System.out.println("Peso ideal (masculino): " + pesoIdeal + " kg");
        }
        else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1f * altura) - 44.7f;
            System.out.println("Peso ideal (feminino): " + pesoIdeal + " kg");
        }
        else {
            System.out.println("Sexo inválido!");
        }

        scanner.close();
    }
}