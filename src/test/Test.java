package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		
		int a = 200;
		String b = Integer.toString(a);
		System.out.println("200".equals(b));
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", 200);
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		Map<String, Object> elem1 = new HashMap<String, Object>(){{put("roleId", "admin");put("roleName", "Super User");put("userName", "손성식");put("userId", "fsds12");}};
		Map<String, Object> elem2 = new HashMap<String, Object>(){{put("roleId", "eval_master");put("roleName", "적정성 평가 위원장");put("userName", "평가원3");put("userId", "evaler3");}};
		Map<String, Object> elem3 = new HashMap<String, Object>(){{put("roleId", "eval_user");put("roleName", "적정성 평가 위원장");put("userName", "평가원3");put("userId", "evaler3");}};

		System.out.println("-----");
		System.out.println(elem1);
		System.out.println("-----");
		
		List arr = new ArrayList<Map<String, Object>>();
		arr.add(elem1);
		arr.add(elem2);
		arr.add(elem3);
		
		map2.put("projectRole", arr);
		map.put("result", map2);
		
		System.out.println("=========");
		System.out.println(map);
		System.out.println("=========");

		System.out.println("///////");
		System.out.println(map.put("aaa", "")); // null
		System.out.println(map.get("aaa").equals("")); // true
		System.out.println(map.get("qqq")); // null
		System.out.println(map.get("qqq") == null); // true
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
//		Map<String, Object> test1 = (Map<String, Object>) map.get("result");
//		System.out.println(test1);
//		List test2 = (List) test1.get("projectRole");
//		System.out.println(test2);
//		
//		test2.removeIf(elem -> ((Map<String, Object>) elem).get("roleId") == "eval_master" || ((Map<String, Object>) elem).get("roleId") == "eval_user");
//		
//		System.out.println(test2);
//		
//		Map<String, Object> elem4 = new HashMap<String, Object>(){{put("roleId", "testJoin");put("roleName", "모의결합");put("userName", "추연철");put("userId", "data");}};
//		test2.add(elem4);
//		System.out.println(test2);
		
		((Collection) ((Map<String, Object>) map.get("result")).get("projectRole")).removeIf(elem -> ((Map<String, Object>) elem).get("roleId") == "eval_master" || ((Map<String, Object>) elem).get("roleId") == "eval_user");
		
		System.out.println(map);
		
		((List) ((Map<String, Object>) map.get("result")).get("projectRole")).add(elem3);
		System.out.println(map);
	}

}
