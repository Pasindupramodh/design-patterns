public class USAWorkShop extends WorkShop{
    public USAWorkShop(Engine engine) {
        super(engine);
    }

    @Override
    void setType() {
        engine.setType("Type Usa");
    }

    @Override
    void setSpeed() {
        engine.setSpeed(250);
    }
}
