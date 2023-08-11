package com.springcore.expreaaionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("#{22+2}")  // expression language
	private int x;
	@Value("#{22+2+23}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(144)}")  // method call
	private int z;
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	@Value("#{new java.lang.String('Durgesh')}")
	private String name;
	@Value("#{8 > 5}")
	private boolean isactive;		// by default value false;
	
	
	
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	@Override
	public String toString() {
		return "Student [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isactive=" + isactive
				+ "]";
	}
	
	
	
	

}
