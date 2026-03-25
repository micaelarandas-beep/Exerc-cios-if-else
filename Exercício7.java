import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do seu salario: ");
        float n1 = scanner.nextFloat();

        System.out.print("Digite quantos anos trabalha na XSoftware: ");
        int n2 = scanner.nextInt();
        float SalarioE10pc = n1 + n1 / 10;
        float SalarioE20pc = n1 + n1 / 5;

            if (n2 >= 5) {
                System.out.println("Seu salário com bonus será de: " + SalarioE20pc);
            } else
                System.out.println("Seu salário com bonus será de: " + SalarioE10pc);
        scanner.close();
    }
}