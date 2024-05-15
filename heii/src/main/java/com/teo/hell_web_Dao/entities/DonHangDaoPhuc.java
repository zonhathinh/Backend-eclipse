package com.teo.hell_web_Dao.entities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.teo.hell_web_app.entities.DonHangPhuc;
public class DonHangDaoPhuc {
    private String url = "jdbc:mysql://localhost:3306/product-k15pm07";
    private String user = "root";
    private String password = "77497856aa";

    public ArrayList<DonHangPhuc> getLatestDonHangList() {
        ArrayList<DonHangPhuc> list = new ArrayList<>();
        String sql = "SELECT * FROM donhang";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                int MaDonHang = rs.getInt("MaDonHang");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                double total = rs.getDouble("total");
                DonHangPhuc donHang = new DonHangPhuc(MaDonHang, name, phone, address, total);
                list.add(donHang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public boolean addDonHang(DonHangPhuc donHang) {
        if (donHang == null) {
            // Xử lý khi đối tượng donHang là null
            return false;
        }

        String sql = "INSERT INTO donhang (name, phone, address, total) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, donHang.getName());
            pst.setString(2, donHang.getPhone());
            pst.setString(3, donHang.getAddress());
            pst.setDouble(4, donHang.getTotal());

            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }



    public boolean updateDonHang(DonHangPhuc donHang) {
        String sql = "UPDATE donhang SET name = ?, phone = ?, address = ?, total = ? WHERE MaDonHang = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, donHang.getName());
            pst.setString(2, donHang.getPhone());
            pst.setString(3, donHang.getAddress());
            pst.setDouble(4, donHang.getTotal());
            pst.setInt(5, donHang.getMaDonHang());

            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}