package com.demo.test.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class MapErgodic {
	
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("����", 22);
		hashMap.put("����", 63);
		hashMap.put("����", 98);
		hashMap.put("���", 67);
		hashMap.put("����", 55);
		sortMapByValue(hashMap);
		System.out.println("--------------------------------------------");
		getHashMapKeySet(hashMap);
		System.out.println("--------------------------------------------");
		getHashMapForeachJavaEight(hashMap);
		System.out.println("--------------------------------------------");
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		treeMap.put(1, 22);
		treeMap.put(4, 63);
		treeMap.put(2, 98);
		treeMap.put(6, 67);
		treeMap.put(3, 55);
		getTreeMapKeySet(treeMap);
		System.out.println("-------------------------------------------");
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(4);
		linkedList.add(6);
		linkedList.add(3);
		linkedList.add(2);
		linkedList.add(8);
		getLinked(linkedList);
		System.out.println("-------------------------------------------");
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		linkedHashMap.put("����", 22);
		linkedHashMap.put("����", 63);
		linkedHashMap.put("����", 98);
		linkedHashMap.put("���", 67);
		linkedHashMap.put("����", 55);
		getlinkedHashMapKeySet(linkedHashMap);
		System.out.println("-------------------------------------------");
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(1);
		vector.add(2);
		vector.add(4);
		vector.add(3);
		vector.add(2);
		getVector(vector);
		System.out.println("-------------------------------------------");
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(7);
		treeSet.add(1);
		treeSet.add(4);
		treeSet.add(2);
		treeSet.add(2);
		//�����Լ�null
//		treeSet.add(null);
		System.out.println("TreeSet�����  "+treeSet.toString());
		System.out.println("-------------------------------------------");
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(7);
		linkedHashSet.add(1);
		linkedHashSet.add(4);
		linkedHashSet.add(2);
		linkedHashSet.add(2);
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		System.out.println("LinkedHashSet�����  "+linkedHashSet.toString());
		System.out.println("------------------------------------------");
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(7);
		hashSet.add(null);
		hashSet.add(null);
		hashSet.add(null);
		hashSet.add(7);
		hashSet.add(1);
		hashSet.add(4);
		hashSet.add(2);
		hashSet.add(11);
		hashSet.add(23);
		hashSet.add(45);
		hashSet.add(134);
		System.out.println("HashSet�����  "+hashSet.toString());
		System.out.println("-----------------------------------------");
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(null);
		arrayList.add(7);
		System.out.println(arrayList);
		LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
		linkedList1.add(2);
		linkedList1.add(3);
		linkedList1.add(4);
		linkedList1.add(null);
		linkedList1.add(7);
		System.out.println(linkedList1);
		
	}
	

	private static void sortMapByValue(HashMap<String, Integer> hashMap) {
		System.out.println("Map����value��������");
		// ����Ƚ���
	    Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String,Integer>>() {
	        @Override
	        public int compare(Entry<String, Integer> o1,Entry<String, Integer> o2) {
	            return o2.getValue()-o1.getValue();
	        }
	    };
	    
	    // hashMapת����list��������
	    List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(hashMap.entrySet());

	    // ����
	    Collections.sort(list,valueComparator);

	    for (Map.Entry<String, Integer> entry : list) {
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
	}


	private static void getHashMapForeachJavaEight(HashMap<String, Integer> map) {
		System.out.println("Java8ͨ��foreach+lambda����map��ʽ��");
		map.forEach((k,v)->System.out.println("Map��key��   "+k+"  ,  "+"Map��value��  "+v));
	}
	
	private static void getHashMapKeySet(HashMap<String, Integer> map) {
		System.out.println("ͨ��entrySet��ʽ����map��ʽ��");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Map��key��   "+entry.getKey()+" , "+"Map��value��   "+entry.getValue());
		}
	}
	
	private static void getTreeMapKeySet(TreeMap<Integer, Integer> hashMap) {
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			System.out.println("Map��key��   "+entry.getKey()+" , "+"Map��value��   "+entry.getValue());
		}
	}

	private static void getLinked(LinkedList<Integer> linkedList) {
		System.out.println("LinkedListͨ��foreach����������");
		for (Integer integer : linkedList) {
			System.out.println(integer.toString());
		}
		System.out.println("LinkedListͨ��forѭ������������");
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
	}
	
	private static void getlinkedHashMapKeySet(LinkedHashMap<String, Integer> linkedHashMap) {
		System.out.println("LinkedHashMap������");
		linkedHashMap.forEach((k,v)->System.out.println("Map��key��   "+k+"  ,  "+"Map��value��  "+v));
	}
	
	private static void getVector(Vector<Integer> vector) {
		System.out.println("Vector�����");
		for (Integer integer : vector) {
			String string = integer.toString();
			System.out.println(string);
		}
	}

}
