public class Impressao {

    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public Impressao(TamanhoImpressao tamanhoImpressao, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso) {
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;

        if (tamanhoImpressao == TamanhoImpressao.A2) {
            this.valorColoridasFrenteVerso = 0.28;
            this.valorPretoBrancoFrenteVerso = 0.18;
            this.valorColoridasFrenteApenas = 0.32;
            this.valorPretoBrancoFrenteApenas = 0.22;
        }

        if (tamanhoImpressao == TamanhoImpressao.A3) {
            this.valorColoridasFrenteVerso = 0.25;
            this.valorPretoBrancoFrenteVerso = 0.15;
            this.valorColoridasFrenteApenas = 0.30;
            this.valorPretoBrancoFrenteApenas = 0.20;
        }

        if (tamanhoImpressao == TamanhoImpressao.A4) {
            this.valorColoridasFrenteVerso = 0.20;
            this.valorPretoBrancoFrenteVerso = 0.10;
            this.valorColoridasFrenteApenas = 0.25;
            this.valorPretoBrancoFrenteApenas = 0.15;
        }
    }

    public double calcularTotal(){
        return paginasColoridas * (ehFrenteVerso?valorColoridasFrenteVerso:valorColoridasFrenteApenas) +
                (paginasTotais-paginasColoridas) * (ehFrenteVerso?valorPretoBrancoFrenteVerso:valorPretoBrancoFrenteApenas);
    }

    @Override
    public String toString() {
        return  String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
                    paginasTotais, paginasColoridas, paginasTotais-paginasColoridas,
                    ehFrenteVerso?"frente e verso":"frente apenas",
                    calcularTotal());
    }

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public void setValorColoridasFrenteVerso(double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public void setValorColoridasFrenteApenas(double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }

    public void setValorPretoBrancoFrenteApenas(double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }
}
