package com.demo.test.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortKey {
	
	public static void main(String[] args) {
		
		Map<String,String> map = new TreeMap<String, String>();
		
		map.put("赵一", "35");
		map.put("李二", "88");
		map.put("王五", "9");
		map.put("a", "9");
		map.put("s", "9");
		map.put("d", "9");
		map.put("f", "9");
		
		Map<String, String> resultMap = sortMapKey(map);
		
		for(Map.Entry<String, String> entry:resultMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}
	
	public static Map<String,String> sortMapKey(Map<String,String> map){
		
		if(map==null || map.isEmpty()) {
			return null;
		}
		
		Map<String,String> sortMap = new TreeMap<>(new MapKeyComparator());
		sortMap.putAll(map);
		return sortMap;	
		
	}
	

}
class MapKeyComparator implements Comparator<String>{
	
	@Override
	public int compare(String str1,String Str2) {
		return str1.compareTo(Str2);
	}
}