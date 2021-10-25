package flowerstore;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack {
    private Flower flower;
    private int amount;

    public double getPrice() {
        return flower.getPrice() * amount;
    }

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }
}
