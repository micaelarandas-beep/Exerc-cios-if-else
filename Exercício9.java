import java.util.Scanner;

public class Exercício9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salarío Bruto:");
        double salarioBruto = scanner.nextDouble();

        System.out.println("Valor da prestação:");
        double prestação = scanner.nextDouble();

        double limite = salarioBruto *0.3;

        if(prestação <= limite){
            System.out.println("Emprestimo Concedido!");
        }
        else{
            System.out.println("Emprestimo invalido!");
        }
        scanner.close();
    }
}