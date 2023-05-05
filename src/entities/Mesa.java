package entities;

public class Mesa {
    private int numero;
    private String statusMesa;

    public Mesa() {
    }

    public Mesa(int numero, String statusMesa) {
        this.numero = numero;
        this.statusMesa = statusMesa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getStatusMesa() {
        return statusMesa;
    }

    public void setStatusMesa(String statusMesa) {
        this.statusMesa = statusMesa;
    }
}
