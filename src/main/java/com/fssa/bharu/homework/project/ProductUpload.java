package com.fssa.bharu.homework.project;

/**
 * @author SanthanamMariappan
 *
 */

public class ProductUpload {
	String product_name;
	String Description;
	String Title;
	String Sold_by;
	int prize;
	String url;
	
	 

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getSold_by() {
		return Sold_by;
	}

	public void setSold_by(String sold_by) {
		Sold_by = sold_by;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

//	public double getWidth_height() {
//		return width_height;
//	}
//
//	public void setWidth_height(double width_height) {
//		this.width_height = width_height;
//	}

}
