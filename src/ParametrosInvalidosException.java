// Exceção customizada que será lançada quando o segundo parâmetro for menor que o primeiro
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
