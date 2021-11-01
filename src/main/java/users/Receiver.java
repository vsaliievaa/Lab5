package users;

import lombok.Setter;

public class Receiver implements User {
    @Setter
    private int id;

    @Override
    public void update(String status) {
        System.out.println(status + "for order number " + id + ".");
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

}
