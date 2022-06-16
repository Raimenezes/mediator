public class Gerente {

    private static Gerente instancia = new Gerente();

    private Gerente() {}

    public static Gerente getInstancia() {
        return instancia;
    }

    public String receberElogioCozinheiro(String mensagem) {
        return "O gerente agradece seu contato.\n"+
                "O Cozinheiro respondeu seu contato .\n" +
                ">>" + Cozinheiro.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoCozinheiro(String mensagem) {
        return "O gerente agradece seu contato.\n"+
                "O Cozinheiro respondeu seu contato .\n" +
                ">>" + Cozinheiro.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoCozinheiro(String mensagem) {
        return "O gerente agradece seu contato.\n"+
                "O Cozinheiro respondeu seu contato .\n"+
                ">>" + Cozinheiro.getInstancia().receberSugestao(mensagem);
    }
}
