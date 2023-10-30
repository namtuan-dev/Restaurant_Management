
package com.hcr.swd392g3.project.entity;

import javax.annotation.sql.DataSourceDefinition;

public class CartItem {
    private Menu product;
    private int quantity;
    private double price;

    public CartItem() {
    }

    public CartItem(Menu product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Menu getMenu() {
        return product;
    }

    public void setMenu(Menu product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}