public class FancyUIServiceAdapter implements IMultiRestoApp{
    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter() {
        fancyUIService = new FancyUIService();
    }

    @Override
    public void displayMenus(XmlData xmlData) {
        JsonData jsonData = convertXMLToJson(xmlData);
        this.fancyUIService.displayMenus(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData = convertXMLToJson(xmlData);
        this.fancyUIService.displayRecommendations(jsonData);
    }


    private JsonData convertXMLToJson(XmlData xmlData) {
        return new JsonData();
    }
}
