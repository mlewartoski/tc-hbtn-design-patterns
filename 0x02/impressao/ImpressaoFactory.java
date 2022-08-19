public class ImpressaoFactory {
    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int paginasTotal, int paginasColoridas, boolean frenteVerso){
        return new Impressao(tamanhoImpressao, paginasTotal, paginasColoridas, frenteVerso);
    }

}
