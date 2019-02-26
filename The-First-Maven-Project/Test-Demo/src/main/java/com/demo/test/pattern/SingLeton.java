package com.demo.test.pattern;

public class SingLeton {
	
	//饿汉
	//直接创建对象
	public static SingLeton instance = new SingLeton();
	
	//私有化构造函数
	private SingLeton() {
		
	}
	
	//返回对象实例
	public static SingLeton getInstance() {
		return instance;
	}
	
	
	//懒汉
	//声明变量
	private static volatile SingLeton singLeton = null;
	
	//私有构造函数
//	private SingLeton() {
//		
//	}
	
	//提供对外方法
	public static SingLeton getInstance1() {
		if(singLeton == null) {
			synchronized(SingLeton.class) {
				if(singLeton == null) {
					singLeton = new SingLeton();
				}
			}
		}
		return singLeton;
	}

}
