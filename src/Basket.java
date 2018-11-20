import java.util.HashMap;

public class Basket {

    private HashMap<Item, Integer> items;
    private HashMap<Item, Double> itemsAndTotals;
    private Double total = 0.0;

    public Basket() {
    }

    public void addToBasket(Item item) {
        if(items.containsKey(item))
            items.put(item, items.get(item) + 1);
        else
            items.put(item, 1);
        Double currentTotal = checkDeal(item);
        itemsAndTotals.put(item, currentTotal);
    }

    public Double checkDeal(Item item) {
        if(item.deal != null) {
            int quantity = items.get(item);
            int dealQuantity = item.deal.dealDetails.keySet().iterator().next();
            if(quantity >= dealQuantity) {
                if(quantity == dealQuantity)
                    return item.deal.dealDetails.values().iterator().next();
                else {
                    if(quantity % dealQuantity == 0) {
                        return (quantity/dealQuantity * item.deal.dealDetails.values().iterator().next());
                    } else {
                        int evenDivider = quantity/dealQuantity;
                        int remainder = quantity%dealQuantity;
                        return ((evenDivider * item.deal.dealDetails.values().iterator().next()) + (remainder * item.price));
                    }
                }
            } else {
                return item.price;
            }
        }
        return item.price;
    }

    public Double getTotal() {
        for(Double d : itemsAndTotals.values()) {
            total += d;
        }
        return total;
    }
}
