package entidades;

import batalha.Batalha;

public class Jogador implements Personagem {
    private String nome;
    private int nivelForca;
    private int vidas;

    // Construtor
    public Jogador(String nome, int nivelForca, int vidas) {
        this.nome = nome;
        this.nivelForca = nivelForca;
        this.vidas = vidas;
    }

    // Implementação dos métodos da interface Personagem
    @Override
    public void atacar(Personagem inimigo) {
        Batalha.atacar(this, inimigo);
    }

    @Override
    public void receberDano(int dano) {
        nivelForca -= dano;
        if (nivelForca < 0) {
            nivelForca = 0;
            vidas--;
        }
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível de Força: " + nivelForca);
        System.out.println("Vidas: " + vidas);
        System.out.println("----------------------------------");
    }

    @Override
    public boolean estaVivo() {
        return vidas > 0;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
