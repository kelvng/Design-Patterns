package abk;

public class MexicanFoodFactory extends AbstractFoodFactory {
    @Override
    public AbstractFood placeOrder(String itemName, int quantity) {
        return new MexicanFood();
    }
}
