
public class Tamagotchi {

    private int fome;
    private int energia;
    private int felicidade;

    public Tamagotchi() {
        fome = 50;
        energia = 50;
        felicidade = 50;
    }

    public void comer() {
        fome -= 10;
        felicidade += 5;
        System.out.println("O Tamagotchi comeu.");
    }

    public void dormir() {
        energia += 15;
        fome += 5;
        System.out.println("O Tamagotchi dormiu.");
    }

    public void brincar() {
        felicidade += 10;
        energia -= 10;
        fome += 5;
        System.out.println("O Tamagotchi brincou.");
    }

    public void status() {
        System.out.println("\nStatus:");
        System.out.println("Fome: " + fome);
        System.out.println("Energia: " + energia);
        System.out.println("Felicidade: " + felicidade);
    }
}
