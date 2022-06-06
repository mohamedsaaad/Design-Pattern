package StructuralDesignPattern.AdapterPattern;

public class SardeenaAdapter implements IEnemey{

    private Sardeena sardeena;
    public SardeenaAdapter(Sardeena sardeena){
        this.sardeena=sardeena;
    }
    @Override
    public void fireCannons() {
        this.sardeena.qasfGabha();
    }

    @Override
    public void refillBanzeen() {
        this.sardeena.ydrab7agareen();
    }
}
