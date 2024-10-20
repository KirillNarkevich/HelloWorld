package gifts;

public class BearToy extends Gifts{
    private final String bearSize;
    private final boolean forGirls;

    public BearToy (String bearSize, boolean forGirls, double price, String giftTopic) {
        this.bearSize = bearSize;
        this.forGirls = forGirls;
        this.price = price;
        this.giftTopic = giftTopic;
    }

    public String bearSize() {
        return bearSize;
    }

    public boolean forGirls() {
        return forGirls;
    }
}