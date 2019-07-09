package com.tget.service.event.domain;

import java.sql.Date;

public class Category {

	///F
	private int categoryTwoNo;
	private char categoryOneCode;
	private String categoryTwoName;
	
	///C
	public Category() {
	}


	///M
	public int getCategoryTwoNo() {
		return categoryTwoNo;
	}

	public void setCategoryTwoNo(int categoryTwoNo) {
		this.categoryTwoNo = categoryTwoNo;
	}

	public char getCategoryOneCode() {
		return categoryOneCode;
	}

	public void setCategoryOneCode(char categoryOneCode) {
		this.categoryOneCode = categoryOneCode;
	}

	public String getCategoryTwoName() {
		return categoryTwoName;
	}

	public void setCategoryTwoName(String categoryTwoName) {
		this.categoryTwoName = categoryTwoName;
	}

	public String toString() {
		return "[Category] categoryTwoNo : "+categoryTwoNo+", "
	+"categoryOneCode : "+categoryOneCode+", " + "categoryTwoName : "+categoryTwoName;
	}
}
