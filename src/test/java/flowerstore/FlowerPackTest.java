package flowerstore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack pack;
    private int amount;
    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(50);
        amount = 10;
        pack = new FlowerPack(flower, amount);

    }

    @Test
    void getPrice() {
        assertEquals(500, pack.getPrice());
    }

    @Test
    void getFlower() {
        assertEquals(flower, pack.getFlower());
    }

    @Test
    void getAmount() {
        assertEquals(10, pack.getAmount());
    }

    @Test
    void setFlower() {
        Flower newFlower = new Flower(FlowerType.TULIP);
        pack.setFlower(newFlower);
        assertEquals(newFlower, pack.getFlower());

    }

    @Test
    void setAmount() {
        int newAmount = 5;
        pack.setAmount(newAmount);
        assertEquals(5, pack.getAmount());
    }
}