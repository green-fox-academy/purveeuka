package com.greenfox.basicwebshop.models;

public class ShopItem implements Comparable<ShopItem>{
    private String name;
    private String description;
    private double price;
    private int quantityOfStock;
    private String type;
    private String currency = "kc";

    public ShopItem(String name, String description, double price, int quantityOfStock, String type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityOfStock() {
        return quantityOfStock;
    }

    public void setQuantityOfStock(int quantityOfStock) {
        this.quantityOfStock = quantityOfStock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setEuro() {
        if (!currency.equals("€")) {
            price /= 25.9;
            currency = "€";
        }
    }

    public void setCZK() {
        if (!currency.equals("Kč")) {
            price *= 25.9;
            currency = "Kč";
        }
    }
    @Override
    public int compareTo(ShopItem item) {
        return Double.compare(this.price, item.price);
    }
}
