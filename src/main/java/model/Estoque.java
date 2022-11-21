package model;

import java.util.List;

public class Estoque {
    private List<Integer> quantidade;

    public Estoque(List<Integer> quantidade) {
        this.quantidade = quantidade;
    }

    public List<Integer> getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(List<Integer> quantidade) {
        this.quantidade = quantidade;
    }
}
