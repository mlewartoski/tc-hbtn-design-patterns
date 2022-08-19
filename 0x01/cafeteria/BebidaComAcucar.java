import java.util.List;

public class BebidaComAcucar extends BebidaDecorator{
    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> ingredientes = this.getBebidaDecorada().obterIngredientes();
        ingredientes.add("acucar");
        return ingredientes;
    }

    @Override
    public double obterPreco() {
        return this.getBebidaDecorada().obterPreco() + 1.9;
    }
}
