public class LegacyAppUI implements AppServer{
    @Override
    public void displayData(XMLData xmlData) {
        System.out.println("Using XML based data! (old)");
    }
}
