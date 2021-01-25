package com.atguigu.builder;

public abstract class AbstractHouse {

	// ��ػ�
	public abstract void buildBasic();

	// ��ǽ
	public abstract void buildWalls();

	// �ⶥ
	public abstract void roofed();

	// ���췿�ӵľ�������
	public void build() {
		buildBasic();
		buildWalls();
		roofed();
	}

}
