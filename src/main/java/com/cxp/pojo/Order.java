package com.cxp.pojo;

public class Order {
    private int id;
    private String no;
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Order [id=" + id + ", no=" + no + ", name=" + name + ", price=" + price + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Order() {
    }

    public Order(int id, String no, String name, double price) {
        super();
        this.id = id;
        this.no = no;
        this.name = name;
        this.price = price;
    }
}
