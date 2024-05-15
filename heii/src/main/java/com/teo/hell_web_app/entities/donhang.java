package com.teo.hell_web_app.entities;

public class donhang {
	private int id;
	private String diachi;
	private String tensp;
    private int soluong;
    private double tongtien;
    
	    
		public donhang() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

		public donhang(int id, String diachi, String tensp, int soluong, double tongtien) {
			super();
			this.id = id;
			this.diachi = diachi;
			this.tensp = tensp;
			this.soluong = soluong;
			this.tongtien = tongtien;
		}



		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDiachi() {
			return diachi;
		}
		public void setDiachi(String diachi) {
			this.diachi = diachi;
		}
		public String getTensp() {
			return tensp;
		}
		public void setTensp(String tensp) {
			this.tensp = tensp;
		}
		public int getSoluong() {
			return soluong;
		}
		public void setSoluong(int soluong) {
			this.soluong = soluong;
		}
		public double getTongtien() {
			return tongtien;
		}
		public void setTongtien(double tongtien) {
			this.tongtien = tongtien;
		}
	

}
