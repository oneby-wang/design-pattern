package com.atguigu.decorator;

public class Soy extends Decorator {
	public Soy(Drink obj) {
		super(obj);
		setDes(" ����  ");
		setPrice(1.5f);
	}
}
