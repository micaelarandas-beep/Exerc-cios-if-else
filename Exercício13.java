import java.util.Scanner;

public class Exercício13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o sinal da operação (+, -, *, /): ");
        char sinal = scanner.next().charAt(0);
        
        System.out.print("Coloque o primeiro número: ");
        double n1 = scanner.nextDouble();
        
        System.out.print("Coloque o segundo número: ");
        double n2 = scanner.nextDouble();

        if (sinal == '+') {
            System.out.println("Resultado: " + (n1 + n2));
        } 
        else if (sinal == '-') {
            System.out.println("Resultado: " + (n1 - n2));
        } 
        else if (sinal == '*') {
            System.out.println("Resultado: " + (n1 * n2));
        } 
        else if (sinal == '/') {
            if (n2 > 0) {
                System.out.println("Resultado: " + (n1 / n2));
            } else {
                System.out.println("Impossível dividir!!");
            }
        } 
        else {
            System.out.println("Sinal Inválido");
        }

        scanner.close();
    }
}