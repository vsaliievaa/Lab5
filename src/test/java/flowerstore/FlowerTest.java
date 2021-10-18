package flowerstore;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(30);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(30, flower.getPrice());
    }
}