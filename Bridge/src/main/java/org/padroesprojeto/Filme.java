package org.padroesprojeto;

public class Filme extends Conteudo {

    public Filme(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase * (1 + this.qualidade.percentualAumento());
    }
}