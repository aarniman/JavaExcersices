package model;


public class CurrencyConverter {
    private String name;
    private double rate;

    public CurrencyConverter(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }



}
