package com.atguigu.composite;

public class Department extends OrganizationComponent {

	// û�м���

	public Department(String name, String des) {
		super(name, des);
	}

	// add , remove �Ͳ���д�ˣ���Ϊ����Ҷ�ӽڵ�

	@Override
	protected void print() {
		System.out.println(getName());
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getDes() {
		return super.getDes();
	}

}
