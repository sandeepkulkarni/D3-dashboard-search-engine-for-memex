package com.csci572hw.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.csci572hw.solr.QuerySolr;	

@Path("/api/query1")
public class Query1Service {
	
	
	@GET
	@Path("/getBubbleMenu")
	@Produces(MediaType.APPLICATION_JSON)
	public String getBubbleMenu() {
		QuerySolr querySolr=new QuerySolr("localhost",8983,"memexcollection");
		String response=querySolr.getQueryFromSolr("content%3A+%2F.*shotgun.*%2F+AND+(ctakes_Date_Annotation%3A+%2F2015-01.*%2F+sellerStartDate%3A+%2F2015-01.*%2F+buyerStartDate%3A+%2F2015-01.*%2F)&wt=json&indent=true");
		
		
		
		return response;
	}

	@GET
	@Path("/getChordDiagram")
	@Produces(MediaType.APPLICATION_JSON)
	public String getChordDiagram() {
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
