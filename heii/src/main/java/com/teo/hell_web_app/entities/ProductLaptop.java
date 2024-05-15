package com.teo.hell_web_app.entities;

public class ProductLaptop {
	private int id;
    private String image;
    private String tensanpham;
    private double price;
    private String mota;
    private boolean success; // New field

    public ProductLaptop() {
        super();
    }

	public ProductLaptop(int id, String image, String tensanpham, double price, String mota, boolean success) {
		super();
		this.id = id;
		this.image = image;
		this.tensanpham = tensanpham;
		this.price = price;
		this.mota = mota;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
