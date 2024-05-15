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

import com.teo.hell_web_Dao.entities.productdao;
import com.teo.hell_web_app.entities.Product;
@Path("/products")

public class ProductServiceAPI {
	productdao productDao= new productdao();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
public List<Product> getProduct_JSON() {
		List<Product> list=null;
	
	list= productDao.getLatestProductList();
	return list;
}
	
	

	
	
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(Product product) throws URISyntaxException {
	    int newProductId = productDao.addProduct(product);
	    URI uri;
	    if (newProductId > 0) {
	        uri = new URI("/heii/rest/products/" + newProductId);
	    } else {
        uri = new URI("/heii/rest/products/");
	    }
	    return Response.created(uri).build();
	}
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Response update(@PathParam("id") int id, Product product) {
	    product.setId(id);
	    if (productDao.updateProduct(product)) {
	        return Response.ok().build();
	    } else {
	        return Response.notModified().build();
	    }
	}
	
	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") int id) {
	    if (productDao.deleteProduct(id)) {
	    	return Response.noContent().build();
	    } else {
	        return Response.notModified().build();
	    }
	}
	
}