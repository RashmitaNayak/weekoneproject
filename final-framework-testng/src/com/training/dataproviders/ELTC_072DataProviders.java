package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.readexcel.ApachePOIExcelRead;

public class ELTC_072DataProviders {
	@DataProvider(name = "exceldata-inputs")
	public Object[][] getExcelData(){
		//\\Users\\IBM_ADMIN\\Documents\\seleniumtestsheets\\testdatafor072.xlsx
		String fileName = "C:\\Users\\IBM_ADMIN\\Documents\\seleniumtestsheets\\testdatafor072data.xlsx";
String sheetName = "Sheet1";
		List<List<Object>> retVal = ApachePOIExcelRead.getExcelContent(fileName,sheetName);
		System.out.println("size " + retVal.size());
		
		Object[][] result = new Object[retVal.size()][retVal.size()]; 
		int count = 0; 

		for(List<Object> temp : retVal){
			if(temp!=null){
			Object[]  obj = new Object[7]; 
			System.out.println(temp.get(0));
			System.out.println(temp.get(1));
			System.out.println(temp.get(2));
			System.out.println(temp.get(3));
			System.out.println(temp.get(4));
			System.out.println(temp.get(5));
			System.out.println(temp.get(6));

			obj[0] = temp.get(0); 
			obj[1] = temp.get(1); 
			obj[2] = temp.get(2);
			obj[3] = temp.get(3);
			obj[4] = temp.get(4);
			obj[5] = temp.get(5);
			obj[6] = temp.get(6);
			result[count ++] = obj; 
			}
		}
		
		return result; 
	}

}
