import java.util.Scanner;

public class AnaliseComentarios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista de palavras positivas e negativas
        String[] positivas = {"bom", "excelente", "fantástico", "genial", "positivo"};
        String[] negativas = {"ruim", "horrível", "terrível", "péssimo", "negativo"};

        // Ler o número de comentários
        System.out.print("Digite o número de comentários: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o número

        // Processar cada comentário
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o comentário " + (i + 1) + ": ");
            String comentario = scanner.nextLine();

            // Contar palavras positivas e negativas
            int contadorPositivo = contarPalavras(comentario, positivas);
            int contadorNegativo = contarPalavras(comentario, negativas);

            // Determinar se o comentário é positivo, negativo ou neutro
            if (contadorPositivo > contadorNegativo) {
                System.out.println("Positivo");
            } else if (contadorNegativo > contadorPositivo) {
                System.out.println("Negativo");
            } else {
                System.out.println("Neutro");
            }
        }

        scanner.close();
    }

    // Método para contar quantas palavras de uma lista estão presentes no comentário
    private static int contarPalavras(String comentario, String[] palavras) {
        int contador = 0;
        for (String palavra : palavras) {
            if (comentario.toLowerCase().contains(palavra.toLowerCase())) {
                contador++;
            }
        }
        return contador;
    }
}