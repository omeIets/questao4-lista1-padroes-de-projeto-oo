public class Criminosos extends Inimigo {

    public Criminosos() {
        nome = "Criminosos";
        poder = "armas";
        vida = 150;
    }

    @Override
    public void atacar() {
        System.out.println("Criminoso ataca o jogador com sua arma!");
    }
}
