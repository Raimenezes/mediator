import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClienteTest {

    @Test
    public void deveElogiarCozinheiro() {
        Cliente cliente = new Cliente();
        assertEquals("O gerente agradece seu contato.\nO Cozinheiro respondeu seu contato .\n" +
                ">>O cozinheiro agradece o elogio: Ótima comida",
                cliente.elogiarCozinheiro("Ótima comida"));
    }

    @Test
    public void deveReclamarCozinheiro() {
        Cliente cliente = new Cliente();
        assertEquals("O gerente agradece seu contato.\nO Cozinheiro respondeu seu contato .\n" +
                        ">>O cozinheiro vai procurar melhorar o serviço da reclamação: Lentidao no preparo",
                cliente.reclamarCozinheiro("Lentidao no preparo"));
    }

    @Test
    public void deveSugerirCozinheiro() {
        Cliente cliente = new Cliente();
        assertEquals("O gerente agradece seu contato.\nO Cozinheiro respondeu seu contato .\n" +
                        ">>O cozinheiro vai analisar a sugestão: colocar mais tempero",
                cliente.sugerirCozinheiro("colocar mais tempero"));
    }
}