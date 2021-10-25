package flowerstore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerBucket bucket;
    private FlowerPack roses;
    private FlowerPack tulips;
    private Flower rose;
    private Flower tulip;
    private int amountRoses;
    private int amountTulips;

    @org.junit.jupiter.api.BeforeEach
    void beforeEach() {
        rose = new Flower(FlowerType.ROSE);
        tulip = new Flower(FlowerType.TULIP);
        rose.setPrice(45);
        tulip.setPrice(30);
        amountRoses = 7;
        amountTulips = 10;
        roses = new FlowerPack(rose, amountRoses);
        tulips = new FlowerPack(tulip, amountTulips);
        bucket = new FlowerBucket();
        bucket.addFlowerPack(roses);
        bucket.addFlowerPack(tulips);

    }

    @Test
    void getFlowerPack() {
        assertEquals(2, bucket.getFlowerPacks().size());
    }

    @Test
    void addFlowerPack() {
        Flower flower = new Flower(FlowerType.CHAMOMILE);
        FlowerPack newPack = new FlowerPack(flower, 2);
        bucket.addFlowerPack(newPack);
        assertEquals(3, bucket.getFlowerPacks().size());

    }

    @Test
    void getPrice() {
        assertEquals(615, bucket.getPrice());
    }

}