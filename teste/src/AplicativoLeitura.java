import java.util.Scanner;

public class AplicativoLeitura {
    private static final int TEMPO_LIMITE = 10; // Tempo limite em segundos para responder cada palavra
    private static final int PONTOS_CORRETO = 10; // Pontos para cada palavra lida corretamente
    private static final int PONTOS_ERRADO = -5; // Pontos deduzidos para cada palavra lida incorretamente

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra;

        System.out.println("Bem-vindo ao aplicativo de leitura!");

        int pontuacaoTotal = 0;
        int palavrasLidas = 0;
        int palavrasCorretas = 0;

        // Loop para apresentar palavras e solicitar a leitura
        while (true) {
            // Gera uma palavra aleatória para o seu filho ler
            palavra = gerarPalavra();

            System.out.println("Palavra: " + palavra);

            // Solicita que seu filho leia a palavra
            System.out.print("Digite a palavra lida: ");
            String resposta = scanner.nextLine();

            // Verifica se a resposta está correta
            if (resposta.equalsIgnoreCase(palavra)) {
                System.out.println("Correto! Boa leitura!");
                pontuacaoTotal += PONTOS_CORRETO;
                palavrasCorretas++;
            } else {
                System.out.println("Incorreto. Tente novamente!");
                pontuacaoTotal += PONTOS_ERRADO;
            }

            palavrasLidas++;

            // Pergunta se deseja continuar
            System.out.print("Deseja continuar? (S/N): ");
            String continuar = scanner.nextLine();

            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }

        // Exibe o resumo final
        System.out.println("\n--- Resumo Final ---");
        System.out.println("Palavras Lidas: " + palavrasLidas);
        System.out.println("Palavras Corretas: " + palavrasCorretas);
        System.out.println("Pontuação Total: " + pontuacaoTotal);

        System.out.println("\nParabéns! Você completou o aplicativo de leitura.");
    }

    // Método para gerar uma palavra aleatória
    private static String gerarPalavra() {
        String[] palavras = { "gato", "cachorro", "casa", "bola", "sol" };
        int indice = (int) (Math.random() * palavras.length);
        return palavras[indice];
    }
}
