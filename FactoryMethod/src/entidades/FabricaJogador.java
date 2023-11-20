package entidades;

import java.util.Random;

public class FabricaJogador implements FabricaPersonagem {
    @Override
    public Personagem criarPersonagem(String nome) {
        Random random = new Random();
        int nivelForca = random.nextInt(100) + 1; // Nível de força de 1 a 100
        int vidas = random.nextInt(10) + 1; // Quantidade de vidas de 1 a 10
        return new Jogador(nome, nivelForca, vidas);
    }
}


