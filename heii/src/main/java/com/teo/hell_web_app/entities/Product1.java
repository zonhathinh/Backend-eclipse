package com.teo.hell_web_app.entities;

public class Product1 {
    private int id;
    private String image;
    private String tensanpham;
    private boolean success; // New field

    public Product1() {
        super();
    }

    public Product1(int id, String image, String tensanpham, boolean success) {
        super();
        this.id = id;
        this.image = image;
        this.tensanpham = tensanpham;
        this.success = success;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
