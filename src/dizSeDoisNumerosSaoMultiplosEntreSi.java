import java.util.Scanner;

public class dizSeDoisNumerosSaoMultiplosEntreSi {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("São múltiplos?\nDigite dois números e eu direi se são múltiplos entre si.");
        int primeiroNumero = obterNumero("Digite o primeiro número:");
        int segundoNumero = obterNumero("Digite o segundo número:");
        String resposta = primeiroNumero % segundoNumero == 0 || segundoNumero % primeiroNumero == 0 ? "Os números digitados são múltiplos entre si." : "Os números digitados não são múltiplos entre si.";
        System.out.println(resposta);
    }

    private static int obterNumero(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextInt();
    }
}
