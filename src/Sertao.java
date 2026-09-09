public class Sertao extends LocalJogo {
    @Override
    public Inimigo gerarInimigo() {
        return new Cangaceiro(); // O Sertão "fabrica" cangaceiros
    }
}