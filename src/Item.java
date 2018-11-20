public class Item {

    public String sku;
    public Double price;
    public Deal deal;

    public Item(String SKU, Double pricePerUnit) {
        sku = SKU;
        price = pricePerUnit;
    }

    public Item(String SKU, Double pricePerUnit, Deal itemDeal) {
        sku = SKU;
        price = pricePerUnit;
        deal = itemDeal;
    }

    public Item(String SKU, Double pricePerUnit, String dealDescription) {
        sku = SKU;
        price = pricePerUnit;
        deal = new Deal(dealDescription);
    }
}
