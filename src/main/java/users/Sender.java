package users;

import lombok.Setter;

public class Sender implements User {
    @Setter
    private int id;

    @Override
    public void update(String status) {
        System.out.println(status + ": order number " + id + "have been successfully updated.");
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

}
