import java.util.Scanner;

public class Contador {


    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite Primeiro Parametro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite Segundo Parametro: ");
        int parametroDois = terminal.nextInt();


        try {
            // Chamando o método que contém a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Caso ocorra a exceção, imprime a mensagem de erro
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        // Loop para imprimir a contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);

        }
    }
}

