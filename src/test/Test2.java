package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {

	@SuppressWarnings({ "unlikely-arg-type", "unchecked" })
	public static void main(String[] args) {
		Object test2 = new Object();
		System.out.println("test2...");
		int testInt = 300;
		//String testStr = Integer.toString(testInt);
		
//		if ("300".equals(Integer.toString(testInt))) {
//			System.out.println("zz");
//		}
		// System.out.println(testInt);
		
		int[] iArr= {1,4,2,6,5,3};
		System.out.println(iArr.length);
		
		List<Integer> iL = new ArrayList<Integer>();
		
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", 200);
		
		if (map.get("status").equals(200)) {
			System.out.println("200 ok..");
		}
		map.put("list", new ArrayList<Integer>());
		if (((List<Integer>) map.get("list")).size() >= 0) {
			System.out.println("0개 이상");
		}
		
		
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		Map<String, Object> elem1 = new HashMap<String, Object>(){{put("roleId", "admin");put("roleName", "Super User");put("userName", "손성식");put("userId", "fsds12");}};
		System.out.println(elem1);
		Map<String, Object> elem2 = new HashMap<String, Object>(){{put("roleId", "eval_user");put("roleName", "적정성 평가 위원");put("userName", "평가원2");put("userId", "evaler2");}};
		Map<String, Object> elem3 = new HashMap<String, Object>(){{put("roleId", "eval_master");put("roleName", "적정성 평가 위원장");put("userName", "평가원3");put("userId", "evaler3");}};
		Map<String, Object> elem4 = new HashMap<String, Object>(){{put("roleId", "eval_master");put("userName", "elem4");put("userId", "elem4");}};
		
		List arr = new ArrayList<Map<String, Object>>();
		arr.add(elem1);
		arr.add(elem2);
		arr.add(elem3);
		arr.add(elem4);
		
		map2.put("projectRole", arr);
		map.put("result", map2);
		System.out.println(map);
		
		Map<String, Object> _result = (Map<String, Object>) map.get("result");
		List<Map<String, Object>> projectRole =  (List<Map<String, Object>>) _result.get("projectRole");
		
		projectRole.forEach(elem -> {
			List<String> li = new ArrayList<String>();
			li.add((String) elem.get("roleId"));
			elem.replace("roleId", li);
		});
		
		
		//projectRole.forEach(elem -> {elem.remove("roleName");elem.remove("userName");});
		
		//projectRole.removeIf(elem -> ((String) elem.get("roleId") == "eval_master" || (String) elem.get("roleId") == "eval_user"));
		//projectRole.removeIf((elem) -> {"eval_master".equals(elem.get("roleId"));});
		
//		projectRole.removeIf((elem) -> {
//			 String roleId = (String) elem.get("roleId");
//			 return (roleId == null || "eval_master".equals(roleId));
//		});
		
//		for (Map<String, Object> map3 : projectRole) {
//			if ((String) map3.get("roleId") == "eval_master") {
//				System.out.println(map3.get("userId"));
//			}
//		}
		
//		for (int i = 0; i < projectRole.size(); i++) {
//			Map<String, Object> map3 = projectRole.get(i);
//			if ((String) map3.get("roleId") == "eval_master") {
//				System.out.println(map3.get("userId"));
//				projectRole.remove(i);
//			}
//		}
		System.out.println("====");
		System.out.println(projectRole);
		
		System.out.println(map);
		
		
		System.out.println(new ArrayList<String>() {{add("eval_master");}});
		
		
	}

}
