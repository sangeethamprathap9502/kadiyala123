package com.rb.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/stock")
public class Merchant {
@GET
@Produces(MediaType.TEXT_PLAIN)
public String getMerchantName(@QueryParam("merchant-name")String merchantName)
{
	return "john";
}


}
