public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, TipoPersonagem.GUERREIRO, inteligencia, forca, vigor, resistencia, destreza);
        if (forca < inteligencia || forca < destreza) {
            throw new IllegalArgumentException("Atributos invalidos para GUERREIRO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return (this.forca * 0.8) + (this.vigor * 0.05) + (this.inteligencia * 0.05) + (this.destreza * 0.1);
    }
}
