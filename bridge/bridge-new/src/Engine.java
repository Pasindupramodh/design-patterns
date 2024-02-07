public abstract class Engine {
    protected String type;
    protected int speed;

    public abstract void assemble();

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
