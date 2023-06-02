package entities;

import java.util.List;

public class Mesa {
    private Integer numero;
    private List<Comidas> itens;
    private Double conta;
    private String nota;
    public Mesa(){}
    public Mesa(Mesa m){
        this.numero = m.getNumero();
        this.conta = Math.floor(m.getConta());
        this.nota = m.getNota();
    }
    public Mesa(Integer numero) {
        this.numero = numero;
    }

    public List<Comidas> getItens() {
        return itens;
    }

    public void setItens(List<Comidas> itens) {
        this.itens = itens;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
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
        if(conta==null){
            conta = 0.0;
        }
        if(nota==null){
            nota = "nada foi pedido";
        }
        return " ------------\n"+
                "|    Mesa    |\n"+
                "|numero = "+numero+"|\n"+
                "|preço total = R$" + conta +"|\n"+
                "|descrição do pedido|\n" + nota + "\n"+
                " ------------\n";
    }
}
