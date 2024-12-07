package org.example.lab7;
import java.time.LocalDate;

public class Sale {
    private String productCategory;
    private double revenue;
    private LocalDate saleDate;

    public Sale(String productCategory, double revenue, LocalDate saleDate) {
        this.productCategory = productCategory;
        this.revenue = revenue;
        this.saleDate = saleDate;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public double getRevenue() {
        return revenue;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "productCategory='" + productCategory + '\'' +
                ", revenue=" + revenue +
                ", saleDate=" + saleDate +
                '}';
    }
}
