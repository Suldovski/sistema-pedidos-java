public class Vendedor extends Pessoa {
    private double comissao;

    public Vendedor(String nome, String cpf, double comissao) {
        super(nome, cpf);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public String toString() {
        return super.toString() + " - Comissão: " + comissao;
    }
}

