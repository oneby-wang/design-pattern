package com.atguigu.visitor;

public class Wait extends Action {

	@Override
	public void getResult(Person person) {
		System.out.println(person.gender + "���������Ǹø��ִ��� ..");
	}

}
