package com.javabrains;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		String ipAddress="69.162.87.122";
		if(ipAddress.length()==0){
			System.out.println("You need to pass in one IP address");
		}else{
			
			GeoIPService ipService=new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap=ipService.getGeoIPServiceSoap();
			GeoIP geoIP=geoIPServiceSoap.getGeoIP(ipAddress);
			System.out.println(geoIP.getCountryName());
		}

	}

}
