package com.demo.test.algorithm;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int [] sz= {9,0,4,7,2,3,5};
		
		System.out.print("排序前数组：");
		for(int num:sz) {
			System.out.print(num+"");
		}
		
		//N个数字要排序完成，总共进行N-1趟排序，每i趟的排序次数为(N-i)次
		
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
		System.out.print("排序后的数组为：");
		for(int sum:sz) {
			System.out.print(sum+"");
		}
	}

}
