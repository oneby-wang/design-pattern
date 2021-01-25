package com.atguigu.builder.improve;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		house.setBase("��¥�Ĵ�ػ�100��");
	}

	@Override
	public void buildWalls() {
		house.setWall("��¥����ǽ20cm");
	}

	@Override
	public void roofed() {
		house.setRoofed("��¥��͸���ݶ�");
	}

}
