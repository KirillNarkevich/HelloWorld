package gifts.cake;

import gifts.Gifts;

public class Cake extends Gifts {
    private final Packing packing;
    private final Topping topping;

    public Cake (double price, String giftTopic, Packing packing, Topping topping) {
        this.price = price;
        this.giftTopic = giftTopic;
        this.packing = packing;
        this.topping = topping;
    }

    public Packing getPacking() {
        return packing;
    }

    public Topping getTopping() {
        return topping;
    }
}
