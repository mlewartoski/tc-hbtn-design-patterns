public class Ladrao extends Personagem {
    public Ladrao(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, TipoPersonagem.LADRAO, inteligencia, forca, vigor, resistencia, destreza);
        if (destreza < inteligencia || destreza < forca) {
            throw new IllegalArgumentException("Atributos invalidos para LADRAO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return (this.forca * 0.5) + (this.destreza * 0.35) + (this.vigor * 0.1) + (this.inteligencia * 0.05);
    }
}
