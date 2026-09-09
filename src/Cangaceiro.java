public class Cangaceiro extends Inimigo {

    public Cangaceiro() {
    nome = "Cangaceiro";
    poder = "Peixeira";
    vida = 200;
    }

    @Override
    public void atacar() {
        System.out.println("Cangaceiro ataca o jogador com sua peixeira!");
    }
}