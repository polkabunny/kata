public class Main {

    public static void main(String[] args) {

        Checkout co = new Checkout();

        Item a = new Item("A", 50.00, "3 for 30");
        Item b = new Item("A", 30.00, "2 for 45");
        Item c = new Item("C", 20.00);
        Item d = new Item("D", 15.00);

        co.scanItem(a);
        co.scanItem(c);

        co.getTotal();
    }
}
