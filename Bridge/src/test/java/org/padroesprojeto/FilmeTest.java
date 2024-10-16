package org.padroesprojeto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {

    @Test
    void deveRetornarPrecoFilmeEmSD() {
        Qualidade qualidade = new SD();
        Filme filme = new Filme(10.0f);
        filme.setQualidade(qualidade);
        assertEquals(10.0f, filme.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoFilmeEmHD() {
        Qualidade qualidade = new HD();
        Filme filme = new Filme(10.0f);
        filme.setQualidade(qualidade);
        assertEquals(11.0f, filme.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoFilmeEmUHD4K() {
        Qualidade qualidade = new UHD4K();
        Filme filme = new Filme(10.0f);
        filme.setQualidade(qualidade);
        assertEquals(13.0f, filme.calcularPreco(), 0.01f);
    }
}