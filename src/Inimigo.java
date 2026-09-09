import java.util.ArrayList;

public abstract class Inimigo {
    String nome;
    String poder;
    Integer vida;
    ArrayList<String> toppings = new ArrayList<String>();

    abstract void atacar();
}