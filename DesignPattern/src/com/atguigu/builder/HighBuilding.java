package com.atguigu.builder;

public class HighBuilding extends AbstractHouse{

	@Override
	public void buildBasic() {
		System.out.println(" ��¥�Ĵ�ػ�100�� ");
	}

	@Override
	public void buildWalls() {
		System.out.println(" ��¥����ǽ20cm ");
	}

	@Override
	public void roofed() {
		System.out.println(" ��¥��͸���ݶ� ");
	}


}
