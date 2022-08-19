import java.util.List;

public class BebidaComLeite extends BebidaDecorator{


    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> ingredientes = this.getBebidaDecorada().obterIngredientes();
        ingredientes.add("leite");
        return ingredientes;
    }

    @Override
    public double obterPreco() {
        return this.getBebidaDecorada().obterPreco() + 3.2;
    }
}
