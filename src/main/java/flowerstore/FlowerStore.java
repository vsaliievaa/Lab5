package flowerstore;

import lombok.Getter;

import java.util.ArrayList;

public class FlowerStore {
    @Getter
    private ArrayList<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void addFlowerBucket(FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }

    private boolean search(FlowerBucket bucketToSearch) {
        return flowerBuckets.contains(bucketToSearch);
    }
}
