package tdtu.dp.pricing;

public class RegularPrice implements Discount {

    @Override
    public double calculate(double amount) {
        return amount;
    }

}
