package com.exersciseHashMaps.app;
import java.util.HashMap;
import java.util.Map;
public class HashMapsApp {

	public static void main(String[] args) {
		/*HashMap<K,V>*/ 
		HashMap<Integer,String> hash= new HashMap<Integer,String>();
		hash.put(1, "Ary");
		hash.put(2,"Ale");
		hash.put(3,"Luis");
		
		for (int i=0; i<=hash.size();i++) {
			if(hash.containsKey(i)) {
				System.out.println(hash.get(i));
			}
		}
		for(Map.Entry<Integer, String> map : hash.entrySet()) { //for each
			System.out.println(String.format("The key is:\n %d:%s",map.getKey(),map.getValue()));
		}

	}

}
