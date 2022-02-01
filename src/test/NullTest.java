package test;

import java.util.Map;

public class NullTest {
	
	public static void main(String[] args) {
		Map<String, Object> testMap = null;
		
		System.out.println(testMap);
		
		//testMap.put("key1", "val1");
		
		//System.out.println(testMap);
		
		if (testMap == null) {
			System.out.println("null..");
		}
	}

}
