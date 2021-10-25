package flowerstore;

import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

import java.util.Arrays;

@ToString
public class Flower extends Item {
    @Getter
    private int[] color = new int[3];
    @Getter @Setter
    private double sepalLength;
    @Getter @Setter
    private double price;

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    private FlowerType flowerType;

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

    @Override
    public String getDescription() {
        return "Flower of type" + flowerType;
    }
}
