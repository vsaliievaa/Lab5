package delivery;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    private Item firstItem;
    private Item secondItem;
    private Flower flowerOne;
    private Flower flowerTwo;
    private ArrayList<Item> items;

    @BeforeEach
    void setUp() {
        items = new ArrayList<>();
        flowerOne = new Flower(FlowerType.ROSE);
        flowerTwo = new Flower(FlowerType.CHAMOMILE);
        firstItem = flowerOne;
        secondItem = flowerTwo;
        items.add(firstItem);
        items.add(secondItem);
    }

    @Test
    void deliver() {
        DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();
        assertTrue(dhl.deliver(items));
    }
}