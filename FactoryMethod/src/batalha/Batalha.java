package batalha;

import entidades.Personagem;

import java.util.Random;

public class Batalha {
    public static void atacar(Personagem atacante, Personagem alvo) {
        Random random = new Random();
        int dano = random.nextInt(10) + 1; // Dano de 1 a 10
        alvo.receberDano(dano);
        System.out.println(atacante.getNome() + " atacou " + alvo.getNome() + " causando " + dano + " de dano.");
    }

    public static void simularBatalha(Personagem jogador1, Personagem jogador2) {
        System.out.println("Iniciando batalha...");
        aguardar(1000); // Aguardar 1 segundo

        while (jogador1.estaVivo() && jogador2.estaVivo()) {
            Batalha.atacar(jogador1, jogador2);
            aguardar(1000); // Aguardar meio segundo
            //jogador2.exibirInfo();

            if (!jogador2.estaVivo()) {
                break;
            }

            Batalha.atacar(jogador2, jogador1);
            aguardar(1000); // Aguardar meio segundo
            //jogador1.exibirInfo();
        }
    }

    private static void aguardar(int milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


    /*public static void simularBatalha(Personagem jogador1, Personagem jogador2) {
        while (jogador1.estaVivo() && jogador2.estaVivo()) {
            atacar(jogador1, jogador2);
            atacar(jogador2, jogador1);
        }
    }*/

    public static void exibirResultado(Personagem jogador1, Personagem jogador2) {
        System.out.println("----------------------------------");
        System.out.println("Resultado da Batalha:");
        jogador1.exibirInfo();
        jogador2.exibirInfo();

        if (jogador1.estaVivo()) {
            System.out.println(jogador1.getNome() + " venceu!");
        } else if (jogador2.estaVivo()) {
            System.out.println(jogador2.getNome() + " venceu!");
        } else {
            System.out.println("A batalha terminou em empate.");
        }
    }
}
