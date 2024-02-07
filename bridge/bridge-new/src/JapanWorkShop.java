public class JapanWorkShop extends WorkShop{
    public JapanWorkShop(Engine engine) {
        super(engine);
    }

    @Override
    void setType() {
        engine.setType("Type Japan");
    }

    @Override
    void setSpeed() {
        engine.setSpeed(300);
    }
}
