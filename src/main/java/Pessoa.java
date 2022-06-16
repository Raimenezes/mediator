public class Pessoa {

    public String elogiarCozinheiro(String mensagem) {
        return Gerente.getInstancia().receberElogioCozinheiro(mensagem);
    }

    public String reclamarCozinheiro(String mensagem) {
        return Gerente.getInstancia().receberReclamacaoCozinheiro(mensagem);
    }

    public String sugerirCozinheiro(String mensagem) {
        return Gerente.getInstancia().receberSugestaoCozinheiro(mensagem);
    }
}
