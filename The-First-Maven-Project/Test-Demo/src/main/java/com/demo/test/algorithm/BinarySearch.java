package com.demo.test.algorithm;

public class BinarySearch {
	
	/*
	 * �ŵ��ǱȽϴ����٣������ٶȿ죬ƽ�����ܺã� ȱ����Ҫ������Ϊ������Ҳ���ɾ�����ѡ�
	 */
	public static int binarySearch(int[] sz,int key,int low,int high) {
		if (key<sz[low] || key>sz[high] || low>high) {
			return -1;
		}
		int middle = (low + high)/2;
		if(key>sz[middle]) {
			return binarySearch(sz,key,middle+1,high);
		}else if(key<sz[middle]) {
			return binarySearch(sz,key,low,middle-1);
		}else {
			return middle;
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] sz= {1,2,3,4,5,6,7,8,9};
		int key=8;
		int position = binarySearch(sz,key,0,sz.length-1);
		if(position == -1){
			System.out.println("���ҵ���"+key+",������û�и�����");
		}else{
			System.out.println("���ҵ���"+key+",�ҵ�λ��Ϊ��"+position);
		}
	}

}
