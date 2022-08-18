public abstract class Personagem {
    protected String nome;
    protected TipoPersonagem tipo;
    protected int inteligencia;
    protected int forca;
    protected int vigor;
    protected int resistencia;
    protected int destreza;

    public Personagem(String nome, TipoPersonagem tipo, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        this.nome = nome;
        this.tipo = tipo;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.vigor = vigor;
        this.resistencia = resistencia;
        this.destreza = destreza;
    }

    public abstract double getDanoAtaque();

    @Override
    public String toString() {
        return "Personagem { " +
                "nome = " + nome +
                ", tipo = " + tipo +
                ", inteligencia = " + inteligencia +
                ", forca = " + forca +
                ", vigor = " + vigor +
                ", resistencia = " + resistencia +
                ", destreza = " + destreza +
                String.format(", dano ataque = %.2f", getDanoAtaque()) +
                " }";
    }

//    Sobrescrever toString para retornar Personagem { nome = <valor nome>, tipo = <valor tipo>, inteligencia = <valor inteligencia>, forca = <valor forca>, vigor = <valor vigor>, resistencia = <valor resistencia>, destreza = <valor destreza>, dano ataque = <dano ataque> }, dano de ataque apresente apenas com 2 casas decimais.
}
