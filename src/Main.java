import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(101);
        int tentativas = 0;
        int chuteUsuario = 0;
        System.out.println("Tente advinhar o numero aleatório abaixo.");

        while (tentativas < 5) {
            System.out.println("Informe seu chute");
            chuteUsuario = leitura.nextInt();
            tentativas++;
            if (chuteUsuario == numeroAleatorio) {
                System.out.println("Você acertou o número em " + tentativas + " de " + " 5 tentativas!");
                break;
            } else if (chuteUsuario > numeroAleatorio) {
                System.out.println("O número aleatório é MENOR.");
            } else {
                System.out.println("O número aleatório é MAIOR.");
            }
        }
        if (tentativas == 5 && chuteUsuario != numeroAleatorio) {
            System.out.println("Você não acertou o número aleatório em até 5 tentativas. O número aleatório era  " + numeroAleatorio + ".");
        }
    }
}