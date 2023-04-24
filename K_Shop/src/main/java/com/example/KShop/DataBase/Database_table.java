package com.example.KShop.DataBase;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Items_Data")
public class Database_table {
	@Id
	@Column(name=" ItemNo ")
	private int itemNo;
	@Column(name=" Item ")
	private String item;
	@Column(name=" Type ")
	private String type;
	@Column (name=" Colour ")
	private String colour;
	@Column (name= " XS ")
	private int xs;
	@Column (name=" S ")
	private int s;
	@Column (name = " M ")
	private int m;
	@Column (name = " L ")
	private int l;
	@Column (name=" XL ")
	private int xl;
	@Column (name = " XXL ")
	private int xxl;
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getXs() {
		return xs;
	}
	public void setXs(int xs) {
		this.xs = xs;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getXl() {
		return xl;
	}
	public void setXl(int xl) {
		this.xl = xl;
	}
	public int getXxl() {
		return xxl;
	}
	public void setXxl(int xxl) {
		this.xxl = xxl;
	}
	
	
	
            
}
