package decorators;

import flowerstore.Flower;
import flowerstore.Item;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorsTest {
    private Flower flower;


    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(50);
    }

    @org.junit.jupiter.api.Test
    void getPriceInBasket() {
        Item inBasket = new BasketDecorator(flower);
        assertEquals(54, inBasket.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getPriceWithRibbon() {
        Item withRibbon = new RibbonDecorator(flower);
        assertEquals(90, withRibbon.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getPriceInPaper() {
        Item inPaper = new PaperDecorator(flower);
        assertEquals(63, inPaper.getPrice());
    }
}