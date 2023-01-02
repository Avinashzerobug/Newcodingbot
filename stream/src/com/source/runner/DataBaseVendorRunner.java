package com.source.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.source.dto.DataBaseVendorDTO;
import com.source.dto.Type;

public class DataBaseVendorRunner {

	public static void main (String[] fk) {
		
		Collection<DataBaseVendorDTO> dto = new ArrayList<DataBaseVendorDTO>();
		dto.add(new DataBaseVendorDTO("MircoSoft access","MicroSoft",Type.MicroSoftAccess,565,47));
		dto.add(new DataBaseVendorDTO("Oracle RDBMS","Oracle",Type.OracleRDBMS,500,12));
		dto.add(new DataBaseVendorDTO("MicroSoft SQL Server","Microsoft pvt ltd",Type.MicrosoftSQLServer,500,40));
		dto.add(new DataBaseVendorDTO("IBM DB2","Microsoft pvt ltd",Type.IBMDB2UDB,500,400));
		
		
		dto.stream().filter(ele->ele.getLisenceCost()<100 || ele.getType().equals("SQL")).map(ele->ele.getDevelopedBy().toUpperCase()).forEach(dto1->System.out.println(dto1));
		
		System.out.println(System.lineSeparator());
		System.out.println("======================================");
		
		dto.stream().forEach(ele->System.out.println(ele));
		
		System.out.println(System.lineSeparator());
		System.out.println("======================================");
		
		dto.stream().forEach(ele->System.out.println("Types of the Data Base Vendor:"+" "+ele.getType()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
