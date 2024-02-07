public class Initialize {
    public static void main(String[] args) {
        LegacyAppUI legacyAppUI = new LegacyAppUI();
        legacyAppUI.displayData(new XMLData());

        AppServer modernUi = new ModernUIAdapter(new ModernAppUI());
        modernUi.displayData(new XMLData());
    }
}
