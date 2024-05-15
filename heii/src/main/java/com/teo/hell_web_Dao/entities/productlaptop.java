package com.teo.hell_web_Dao.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.teo.hell_web_app.entities.ProductLaptop;

public class productlaptop {
	public Map<String, Object> getLatestProductLaptop() {
        String url, user, password;
        Connection conn = null;
        String sql = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<ProductLaptop> productList = new ArrayList<>();
        boolean success = false;
        String message = "";

        try {
            // Connect to DB
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create a connection
            url = "jdbc:mysql://localhost:3306/product.k15p";
            user = "root";
            password = "77497856aa";
            // Establish connection
            conn = DriverManager.getConnection(url, user, password);
            // SQL query
            sql = "SELECT * FROM laptop";
            // Create a prepared statement
            pst = conn.prepareStatement(sql);
            // Execute query
            rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String tensanpham = rs.getString("tensanpham");
                String image = rs.getString("image");
                 success = true;
                 double price = rs.getDouble("price");
                 String mota=rs.getString("mota");
                 ProductLaptop product1 = new ProductLaptop(id, image, tensanpham,price,mota,success);
                productList.add(product1);
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            message = "khong thanh cong: " + e.getMessage();
        } finally {
            try {
                if (conn != null) conn.close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        Map<String, Object> result = new HashMap<>();
        if (success) {
            result.put("success", true);
            result.put("message", message);
            result.put("result", productList);
        } else {
            result.put("success", false);
            result.put("message", message);
        }

        return result;
    }
}
