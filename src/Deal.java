import java.util.HashMap;

public class Deal {

    private String sku;
    public HashMap<Integer, Double> dealDetails;

    public Deal(String dealInfo) {
        String[] pieces = dealInfo.split(" ");
        Integer quantity = Integer.parseInt(pieces[0]);
        Double price = Double.parseDouble(pieces[pieces.length - 1]);
        dealDetails.put(quantity, price);
    }

    public Deal(String SKU, HashMap<Integer, Double> details) {
        sku = SKU;
        dealDetails = details;
    }
}