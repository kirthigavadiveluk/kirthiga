package Work;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataBaseConnect.DBCon;
import dataPack.Data;

public class Work1 extends HeadWork {
	private Data d;
	private DBCon  db;
	public Data getD() {
		return d;
	}
	public void setD(Data d) {
		this.d = d;
	}
	public DBCon getDb() {
		return db;
	}
	public void setDb(DBCon db) {
		this.db = db;
	}
	@Override
	public String working(HttpServletResponse response, HttpServletRequest request) {
d=new Data();
		
		db=new DBCon();
		
		d.setCustomerID(request.getParameter("customerid"));
		
		d.setStartstation(request.getParameter("PickUpPoint"));
		
		d.setEndstation(request.getParameter("DropPoint"));
		
		int a=db.findStationNumber(d.getStartstation());
		
		int b=a-1;
		
		int c=a+1;
		
		String prestation=db.findStationName(b);
		
		String nextstation=db.findStationName(c);
		
		int e=db.findStationDistance(d.getStartstation());
		
		int f=db.findStationDistance(d.getEndstation());
		
		int g=db.calculateAddedMoney(e, f);
		
		String taxiname=db.findTaxi(d.getStartstation());
		
		String taxiname1=db.findTaxi(prestation);
		
		String taxiname2=db.findTaxi(nextstation);
		
		if(d.getStartstation().equals(d.getEndstation())) {
			
			return "error";
			
		}else {
			
			if(taxiname!=null) {
				
				db.updateCustomerInfo(d.getCustomerID(), taxiname);	
				
				db.updateFlag(taxiname);
				
				int h=db.checkMoney(taxiname);
				
				db.updateMoney(g, h, taxiname);
				
				return "success";
				
			}
			
			else {
				
				if(taxiname1!=null) {
					
					db.updateCustomerInfo(d.getCustomerID(), taxiname1);	
					
					db.updateFlag(taxiname1);
					
					int h=db.checkMoney(taxiname1);
					
					db.updateMoney(g, h, taxiname1);
					
					return "success";
					
				}else {
					
					if(taxiname2!=null) {
						
						db.updateCustomerInfo(d.getCustomerID(), taxiname2);	
						
						db.updateFlag(taxiname2);
						
						int h=db.checkMoney(taxiname2);
						
						db.updateMoney(g, h, taxiname2);
						
						return "success";
						
					}else {
						
						return "error";
						
					}
					
				}
				
			}
		
		}
		
	}
	
	
}
