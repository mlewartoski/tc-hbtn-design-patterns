public class MagoBuilder implements Builder {
    private String nome;
    private TipoPersonagem tipo;
    private int inteligencia;
    private int forca;
    private int vigor;
    private int resistencia;
    private int destreza;

    public Mago build(){
        return new Mago(this.nome, this.inteligencia, this.forca, this.vigor, this.resistencia, this.destreza);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public TipoPersonagem getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(TipoPersonagem tipo) {
        this.tipo = tipo;
    }

    @Override
    public int getInteligencia() {
        return this.inteligencia;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public int getForca() {
        return forca;
    }

    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public int getVigor() {
        return vigor;
    }

    @Override
    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    @Override
    public int getResistencia() {
        return resistencia;
    }

    @Override
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public int getDestreza() {
        return destreza;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
}
