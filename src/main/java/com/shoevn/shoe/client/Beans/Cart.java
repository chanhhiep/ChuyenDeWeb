package com.shoevn.shoe.Beans;

import java.util.ArrayList;
import java.util.List;

public class Cart {
//    private List<CartItem> items = new ArrayList<>();
//    public List<CartItem> getItems() {
//        return items;
//    }
//    public void setItems(List<CartItem> items) {
//        this.items = items;
//    }
//    public CartItem getItemByProductId(Long productId) {
//        for (CartItem item : items) {
//            if (item.getProduct().getId() == (productId)) {
//                return item;
//            }
//        }
//        return null;
//    }
//    public CartItem getItemByProductIdAndSize(Long productId, String size) {
//        for (CartItem item : items) {
//            if (item.getProduct().getId() == (productId) && item.getSize().equals(size)) {
//                return item;
//            }
//        }
//        return null;
//    }
    private Product product;
    private int quantity;
    private Size size;

    public  Cart(){}
    public Cart(Product product, int quantity, Size size) {
        this.product = product;
        this.quantity = quantity;
        this.size = size;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
