package delivery;

import flowerstore.Item;

import java.util.ArrayList;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(ArrayList<Item> items) {
        System.out.println("Successfully delivered " + items.size() + "items. Thanks for choosing DHL!");
        return true;
    }
}
