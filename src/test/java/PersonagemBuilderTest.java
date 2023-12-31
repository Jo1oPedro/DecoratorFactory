import Exceptions.PersonagemIncompletoException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PersonagemBuilderTest {

    @Test
    public void deveRetornarExcecaoParaPersonagemIncompleto() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            personagemBuilder.build();
            fail();
        } catch (PersonagemIncompletoException exception) {
            assertEquals("O personagem está incompleto", exception.getMessage());
        }
    }

    @Test
    public void deveRetornarPersonagemComSucesso() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            personagemBuilder
                .adicionaArmadura("Capacete")
                .adicionaArmadura("Peitoral")
                .adicionaArmadura("Luva")
                .build();
        } catch (Exception exception) {
            fail();
        }
    }
}
