package factory;

public class Latte implements Coffee {
    @Override
    public String brew() {
        return "Brewing latte";
    }
}
