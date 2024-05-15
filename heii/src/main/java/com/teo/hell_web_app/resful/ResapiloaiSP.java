package com.teo.hell_web_app.resful;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

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

import com.teo.hell_web_Dao.entities.productdao1;
import com.teo.hell_web_app.entities.Product1;
@Path("/productsloaisp")

public class ResapiloaiSP {
	productdao1 productDao= new productdao1();
	 @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public Map<String, Object> getProduct_JSON() {
	        Map<String, Object> result = productDao.getLatestProductList34();
	        return result;
	    }
}
