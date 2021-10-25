package flowerstore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower chamomile;
    private Flower tulip;
    private Flower rose;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        chamomile= new Flower(FlowerType.CHAMOMILE);
        chamomile.setSepalLength(15);

        tulip = new Flower(FlowerType.TULIP);
        int[] color = {212, 170, 198};
        tulip.setColor(color);

        rose = new Flower(FlowerType.ROSE);
        chamomile.setPrice(30);


    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(30, chamomile.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        assertEquals(212, tulip.getColor()[0]);
    }


    @Test
    void setColor() {
        assertEquals(198, tulip.getColor()[2]);
    }

    @Test
    void testToString() {
        assertEquals("Flower(color=[0, 0, 0], sepalLength=0.0, price=0.0, flowerType=ROSE)", rose.toString());
    }

    @Test
    void getSepalLength() {
        assertEquals(15, chamomile.getSepalLength());
    }

    @Test
    void setSepalLength() {
        rose.setSepalLength(40);
        assertEquals(40, rose.getSepalLength());
    }

    @Test
    void setPrice() {
        rose.setPrice(77.5);
        assertEquals(77.5, rose.getPrice());
    }
}