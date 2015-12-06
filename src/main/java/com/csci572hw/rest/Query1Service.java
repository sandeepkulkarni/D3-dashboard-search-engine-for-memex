package com.csci572hw.rest;

import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.json.JSONObject;

import com.csci572hw.solr.QuerySolr;	

@Path("/api/query1")
public class Query1Service {
	
	
	@GET
	@Path("/getBubbleMenu")
	@Produces(MediaType.APPLICATION_JSON)
	public String getBubbleMenu() {
	//	QuerySolr querySolr=new QuerySolr("localhost",8983,"memexcollection");
	//	String response=querySolr.getQueryFromSolr("content%3A+%2F.*shotgun.*%2F+AND+(ctakes_Date_Annotation%3A+%2F2015-01.*%2F+sellerStartDate%3A+%2F2015-01.*%2F+buyerStartDate%3A+%2F2015-01.*%2F)&wt=json&indent=true");
		
		
		
		return "abc";
	}

	@GET
	@Path("/getChordDiagram")
	@Produces(MediaType.APPLICATION_JSON)
	public String getChordDiagram() {
		//QuerySolr querySolr=new QuerySolr("localhost",8983,"memexcollection");
		//String response=querySolr.getQueryFromSolr("content%3A+%2F.*shotgun.*%2F+AND+(ctakes_Date_Annotation%3A+%2F2015-01.*%2F+sellerStartDate%3A+%2F2015-01.*%2F+buyerStartDate%3A+%2F2015-01.*%2F)&wt=json&indent=true");
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
	public List<String> getTimeSeries(){
		QuerySolr querySolr=new QuerySolr("localhost",8983,"memexcollection");
		SolrDocumentList docs = querySolr.getQueryFromSolr("content%3A+%2F.*shotgun.*%2F+AND+(ctakes_Date_Annotation%3A+%2F2015-01.*%2F+sellerStartDate%3A+%2F2010-01.*%2F+buyerStartDate%3A+%2F2010-01.*%2F)&rows=100000&wt=json&indent=true",100);
		List<String> list = new LinkedList<String>();
		for(int i=0; i< docs.size(); i++)
		{
			SolrDocument doc = docs.get(i);
			if(!doc.getFieldValue("sellerStartDate").equals("N/A"))
			{
				list.add(doc.getFieldValue("sellerStartDate").toString());
			}
		}
		return list;
	}
	
	
	@GET
	@Path("/getDendogram")
	@Produces(MediaType.APPLICATION_JSON)
	public String getDendogram(){
		return "Dendogram";
	}
	

}
