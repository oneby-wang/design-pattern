package com.atguigu.builder.improve;

//��Ʒ->Product
public class House {
	private String base;
	private String wall;
	private String roofed;

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getWall() {
		return wall;
	}

	public void setWall(String wall) {
		this.wall = wall;
	}

	public String getRoofed() {
		return roofed;
	}

	public void setRoofed(String roofed) {
		this.roofed = roofed;
	}

	@Override
	public String toString() {
		return "House [base=" + base + ", wall=" + wall + ", roofed=" + roofed + "]";
	}

}
