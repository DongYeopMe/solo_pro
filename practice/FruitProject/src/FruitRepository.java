import Fruit.Fruit;

import java.util.ArrayList;

public class FruitRepository {
    ArrayList <Fruit> cart = new ArrayList<Fruit>();

    private void add(Fruit fruit){
        cart.add(fruit);
    }
    private void delete(int num){
        cart.remove(num);
    }

}
