import java.util.ArrayList;
import java.util.List;

public class Pedido implements Calculavel, Imprimivel {
    private Cliente cliente;
    private Vendedor vendedor;
    private List<ItemPedido> itens;

    public Pedido(Cliente cliente, Vendedor vendedor) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new ItemPedido(produto, quantidade));
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    @Override
    public void imprimirResumo() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Vendedor: " + vendedor);
        for (ItemPedido item : itens) {
            System.out.println("  " + item);
        }
        System.out.println("Total: R$ " + calcularTotal());
    }
}