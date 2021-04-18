package tdtu.dp.pricing;

class MorningMadnessPrice implements Discount {
    @Override
    public double calculate(double amount) {
        return amount * 0.75;
    }
}
