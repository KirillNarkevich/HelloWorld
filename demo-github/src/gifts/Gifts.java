package gifts;

import java.util.Scanner;

public class Gifts {
    protected double price;
    protected String giftTopic;

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = new Scanner(System.in).nextInt();
    }

    public String getGiftTopic() {
        return giftTopic;
    }

    public void setGiftTopic (){
        this.giftTopic = new Scanner(System.in).nextLine();
    }
}
