package gifts;

public class Perfume extends Gifts {
    private String Volume;
    private String PerfumeFlavor;

    public Perfume (String Volume, String PerfumeFlavor, double price, String giftTopic) {
        this.Volume = Volume;
        this.PerfumeFlavor = PerfumeFlavor;
        this.price = price;
        this.giftTopic = giftTopic;
    }

    public String getVolume() {
        return Volume;
    }

    public void setPerfumeFlavor(String PerfumeFlavor) {
        this.PerfumeFlavor = PerfumeFlavor;
    }

    public String getPerfumeFlavor() {
        return PerfumeFlavor;
    }

    public void getInfo() {
        System.out.printf("Данные о парфюме: объем - %s, аромат - %s, стоимость - %f, тема подарка - %s \n", Volume,
                PerfumeFlavor, price, giftTopic);
    }
}