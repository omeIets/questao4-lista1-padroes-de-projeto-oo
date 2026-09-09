public abstract class LocalJogo {
    // Factory Method
    protected abstract Inimigo gerarInimigo();

    // Metodo padrao para todas as fases
    final public void jogar() {
        Inimigo inimigo = gerarInimigo();
        System.out.println("O jogador entrou na localização...");
        inimigo.atacar();
        System.out.println("-------------------------------------------------");
    }
}
