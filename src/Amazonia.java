public class Amazonia extends LocalJogo {
    @Override
    public Inimigo gerarInimigo() {
        return new AnimalMutante(); // A Amazônia "fabrica" animais mutantes
    }
}