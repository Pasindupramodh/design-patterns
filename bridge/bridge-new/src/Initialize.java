public class Initialize {
    public static void main(String[] args) {
        USAWorkShop usaWorkShop = new USAWorkShop(new BMW());
        usaWorkShop.process();

        JapanWorkShop japanWorkShop = new JapanWorkShop(new Audi());
        japanWorkShop.process();
    }
}
