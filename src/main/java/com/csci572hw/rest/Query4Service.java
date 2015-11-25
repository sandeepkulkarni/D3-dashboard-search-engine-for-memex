package com.csci572hw.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/query4")
public class Query4Service {
	
	@GET
	@Path("/getBubbleMenu")
	@Produces(MediaType.APPLICATION_JSON)
	public String getBubbleMenu(){
		return "bubblemenu";
	}

	@GET
	@Path("/getChordDiagram")
	@Produces(MediaType.APPLICATION_JSON)
	public String getChordDiagram(){
		return "ChordDiagram";
	}
	

	@GET
	@Path("/getAreaChart")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAreaChart(){
		return "AreaChart";
	}
	
	
	@GET
	@Path("/getBubbleChart")
	@Produces(MediaType.APPLICATION_JSON)
	public String getBubbleChart(){
		return "BubbleChart";
	}
	
	
	@GET
	@Path("/getTimeSeries")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTimeSeries(){
		return "TimeSeries";
	}
	
	
	@GET
	@Path("/getDendogram")
	@Produces(MediaType.APPLICATION_JSON)
	public String getDendogram(){
		return "Dendogram";
	}
	

}
