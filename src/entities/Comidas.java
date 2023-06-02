package entities;

public class Comidas extends Itens{
    private Integer quantidade;
    private Double preco;

    public Comidas(){}

    public Comidas(String nome, String descricao, Integer quantidade, Double preco) {
        super(nome, descricao);
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "nome='" + super.getNome() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco;
    }
}
