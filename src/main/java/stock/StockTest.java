package stock;

import java.util.Scanner;

public class StockTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter previous closing price: ");
        double previousClosingPrice = scanner.nextDouble();
        System.out.println("Enter current price: ");
        double currentPrice = scanner.nextDouble();

        Stock stock = new Stock(previousClosingPrice, currentPrice);

        System.out.println("Stock: " + stock.display());
        System.out.println("Change Percent: " + stock.getChangePercent());
    }

}
