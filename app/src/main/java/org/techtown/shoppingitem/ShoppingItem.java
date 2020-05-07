package org.techtown.shoppingitem;

public class ShoppingItem {

    int resId;
    String name, price, explain;

    public ShoppingItem(int resId, String name, String price, String explain) {
        this.resId = resId;
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }
}
