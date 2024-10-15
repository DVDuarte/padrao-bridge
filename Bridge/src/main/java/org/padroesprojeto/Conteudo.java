package org.padroesprojeto;

public abstract class Conteudo {
    protected Qualidade qualidade;
    protected float precoBase;

    public Conteudo(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setQualidade(Qualidade qualidade) {
        this.qualidade = qualidade;
    }

    public abstract float calcularPreco();
}
