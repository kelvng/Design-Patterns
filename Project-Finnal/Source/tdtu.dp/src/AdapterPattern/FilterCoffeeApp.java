package AdapterPattern;

public class FilterCoffeeApp {
    private Logger log = Logger.getLogger(
        FilterCoffeeApp.class.getSimpleName());

    private FilterCoffeeMachine coffeeMachine;

    public FilterCoffeeApp(FilterCoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public Coffee prepareCoffee() {
        Coffee coffee = this.coffeeMachine.brewCoffee();
        log.info("Coffee is ready!");
        log.info(" -> " + coffee);
        return coffee;
    }
}