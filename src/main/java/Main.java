import flowerstore.Flower;
import flowerstore.FlowerType;

public class Main {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];
        int[] color = {127, 0, 0};
        for (int i=0; i<flowers.length; i++) {
            flowers[i] = new Flower(FlowerType.CHAMOMILE);
            flowers[i].setColor(color);
        }

        for (Flower flower: flowers) {
            System.out.println(flower);
        }

        color = new int[]{0, 127, 0};
    }


}
