package org.padroesprojeto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SerieTest {

    @Test
    void deveRetornarPrecoSerieEmSD() {
        Qualidade qualidade = new SD();
        Serie serie = new Serie(5.0f);
        serie.setQualidade(qualidade);
        serie.setNumEpisodios(3);
        assertEquals(15.0f, serie.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoSerieEmHD() {
        Qualidade qualidade = new HD();
        Serie serie = new Serie(5.0f);
        serie.setQualidade(qualidade);
        serie.setNumEpisodios(3);
        assertEquals(16.5f, serie.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoSerieEmUHD4K() {
        Qualidade qualidade = new UHD4K();
        Serie serie = new Serie(5.0f);
        serie.setQualidade(qualidade);
        serie.setNumEpisodios(3);
        assertEquals(19.5f, serie.calcularPreco(), 0.01f);
    }
}