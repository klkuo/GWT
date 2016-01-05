package com.google.gwt.sample.stockwatcher.client;

public class StockPrice {
    private String symbol;
    private double price;
    private double change;

    public StockPrice() {
    }

    public StockPrice(String symbol, double price, double change) {
        this.symbol = symbol;
        this.price = price;
        this.change = change;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getPrice() {
        return this.price;
    }

    public String getChange() {
        return this.change;
    }

    public double getChangePercent() {
        return 10.0 * this.change / this.price;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setChange(double change) {
        this.change = change;
    }
}
