public class ModernUIAdapter implements AppServer{
    private final ModernAppUI modernAppUI;

    public ModernUIAdapter(ModernAppUI modernAppUI) {
        this.modernAppUI = modernAppUI;
    }

    @Override
    public void displayData(XMLData xmlData) {
        JsonData data = convertor(xmlData);
        modernAppUI.displayData(data);
    }

    private JsonData convertor(XMLData xmlData){
        //business logic to convert XMLData To JsonData
        return new JsonData();
    }
}
