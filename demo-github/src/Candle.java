public class Candle {
    String color;
    String size;
    private String flavor;
    double price;

    // Конструктор
    public Candle(String color, String size, String flavor, double price) {
        this.color = color;
        this.size = size;
        this.flavor = flavor;
        this.price = price;
    }


    public void showInfoAboutCandle() {
        System.out.printf("Candle color: %s\nCandle size: %s\nCandle flavor: %s\nCandle price: %s\n", color, size, flavor, price);
    }

     public void addToCart(int quantity) {
        System.out.printf("Added %d %s candles to cart\n", quantity, color);
    }

    public  void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

}
