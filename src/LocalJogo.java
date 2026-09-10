public abstract class LocalJogo {
    // Factory Method
    protected abstract Inimigo gerarInimigo();

    // Metodo padrao para todas as fases
    final public void jogar() {
        Inimigo inimigo = gerarInimigo();
        System.out.println("O jogador entrou na localização...");
        System.out.println("Inimigo identificado como '" + inimigo.getName() +"' utilizando objeto de ataque '" + inimigo.getPoder() + "'");
        inimigo.atacar();
        System.out.println("-------------------------------------------------");
    }
}
