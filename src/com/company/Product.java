package com.company;

public class Product implements Comparable{
    private String productCode;
    private String productName;
    private int stock;

    public Product(String productCode, String productName, int stock) {
        this.productCode = productCode;
        this.productName = productName;
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int stock) {
        this.stock += stock;
    }


    @Override
    public int compareTo(Object o) {
        return this.productName.compareToIgnoreCase(((Product)o).getProductName());
    }

    @Override
    public String toString() {
        return this.productCode + "  " +  this.productName + "   " + this.stock + "\n";
    }
}
