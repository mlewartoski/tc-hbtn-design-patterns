public class ArmaduraDecorator extends NaveEspacialDecorator {

    public ArmaduraDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial);
    }

    @Override
    public int getSaude() {
        return this.naveEspacial.getSaude() + 150;
    }
}
