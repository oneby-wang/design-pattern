package com.atguigu.principle.inversion.improve;

public class DependencyPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChangHong changHong = new ChangHong();
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.open(changHong);

		// ͨ��������������������
//		OpenAndClose openAndClose = new OpenAndClose(changHong);
//		openAndClose.open();
		// ͨ��setter����������������
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.setTv(changHong);
//		openAndClose.open();

	}

}

// ��ʽ1�� ͨ���ӿڴ���ʵ������
// ���صĽӿ�
interface IOpenAndClose {
	public void open(ITV tv); // ���󷽷�,���սӿ�
}

// ITV�ӿ�
interface ITV {
	public void play();
}

// ������ӣ�ʵ�� ITV �ӿ�
class ChangHong implements ITV {
	@Override
	public void play() {
		System.out.println("������ӻ�����");
	}
}

// �豸�����ࣺʵ�� IOpenAndClose �ӿڣ����ýӿ� IITV �� play() ����ʵ�ֲ��Ź��ܣ�ͨ���ӿ�ע�룩
class OpenAndClose implements IOpenAndClose {
	public void open(ITV tv) {
		tv.play();
	}
}

//// ��ʽ2: ͨ�����췽����������
//interface IOpenAndClose {
//	public void open(); // ���󷽷�
//}
//
//interface ITV { // ITV�ӿ�
//	public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//	public ITV tv; // ��Ա����
//
//	public OpenAndClose(ITV tv) { // ͨ��������ע��ʵ���� ITV �ӿڵĶ���ʵ��
//		this.tv = tv;
//	}
//
//	public void open() {
//		this.tv.play();
//	}
//}

//// ��ʽ3 , ͨ��setter��������
//interface IOpenAndClose {
//	public void open(); // ���󷽷�
//	public void setTv(ITV tv); // ͨ�� setter ����ע��
//}
//
//interface ITV { // ITV�ӿ�
//	public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//	private ITV tv;
//
//	// ͨ�� setYv() ����ע��ʵ���� ITV �ӿڵĶ���ʵ��
//	public void setTv(ITV tv) {
//		this.tv = tv;
//	}
//
//	public void open() {
//		this.tv.play();
//	}
//}

//class ChangHong implements ITV {
//
//	@Override
//	public void play() {
//		// TODO Auto-generated method stub
//		System.out.println("������ӻ�����");
//	}
//	 
//}