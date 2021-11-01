package order;

import lombok.Setter;
import payment.Payment;
import delivery.Delivery;
import flowerstore.Item;
import users.User;

import java.util.List;

public class Order {
    @Setter
    private Payment payment;
    @Setter
    private Delivery delivery;
    private List<User> users;
    private static int counter = 0;

    public void addUser(User user) {
        counter++;
        user.setId(counter);
        this.users.add(user);
    }

    public void removeUser(User user) {
        counter--;
        this.users.remove(user);
    }

    public void notifyUsers() {
        for (User user : users) {
            user.update("Status update.");
        }
    }
}
