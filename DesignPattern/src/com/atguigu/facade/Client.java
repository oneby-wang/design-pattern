package com.atguigu.facade;

public class Client {

	public static void main(String[] args) {
		// ����ֱ�ӵ��á��� ���鷳
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		homeTheaterFacade.ready();
		homeTheaterFacade.play();

		homeTheaterFacade.end();
	}

}
