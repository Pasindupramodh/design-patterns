public abstract class WorkShop {
    protected Engine engine;

    public WorkShop(Engine engine) {
        this.engine = engine;
    }
    abstract void setType();
    abstract void setSpeed();
    public void process(){
        System.out.println("Processing........");
        setType();
        setSpeed();
        engine.assemble();
    }
}
