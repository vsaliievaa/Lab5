package delivery;

import flowerstore.Item;

import java.util.ArrayList;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver(ArrayList<Item> items) {
        System.out.println("Successfully delivered " + items.size() + "items by post.");
        return true;
    }
}
