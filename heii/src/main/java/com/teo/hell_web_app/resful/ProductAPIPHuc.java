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
import com.teo.hell_web_app.entities.ProductPhuc;
@Path("/products1")
public class ProductAPIPHuc {
	ProductDaoPhuc productDao= new ProductDaoPhuc();
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProduct_JSON() {
        List<ProductPhuc> list = productDao.getLatestProductList();
        ObjectMapper mapper = new ObjectMapper();
        String jsonResult = null;
        try {
            jsonResult = mapper.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return Response.serverError().build();
        }
        return Response.ok(jsonResult, MediaType.APPLICATION_JSON).build();
    }
	

	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(ProductPhuc product) throws URISyntaxException {
	    int newProductId = productDao.addProduct(product);
	    URI uri;
	    if (newProductId > 0) {
	        uri = new URI("/HelloWebApp/rest/products" + newProductId);
	    } else {
        uri = new URI("/HelloWebApp/rest/products");
	    }
	    return Response.created(uri).build();
	}
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Response update(@PathParam("id") int id, ProductPhuc product) {
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
