package org.padroesprojeto;

public class Serie extends Conteudo {

    private int numEpisodios;

    public Serie(float precoBase) {
        super(precoBase);
    }

    public void setNumEpisodios(int numEpisodios) {
        this.numEpisodios = numEpisodios;
    }

    public float calcularPreco() {
        return this.precoBase * this.numEpisodios * (1 + this.qualidade.percentualAumento());
    }
}
