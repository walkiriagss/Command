import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControleTest {

    Controle controle;
    Garagem garagem;

    @BeforeEach
    void setUp() {
        controle = new Controle();
        garagem = new Garagem ();
    }

    @Test
    void deveAbrirGaragem() {
        Comando abrirGaragem = new AbrirGaragem(garagem);
        controle.executarComando(abrirGaragem);

        assertEquals("Garagem Aberta", garagem.getSituacao());
    }

    @Test
    void deveFecharGaragem() {
        Comando fecharGaragem = new FecharGaragem(garagem);
        controle.executarComando(fecharGaragem);

        assertEquals("Garagem Fechada", garagem.getSituacao());
    }

    @Test
    void deveCancelarFechamentoSemestre() {
        Comando abrirGaragem = new AbrirGaragem(garagem);
        Comando fecharGaragem = new FecharGaragem(garagem);

        controle.executarComando(abrirGaragem);
        controle.executarComando(fecharGaragem);

        controle.cancelarUltimoComando();

        assertEquals("Garagem Aberta", garagem.getSituacao());
    }
}