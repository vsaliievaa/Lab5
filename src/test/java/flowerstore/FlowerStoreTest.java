package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FlowerStoreTest {
    private Flower flower;
    private FlowerPack pack;
    private FlowerBucket bucketOne;
    private FlowerBucket bucketTwo;
    private FlowerStore store;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        pack = new FlowerPack(flower, 5);
        bucketOne = new FlowerBucket();
        bucketTwo = new FlowerBucket();
        bucketOne.addFlowerPack(pack);
        bucketOne.addFlowerPack(pack);
        bucketTwo.addFlowerPack(pack);
        store = new FlowerStore();
        store.addFlowerBucket(bucketOne);
    }

    @Test
    void addFlowerBucket() {
        assertEquals(1, store.getFlowerBuckets().size());
    }

    @Test
    void getFlowerBuckets() {
        store.addFlowerBucket(bucketTwo);
        assertEquals(2, store.getFlowerBuckets().size());
    }
}