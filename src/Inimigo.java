import java.util.ArrayList;

public abstract class Inimigo {
    String nome;
    String poder;
    Integer vida;

    abstract void atacar();

    public String getName() {
        return nome;
    }

    public String getPoder() {
        return poder;
    }
}