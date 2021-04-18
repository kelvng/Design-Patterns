package tdtu.dp.order;

public interface OrderService extends OrderObservable {
    void addOrder(CoffeeOrder order);
}
