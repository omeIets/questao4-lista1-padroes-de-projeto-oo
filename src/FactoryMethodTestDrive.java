public class FactoryMethodTestDrive {
    public static void main(String[] args) {

        System.out.println("Iniciando a Versão de Demonstração (Demo):");
        LocalJogo fase1 = new Amazonia();
        fase1.jogar();

        System.out.println("Iniciando a Expansão do Jogo:");
        LocalJogo fase2 = new Sertao();
        fase2.jogar();

        System.out.println("Iniciando a Expansão do Jogo:");
        LocalJogo fase3 = new RioDeJaneiro();
        fase3.jogar();
    }
}