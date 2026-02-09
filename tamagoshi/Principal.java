
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Tamagotchi t = new Tamagotchi();
            int opcao;

            do {
                t.status();
                System.out.println("\n1 - Comer");
                System.out.println("2 - Dormir");
                System.out.println("3 - Brincar");
                System.out.println("0 - Sair");
                System.out.print("Escolha: ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1 ->
                        t.comer();
                    case 2 ->
                        t.dormir();
                    case 3 ->
                        t.brincar();
                    case 0 ->
                        System.out.println("Jogo encerrado.");
                    default ->
                        System.out.println("Opção inválida.");
                }
            } while (opcao != 0);
        }
    }
}
