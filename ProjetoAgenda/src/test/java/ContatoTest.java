import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;  // Importando a anotação @Test

public class ContatoTest {

    @Test
    public void testaConstrutor() {
        Contato c1 = new Contato("ROBERTO", 2, 4);
        assertEquals(2, c1.getDiaAniversario());
        assertEquals("ROBERTO", c1.getNome());
        assertEquals(4, c1.getMesAniversario());
    }
}
