import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.FlowerPack;
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

//        color = new int[]{0, 127, 0};
        Flower flower = new Flower(FlowerType.ROSE);
//        System.out.println(flower.toString());
        FlowerPack pack = new FlowerPack(flower, 10);
        System.out.println(pack.getFlower());
        Flower newFlower = new Flower(FlowerType.TULIP);
        pack.setFlower(newFlower);
        System.out.println(pack.getFlower());

    }


}
