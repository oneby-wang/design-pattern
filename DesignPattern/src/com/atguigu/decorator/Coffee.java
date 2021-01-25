package com.atguigu.decorator;

//±»×°ÊÎÕß
public abstract class Coffee extends Drink {
	@Override
	public float cost() {
		return super.getPrice();
	}
}
