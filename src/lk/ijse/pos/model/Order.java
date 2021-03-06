package lk.ijse.pos.model;

import java.util.ArrayList;

public class Order {
    private String orderId;
    private String orderDate;
    private String customerId;
    private double totalCost;
    private ArrayList<ItemDetails> items;

    public Order(String orderId, String orderDate, String customerId, double totalCost, ArrayList<ItemDetails> items) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customerId = customerId;
        this.totalCost = totalCost;
        this.items = items;
    }

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public ArrayList<ItemDetails> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemDetails> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", customerId='" + customerId + '\'' +
                ", totalCost=" + totalCost +
                ", items=" + items +
                '}';
    }
}
