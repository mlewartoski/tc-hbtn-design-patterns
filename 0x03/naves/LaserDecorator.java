public class LaserDecorator extends NaveEspacialDecorator{
    public LaserDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial);
    }

    @Override
    public int getAtaque() {
        return this.naveDecorada.getAtaque() + 40;
    }
}
