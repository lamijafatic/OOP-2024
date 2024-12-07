package org.example.lab7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class task4 {

    public static void main(String[] args) {

        List<Sale> sales = new ArrayList<>();
        sales.add(new Sale("Electronics", 1500.0, LocalDate.of(2023, 11, 15)));
        sales.add(new Sale("Clothing", 500.0, LocalDate.of(2023, 12, 1)));
        sales.add(new Sale("Electronics", 2000.0, LocalDate.of(2023, 10, 5)));
        sales.add(new Sale("Groceries", 300.0, LocalDate.of(2023, 12, 7)));
        sales.add(new Sale("Clothing", 800.0, LocalDate.of(2023, 9, 25)));
        SalesReport salesReport = new SalesReport();


        salesReport.generateReport(sales);
        salesReport.generateReport(sales, "Electronics");
        salesReport.generateReport(sales, LocalDate.of(2023, 10, 1), LocalDate.of(2023, 12, 1));
    }

}
