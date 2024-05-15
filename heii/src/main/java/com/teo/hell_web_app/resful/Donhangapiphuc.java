package com.teo.hell_web_app.resful;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.teo.hell_web_Dao.entities.ProductDaoPhuc;
import com.teo.hell_web_app.entities.DonHangPhuc;
import com.teo.hell_web_Dao.entities.DonHangDaoPhuc;

@Path("/DonHangs")
public class Donhangapiphuc {
	 private DonHangDaoPhuc donHangDao = new DonHangDaoPhuc();

	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response getDonHangs() {
	        List<DonHangPhuc> donHangs = donHangDao.getLatestDonHangList();
	        return Response.ok(donHangs).build();
	    }

	    @POST
	    @Consumes(MediaType.APPLICATION_JSON)
	    public Response createDonHang(DonHangPhuc donHang) throws URISyntaxException {
	        if (donHang == null) {
	            return Response.status(Response.Status.BAD_REQUEST).entity("Invalid DonHang data").build();
	        }

	        boolean success = donHangDao.addDonHang(donHang);
	        if (success) {
	            // Thêm thành công, trả về status 201 và URI của đơn hàng mới
	            return Response.created(new URI("/DonHangs/" + donHang.getMaDonHang())).build();
	        } else {
	            // Nếu thất bại, trả về status 500
	            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Failed to add DonHang").build();
	        }
	    }
}
