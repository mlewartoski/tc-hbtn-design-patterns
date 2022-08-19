import java.util.HashSet;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa;
    private HashSet<ItemPedido> itensForaCaixa;

    public Pedido() {
        this.itensDentroCaixa = new HashSet<>();
        this.itensForaCaixa = new HashSet<>();
    }

    public void adicionarItemDentroCaixa(ItemPedido item){
        itensDentroCaixa.add(item);
    }

    public  void adicionarItemForaCaixa(ItemPedido item){
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        return "\tFora da Caixa:\n" +
                itensForaCaixa.stream().map(itemPedido -> "\t\t- " + itemPedido.getTipo() + " " + itemPedido.getNome() + "\n").reduce("", String::concat) +
                "\tDentro da Caixa:\n" +
                itensDentroCaixa.stream().map(itemPedido -> "\t\t- " + itemPedido.getTipo() + " " + itemPedido.getNome() + "\n").reduce("", String::concat);
    }
}
