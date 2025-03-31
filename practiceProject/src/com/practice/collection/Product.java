package com.practice.collection;

import java.util.Objects;

public class Product {
	
	private int pNo;
	private String pName;
	private String pLocation;
	
	public int getpNo() {
		return pNo;
	}
	public void setpNo(int pNo) {
		this.pNo = pNo;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpLocation() {
		return pLocation;
	}
	public void setpLocation(String pLocation) {
		this.pLocation = pLocation;
	}
	@Override
	public String toString() {
		return "Product [pNo=" + pNo + ", pName=" + pName + ", pLocation=" + pLocation + "]";
	}
	public Product() {
	}
	public Product(int pNo, String pName, String pLocation) {
		this.pNo = pNo;
		this.pName = pName;
		this.pLocation = pLocation;
	}
	@Override
	public int hashCode() {
		return Objects.hash(pNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return pNo == other.pNo;
	}
	
	
	
	

}
