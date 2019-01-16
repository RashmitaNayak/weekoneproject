package com.training.bean;

public class CourseBean {
	private String categoryCode; 
	private String categoryName; 
	private String title; 
	private String code;
	private String teacher;
	private String category;
	private String language;
	
	public CourseBean() {}
			
	public CourseBean(String categoryCode, String categoryName, String title, String code, String teacher, String category, String language) {
		super();
		this.categoryCode = categoryCode;
		this.categoryName = categoryName;
		this.title = title;
		this.code = code;
		this.teacher = teacher;
		this.category = category;
		this.language = language;
	}

	public String getCategorycode() {
		return categoryCode;
	}

	public void setCategorycode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryname() {
		return categoryName;
	}

	public void setCategoryname(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "CourseBean [categoryCode=" + categoryCode +",categoryName=" + categoryName +",title=" + title + ",code=" + code +",category=" + category +",teacher=" + teacher +",language=" + language +"]";
}
}
