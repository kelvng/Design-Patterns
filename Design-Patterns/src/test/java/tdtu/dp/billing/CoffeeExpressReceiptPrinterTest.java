package tdtu.dp.billing;

import org.junit.Test;
import tdtu.dp.order.*;
import tdtu.dp.utility.StringUtils;

import static junit.framework.TestCase.assertEquals;

public class CoffeeExpressReceiptPrinterTest {

    @Test
    public void whenPrintingReceipt_itemsPrintedInCorrectOrder () {
        CoffeeOrder coffeeOrder = new CoffeeOrder.CoffeeOrderBuilder()
            .setDiscount((amount) -> { return amount * 1d;})
            .setCustomer(new Customer("John Doe"))
            .setType(CoffeeType.LATTE)
            .setSize(CoffeeSize.LARGE)
            .addCondiment(CoffeeCondiment.CREAM)
            .order();
        ReceiptPrinter receiptPrinter = new CoffeeExpressReceiptPrinter(coffeeOrder);
        String expectedResult = StringUtils.lineBreak(StringUtils.join(
                StringUtils.lineBreakAfter("=== Your Order ==="),
                StringUtils.lineBreakAfter("LARGE LATTE with Cream,"),
                StringUtils.lineBreakAfter("Price: 3.7"),
                StringUtils.lineBreakAfter(""),
                "Thanks For Your Custom"));

        String actualResult = receiptPrinter.print();
        assertEquals(expectedResult, actualResult);
    }

}
