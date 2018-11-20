public class Checkout {

    private Basket basket;

    public void New(Object ruleset) {
        // SOMETHING TO IMPORT THE RULES
        // UNKNOWN LAYOUT/TYPE OF RULES
    }

    public void scanItem(Item item) {
        basket.addToBasket(item);
    }

    public Double getTotal() {
        return basket.getTotal();
    }
}
