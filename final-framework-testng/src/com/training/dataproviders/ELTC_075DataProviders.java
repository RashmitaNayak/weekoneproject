package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;


import com.training.readexcel.ApachePOIExcelread2;

public class ELTC_075DataProviders {
	@DataProvider(name = "exceldata2-inputs")
	public Object[][] getExcelData(){
		String fileName = "C:\\Users\\IBM_ADMIN\\Documents\\seleniumtestsheets\\testdatafor075.xlsx";
String sheetName = "Sheet1";
		List<List<Object>> retVal = ApachePOIExcelread2.getExcelContent(fileName,sheetName);
		System.out.println("size " + retVal.size());
		
		Object[][] result = new Object[retVal.size()][retVal.size()]; 
		int count = 0; 

		for(List<Object> temp : retVal){
			if(temp!=null){
			Object[]  obj = new Object[5]; 
			System.out.println(temp.get(0));
			System.out.println(temp.get(1));
			System.out.println(temp.get(2));
			System.out.println(temp.get(3));
			System.out.println(temp.get(4));
			

			obj[0] = temp.get(0); 
			obj[1] = temp.get(1); 
			obj[2] = temp.get(2);
			obj[3] = temp.get(3);
			obj[4] = temp.get(4);
			
			result[count ++] = obj; 
			}
		}
		
		return result; 
	}
}
