import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(101);
        int tentativas = 0;
        int chuteUsuario = 0;

        while (chuteUsuario != numeroAleatorio) {
            System.out.println("Informe seu chute");
            chuteUsuario = leitura.nextInt();
            if (chuteUsuario == numeroAleatorio) {
                System.out.println("Você acertou o número.");
                break;
            } else {
                if (chuteUsuario > numeroAleatorio) {
                    System.out.println("O número aleatório é MENOR.");
                } else {
                    System.out.println("O número aleatório é MAIOR.");
                }
                tentativas++;
            }
        }
        String palavraTentativa = tentativas > 1 ? "vezes" : "vez";
        System.out.println("Você acertou o número aleatório em apenas " + tentativas + " " + palavraTentativa + ".");
    }
}