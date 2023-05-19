package entities;

import java.util.List;

public class Mesa {
    private int numero;
    private List<Itens> itens;
    public Mesa(){}

    public Mesa(int numero, List<Itens> itens) {
        this.numero = numero;
        this.itens = itens;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
