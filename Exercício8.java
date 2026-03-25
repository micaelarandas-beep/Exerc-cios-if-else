import java.util.Scanner;
public class Exercício8 {

    public static void main(String[] args) {
        System.out.println("Digite sua senha do RA:");
        Scanner scanner = new Scanner(System.in);

        String senha = scanner.nextLine();

        if (senha.equals("R10p5")) {
            System.out.println("Acesso Concedido");
        }
        else{
            System.out.println("Acesso invalido");
        }

    }
}