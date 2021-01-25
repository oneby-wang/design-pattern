package com.atguigu.principle.inversion.improve;

public class DependencyPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChangHong changHong = new ChangHong();
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.open(changHong);

		// 通过构造器进行依赖传递
//		OpenAndClose openAndClose = new OpenAndClose(changHong);
//		openAndClose.open();
		// 通过setter方法进行依赖传递
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.setTv(changHong);
//		openAndClose.open();

	}

}

// 方式1： 通过接口传递实现依赖
// 开关的接口
interface IOpenAndClose {
	public void open(ITV tv); // 抽象方法,接收接口
}

// ITV接口
interface ITV {
	public void play();
}

// 长虹电视：实现 ITV 接口
class ChangHong implements ITV {
	@Override
	public void play() {
		System.out.println("长虹电视机，打开");
	}
}

// 设备播放类：实现 IOpenAndClose 接口，调用接口 IITV 的 play() 方法实现播放功能（通过接口注入）
class OpenAndClose implements IOpenAndClose {
	public void open(ITV tv) {
		tv.play();
	}
}

//// 方式2: 通过构造方法依赖传递
//interface IOpenAndClose {
//	public void open(); // 抽象方法
//}
//
//interface ITV { // ITV接口
//	public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//	public ITV tv; // 成员变量
//
//	public OpenAndClose(ITV tv) { // 通过构造器注入实现了 ITV 接口的对象实例
//		this.tv = tv;
//	}
//
//	public void open() {
//		this.tv.play();
//	}
//}

//// 方式3 , 通过setter方法传递
//interface IOpenAndClose {
//	public void open(); // 抽象方法
//	public void setTv(ITV tv); // 通过 setter 方法注入
//}
//
//interface ITV { // ITV接口
//	public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//	private ITV tv;
//
//	// 通过 setYv() 方法注入实现了 ITV 接口的对象实例
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
//		System.out.println("长虹电视机，打开");
//	}
//	 
//}