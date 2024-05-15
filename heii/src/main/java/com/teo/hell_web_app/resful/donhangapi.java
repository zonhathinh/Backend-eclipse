package com.teo.hell_web_app.resful;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.teo.hell_web_Dao.entities.donhangdao;
import com.teo.hell_web_Dao.entities.productdao;
import com.teo.hell_web_app.entities.Product;
import com.teo.hell_web_app.entities.donhang;

@Path("/donhang")
public class donhangapi {

	donhangdao productDao= new donhangdao();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
public List<donhang> getProduct_JSON() {
		List<donhang> list=null;
	
	list= productDao.getLatestdonHang();
	return list;
}
//@POST
//@Consumes(MediaType.APPLICATION_JSON)
//public Response createDonHang(donhang donHang) {
//    try {
//        productDao.addDonHang(donHang); // Giả sử bạn đã có phương thức addDonHang trong donhangdao để thêm đơn hàng vào DB
//        return Response.status(Response.Status.CREATED).entity("Đơn hàng được tạo thành công").build();
//    } catch (Exception e) {
//        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Lỗi khi tạo đơn hàng: " + e.getMessage()).build();
//    }
//}

@POST
@Consumes(MediaType.APPLICATION_JSON)
public Response createDonHang(donhang donHang) {
    if (donHang == null) {
        return Response.status(Response.Status.BAD_REQUEST).entity("Invalid DonHang data").build();
    }

    boolean success =  productDao.addDonHang(donHang);
    if (success) {
        // Thêm thành công, trả về status 201 và URI của đơn hàng mới
        return Response.created(URI.create("/donhang/" + donHang.getId())).build();
    } else {
        // Nếu thất bại, trả về status 500
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Failed to add DonHang").build();
    }
}
}
