package com.teo.hell_web_Dao.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.teo.hell_web_app.entities.donhang;

public class donhangdao {
    public ArrayList<donhang> getLatestdonHang() {
        //code
        String url, user, password;
        Connection conn = null;
        String sql = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<donhang> list123 = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            url = "jdbc:mysql://localhost:3306/product.k15p";
            user = "root";
            password = "77497856aa";
            conn = DriverManager.getConnection(url, user, password);
            
            sql = "select * from donhang";
            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();
            list123 = new ArrayList<donhang>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String diachi = rs.getString("diachi");
                String tensp = rs.getString("tensp");
                int soluong = rs.getInt("soluong");
                double tongtien = rs.getDouble("tongtien");
                donhang donhang = new donhang(id, diachi, tensp, soluong, tongtien);
                list123.add(donhang);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null)
                    conn.close();
                if (pst != null)
                    pst.close();
                if (rs != null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list123;
    }
    
    public boolean addDonHang(donhang newDonHang) {
        String url, user, password;
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            url = "jdbc:mysql://localhost:3306/product.k15p";
            user = "root";
            password = "77497856aa";
            conn = DriverManager.getConnection(url, user, password);
            
            String sql = "INSERT INTO donhang (diachi, tensp, soluong, tongtien) VALUES (?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, newDonHang.getDiachi());
            pst.setString(2, newDonHang.getTensp());
            pst.setInt(3, newDonHang.getSoluong());
            pst.setDouble(4, newDonHang.getTongtien());
            
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (conn != null)
                    conn.close();
                if (pst != null)
                    pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}