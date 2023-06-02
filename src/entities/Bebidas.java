package entities;

public class Bebidas extends Comidas {
    //se é refri ou não(se for false é suco, se for true é refri ou drink)
    private Boolean pronta;

    public Bebidas() {}

    public Bebidas(String nome, String descricao, Integer quantidade, Double preco, Boolean pronta) {
        super(nome, descricao, quantidade, preco);
        this.pronta = pronta;
    }
    public Boolean getPronta() {
        return pronta;
    }

    public void setPronta(Boolean pronta) {
        this.pronta = pronta;
    }

    @Override
    public String toString() {
        return"nome='" + super.getNome() + '\'' +
                ", descricao='" + super.getDescricao()+ '\'' +
                ", quantidade=" + super.getQuantidade()+ '\'' +
                ", preco=" + super.getPreco()+ '\'' +
                "pronta=" + pronta;
    }
}
