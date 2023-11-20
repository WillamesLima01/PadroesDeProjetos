package entidades;

public interface Personagem {
    void atacar(Personagem inimigo);
    void receberDano(int dano);
    void exibirInfo();
    boolean estaVivo();
    String getNome();
}
