package com.demo.test.pattern;

public class SingLeton {
	
	//����
	//ֱ�Ӵ�������
	public static SingLeton instance = new SingLeton();
	
	//˽�л����캯��
	private SingLeton() {
		
	}
	
	//���ض���ʵ��
	public static SingLeton getInstance() {
		return instance;
	}
	
	
	//����
	//��������
	private static volatile SingLeton singLeton = null;
	
	//˽�й��캯��
//	private SingLeton() {
//		
//	}
	
	//�ṩ���ⷽ��
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
