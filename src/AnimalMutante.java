public class AnimalMutante extends Inimigo {

    public AnimalMutante() {
        nome = "Animal Mutante";
        poder = "Garras";
        vida = 350;
    }

    @Override
    public void atacar() {
        System.out.println("Animal Mutante ataca o jogador na selva!");
    }
}