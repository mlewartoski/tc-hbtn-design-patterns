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
        String toString =
                "Fora da caixa:\n" +
                itensForaCaixa.stream().map(ItemPedido::toString).reduce("", String::concat) +
                "Dentro da caixa:\n" +
                itensDentroCaixa.stream().map(ItemPedido::toString).reduce("", String::concat);
        return toString;
    }
}
