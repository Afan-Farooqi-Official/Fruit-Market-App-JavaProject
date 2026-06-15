package sample.demo;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Fruit> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Fruit fruit) {
        items.add(fruit);
    }

    public double getTotal() {
        double total = 0;
        for (Fruit item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public String getReceipt() {
        StringBuilder receipt = new StringBuilder();
        for (Fruit item : items) {
            receipt.append(item.getName()).append(": $").append(String.format("%.2f", item.getPrice())).append("\n");
        }
        receipt.append("Total: $").append(String.format("%.2f", getTotal()));
        return receipt.toString();
    }
}
