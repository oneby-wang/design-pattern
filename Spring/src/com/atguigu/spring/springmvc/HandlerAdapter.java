package com.atguigu.spring.springmvc;

///定义一个Adapter接口 
public interface HandlerAdapter {
	// 当前 HandlerAdapter 对象是否支持 handler（判断 handler 的类型是否为具体的子类类型）
	public boolean supports(Object handler);

	// 执行目标方法（将 handler 对象强转后，调用对应的方法）
	public void handle(Object handler);
}

// 多种适配器类
class SimpleHandlerAdapter implements HandlerAdapter {

	public void handle(Object handler) {
		((SimpleController) handler).doSimplerHandler();
	}

	public boolean supports(Object handler) {
		return (handler instanceof SimpleController);
	}

}

class HttpHandlerAdapter implements HandlerAdapter {

	public void handle(Object handler) {
		((HttpController) handler).doHttpHandler();
	}

	public boolean supports(Object handler) {
		return (handler instanceof HttpController);
	}

}

class AnnotationHandlerAdapter implements HandlerAdapter {

	public void handle(Object handler) {
		((AnnotationController) handler).doAnnotationHandler();
	}

	public boolean supports(Object handler) {
		return (handler instanceof AnnotationController);
	}

}