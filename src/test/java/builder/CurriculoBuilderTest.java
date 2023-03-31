package builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class CurriculoBuilderTest {

    @Test
    public void deveRetornarExcecaoParaCurriculoSemNome() {
        try {
            CurriculoBuilder curriculoBuilder = new CurriculoBuilder();
            Curriculo curriculo = curriculoBuilder
                    .setCargo("Engenheiro de Software")
                    .setEmail("eu.mesmo@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoParaCurriculoSemCargo() {
        try {
            CurriculoBuilder curriculoBuilder = new CurriculoBuilder();
            Curriculo curriculo = curriculoBuilder
                    .setNome("Alison Israel")
                    .setEmail("eu.mesmo@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cargo desejado é obrigatório", e.getMessage());
        }
    }

    @Test
    public void deveRetornarCurriculoValido() {
        CurriculoBuilder curriculoBuilder = new CurriculoBuilder();
        Curriculo curriculo = curriculoBuilder
                .setNome("Alison Israel")
                .setCargo("Engenheiro de Software")
                .setEmail("eu.mesmo@email.com")
                .setExperiencia("Muitas")
                .setFormacaoAcademica("Ensino médio completo")
                .setHabilidades("Todas exigidas")
                .setObjetivoCarreira("Trabalhar")
                .build();

        assertNotNull(curriculo);
    }
}