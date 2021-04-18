package tdtu.dp.machine;

import tdtu.dp.order.CoffeeOrder;

public interface CoffeeMachine extends Runnable, MachineObservable {
    boolean available ();
    void start (CoffeeOrder coffeeOrder);
    String getName();
    String getLocation();
}
