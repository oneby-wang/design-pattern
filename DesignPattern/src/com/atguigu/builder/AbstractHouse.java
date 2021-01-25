package com.atguigu.builder;

public abstract class AbstractHouse {

	// 打地基
	public abstract void buildBasic();

	// 砌墙
	public abstract void buildWalls();

	// 封顶
	public abstract void roofed();

	// 建造房子的具体流程
	public void build() {
		buildBasic();
		buildWalls();
		roofed();
	}

}
