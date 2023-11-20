import batalha.Batalha;
import entidades.FabricaJogador;
import entidades.FabricaPersonagem;
import entidades.Personagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FabricaPersonagem fabricaJogador = new FabricaJogador();

        // Solicitar nomes dos jogadores
        System.out.print("Digite o nome do Jogador 1: ");
        String nomeJogador1 = scanner.nextLine();

        System.out.print("Digite o nome do Jogador 2: ");
        String nomeJogador2 = scanner.nextLine();

        // Criar jogadores
        Personagem jogador1 = fabricaJogador.criarPersonagem(nomeJogador1);
        Personagem jogador2 = fabricaJogador.criarPersonagem(nomeJogador2);

        // Exibir informações iniciais
        System.out.println("----------------------------------");
        System.out.println("Informações iniciais:");
        jogador1.exibirInfo();
        jogador2.exibirInfo();

        // Iniciar batalha
        Batalha.simularBatalha(jogador1, jogador2);

        // Exibir resultado da batalha
        Batalha.exibirResultado(jogador1, jogador2);

        // Fechar o scanner
        scanner.close();
    }
}