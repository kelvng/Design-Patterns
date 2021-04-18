package tdtu.dp.billing;

import tdtu.dp.order.CoffeeOrder;

import static tdtu.dp.utility.StringUtils.lineBreak;

public class CoffeeExpressReceiptPrinter extends ReceiptPrinter {

    private CoffeeOrder coffeeOrder;

    private CoffeeExpressReceiptPrinter () {}

    public CoffeeExpressReceiptPrinter (CoffeeOrder coffeeOrder) {
        this.coffeeOrder = coffeeOrder;
    }

    @Override
    protected String printOrder () {
        return lineBreak(coffeeOrder.getCoffeeSize() + " " + coffeeOrder.getCoffeeType() + " with " +
                coffeeOrder.getCondiments().stream().map(condiment -> condiment.getDisplayName() + ",").reduce("", String::concat));
    }

    protected String printPrice () {
        return lineBreak("Price: " + coffeeOrder.getPrice());
    }

}
