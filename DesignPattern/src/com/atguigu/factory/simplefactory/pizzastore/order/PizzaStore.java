package com.atguigu.factory.simplefactory.pizzastore.order;

//�൱��һ���ͻ��ˣ���������
public class PizzaStore {

	public static void main(String[] args) {
		// new OrderPizza();

		// ʹ�ü򵥹���ģʽ
		new OrderPizza(new SimpleFactory());
		System.out.println("~~�˳�����~~");

		// new OrderPizza2();
	}

}
