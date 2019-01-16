package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.CourseBean;
import com.training.dao.ELearningDAO;

public class ELTC_073DataProviders {
	@DataProvider(name = "dbdata-inputs")
	public Object [][] getDBData() {

		List<CourseBean> list = new ELearningDAO().getCourses(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(CourseBean temp : list){
			Object[]  obj = new Object[7];
			obj[0] = temp.getCategorycode();
			obj[1] = temp.getCategoryname();
			obj[2] = temp.getTitle();
			obj[3] = temp.getCode();
			obj[4] = temp.getTeacher();
			obj[5] = temp.getCategory();
			obj[6] = temp.getLanguage();
			
			
			result[count ++] = obj; 
		}
			
		return result;
	}

}
