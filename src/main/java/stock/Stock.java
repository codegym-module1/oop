package stock;

public class Stock {
    String symbol = "ORCL";
    String name = "Oracle Corporation";
    double previousClosingPrice;
    double currentPrice;

    public Stock(double previousClosingPrice, double currentPrice) {
    }

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }

    public String display() {
        return "Symbol " + symbol + ", name " + name;
    }
}
