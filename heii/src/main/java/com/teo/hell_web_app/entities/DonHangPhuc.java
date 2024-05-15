package com.teo.hell_web_app.entities;

import java.util.Objects;

public class DonHangPhuc {
    private int MaDonHang;
    private String name;
    private String phone;
    private String address;
    private double total;

    public DonHangPhuc() {
        super();
    }

	public DonHangPhuc(int maDonHang, String name, String  phone, String address, double total) {
        super();
        this.MaDonHang = maDonHang;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.total = total;
    }

    public int getMaDonHang() {
        return MaDonHang;
    }

    public void setMaDonHang(int maDonHang) {
        this.MaDonHang = maDonHang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    @Override
	public int hashCode() {
		return Objects.hash(address, MaDonHang, name, phone, total);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DonHangPhuc other = (DonHangPhuc) obj;
		return Objects.equals(address, other.address) && MaDonHang == other.MaDonHang
				&& Objects.equals(name, other.name) && phone == other.phone
				&& Double.doubleToLongBits(total) == Double.doubleToLongBits(other.total);
	}
}
