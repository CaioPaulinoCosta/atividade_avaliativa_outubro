import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class CampeonatoTest {
    
    @Test
    public void testLiderDaTabela() {
        Time palmeiras = new Time("Palmeiras");
        Time flamengo = new Time("Flamengo");
        Time saoPaulo = new Time("São Paulo");

        Jogo j1 = new Jogo(palmeiras, flamengo);
        j1.setResultado(3, 2);

        Jogo j2 = new Jogo(palmeiras, saoPaulo);
        j2.setResultado(1, 1);

        Tabela tabela = new Tabela(Arrays.asList(palmeiras, flamengo, saoPaulo));

        assertEquals("Palmeiras", tabela.getLider().getNome());
    }

    @Test
    public void testLanternaDaTabela() {
        Time palmeiras = new Time("Palmeiras");
        Time flamengo = new Time("Flamengo");

        Jogo j1 = new Jogo(palmeiras, flamengo);
        j1.setResultado(3, 0);

        Tabela tabela = new Tabela(Arrays.asList(palmeiras, flamengo));

        assertEquals("Flamengo", tabela.getLanterna().getNome());
    }

    @Test
    public void testZonaDeRebaixamento() {
        Time palmeiras = new Time("Palmeiras");
        Time flamengo = new Time("Flamengo");
        Time saoPaulo = new Time("São Paulo");
        Time vasco = new Time("Vasco");

        Jogo j1 = new Jogo(palmeiras, flamengo);
        j1.setResultado(3, 2);

        Jogo j2 = new Jogo(saoPaulo, vasco);
        j2.setResultado(0, 0);

        Tabela tabela = new Tabela(Arrays.asList(palmeiras, flamengo, saoPaulo, vasco));

        assertEquals(4, tabela.getZonaDeRebaixamento().size());
    }
}
