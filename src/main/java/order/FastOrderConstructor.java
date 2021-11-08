package order;

public class FastOrderConstructor {
    public static Order fastOrder(OrderTemplates template) {
        return new Order(template);
    }
}
