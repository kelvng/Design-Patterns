package factory;

public class Espresso implements Coffee {
    @Override
    public String brew() {
        return "Brewing espresso";
    }
}
