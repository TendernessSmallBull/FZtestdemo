package com.demo.test.algorithm;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int [] sz= {9,0,4,7,2,3,5};
		
		System.out.print("����ǰ���飺");
		for(int num:sz) {
			System.out.print(num+"");
		}
		
		//N������Ҫ������ɣ��ܹ�����N-1������ÿi�˵��������Ϊ(N-i)��
		
		for(int i=0;i<sz.length-1;i++) {
			for(int j=0;j<sz.length-1-i;j++) {
				if(sz[j]>sz[j+1]) {
					int temp=sz[j];
					sz[j]=sz[j+1];
					sz[j+1]=temp;
				}
			}
		}
		
		System.out.println("");
		System.out.print("����������Ϊ��");
		for(int sum:sz) {
			System.out.print(sum+"");
		}
	}

}
