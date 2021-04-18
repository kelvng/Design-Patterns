package tdtu.dp.order;

public interface OrderObservable {

    void addObserver(CoffeeOrder order, OrderObserver observer);

    void removeObserver (CoffeeOrder order, OrderObserver observer);

}