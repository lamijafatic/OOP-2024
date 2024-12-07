package org.example.lab7;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class SalesReport {

    public void generateReport(List<Sale> sales) {
        System.out.println("Full Sales Report:");
        sales.forEach(System.out::println);
        printStatistics(sales);
    }


    public void generateReport(List<Sale> sales, String productCategory) {
        List<Sale> filteredSales = sales.stream()
                .filter(sale -> sale.getProductCategory().equalsIgnoreCase(productCategory))
                .collect(Collectors.toList());
        System.out.println("\nSales Report for Category: " + productCategory);
        filteredSales.forEach(System.out::println);
        printStatistics(filteredSales);
    }


    public void generateReport(List<Sale> sales, LocalDate startDate, LocalDate endDate) {
        List<Sale> filteredSales = sales.stream()
                .filter(sale -> (sale.getSaleDate().isAfter(startDate) || sale.getSaleDate().isEqual(startDate)) &&
                        (sale.getSaleDate().isBefore(endDate) || sale.getSaleDate().isEqual(endDate)))
                .collect(Collectors.toList());
        System.out.println("\nSales Report from " + startDate + " to " + endDate);
        filteredSales.forEach(System.out::println);
        printStatistics(filteredSales);
    }


    private void printStatistics(List<Sale> sales) {
        if (sales.isEmpty()) {
            System.out.println("No sales data available for the given filters.");
            return;
        }

        double totalRevenue = sales.stream().mapToDouble(Sale::getRevenue).sum();
        double averageRevenue = sales.stream().mapToDouble(Sale::getRevenue).average().orElse(0.0);

        System.out.println("\nStatistics:");
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Average Revenue: $" + averageRevenue);
    }
}
