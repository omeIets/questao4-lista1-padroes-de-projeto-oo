public class RioDeJaneiro extends LocalJogo {
    @Override
    public Inimigo gerarInimigo() {
        return new Criminosos(); // O Rio de Janeiro "fabrica" criminosos
    }
}