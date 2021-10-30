package delivery;

import flowerstore.Item;

import java.util.ArrayList;

public interface Delivery {
    boolean deliver(ArrayList<Item> items);
}
