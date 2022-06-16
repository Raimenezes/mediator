public class Cozinheiro implements Setor {

    private static Cozinheiro instancia = new Cozinheiro();

    private Cozinheiro() {}

    public static Cozinheiro getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O cozinheiro vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O cozinheiro agradece o elogio: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O cozinheiro vai analisar a sugestão: " + mensagem;
    }
}
