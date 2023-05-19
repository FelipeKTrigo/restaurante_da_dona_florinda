package entities;

import java.util.List;

public class Mesa {
    private int numero;
    private List<Itens> itens;
    private Double conta;
    private String nota;
    public Mesa(){}

    public Mesa(int numero) {
        this.numero = numero;
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

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Double getConta() {
        return conta;
    }

    public void setConta(Double conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "numero=" + numero +
                ", itens=" + itens +
                ", conta=" + conta +
                ", nota='" + nota + '\'' +
                '}';
    }
}
