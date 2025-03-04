package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {
	
	//map :key와 Value 한 쌍으로 데이터가 되어 이를 모아둔 객체
	//key : Value -> entry라고 부름
	// - key를 모아두면 Set의 특징(중복불가능)
	// - value를 모아두면 List의 특징(중복 가능)
	
	public void ex1() {
		//hashMap<k,v> : map의 자식클래스 중 가장 대표임
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//map.put 추가 기능하는 메서드
		map.put(1, "길동이");		
		map.put(2, "해둥이");		
		map.put(3, "기둥이");		
		map.put(4, "해당이");		
		map.put(5, "제품이");		
		map.put(6, "조아이");		
	
		//키가 만약 중복이라면
		map.put(1, "dial");// 1번키의 값이 dial 로 변경 덮어쓰기

		//value 중복 테스트
		map.put(7, "해둥이"); //중복가능
		
		
		System.out.println(map); //map.toString 이  오버라이딩 되어있음
		
		
		
	}
	
	public void ex2() {
		//map을 사용 예제
		//dto/vo 값 저장용 객체들은 특정 데이터 묶음의 재사용이 많은 경우 주로 사용함 
		//재사용이 적은 vo 는 오히려 낭비 
		//-> map을 이용해서 1회성으로 비슷한 코드를 작성 가능 
		
		//vo 버전
		Member member = new Member();
		
		member.setId("userId");
		member.setPw("pass01");
		member.setAge(20);
		
		System.out.println(member.getId());
		System.out.println(member.getPw());
		System.out.println(member.getAge());
		
		
		//map 버전 
		Map<String, Object> map = new HashMap<String, Object>();
		//value가 object 타입이기 떄문에 어떤 객체든 들어올 수 있음 
		
		map.put("id", "usetId");
		map.put("pw", "usetPW");
		map.put("age", 26);
		
		//object(value)map.get(String key) : 매개변로 전달받은 key와 대응되는 value 반환
		System.out.println(map.get("id"));
		System.out.println(map.get("pw"));
		System.out.println(map.get("age"));
		
		System.out.println("-----------------------");
		
		/*
		 * map에 저장된 데이터 순차적으로 접근하기 
		 * map에서 key값만 모아두면 set의 특징을 가짐(중복불가)
		 * ->이를 활요해서 map 에서 keySet() 메서드 제공
		 * ->key만 모아서 set으로 반환
		 * map에 저장된 데이터가 많거나
		 * 어떤 key가 있는지 불분명할떄 향상된 for문을 사용하여 순차접근가능
		 * 또는 map에 저장된 모든 데이터에 접근해야 할 떄 
		 * keySet() + 향상된 for문 코드 사용 
		 * 
		 * */
		
		Set<String> set = map.keySet();// set이라는 이름의 Set을 만든 다음 map의 key만 가져와 넣어줌 
		System.out.println("keyset : "  +set); //set이라 순서 유지는 하지 않음 
		
		//-> 향상된 for문 사용 가능해짐
		for (String key : set) {
			System.out.println(map.get(key)); //value 값을 가져오고 순차적으로 접근가능 
			
		}
		
		
	}
	
	public void ex3() { // list 안에 map 넣기 
		
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		//ArrayList 객체만 만든 상황 map 객체는 따로 만들어줘야함
		
		for (int i = 0; i < 10; i++) {
			Map<String, Object> map = new LinkedHashMap<String, Object>( ); // 여기서 map 객체 생성 여러개의 데이터를 만들기 위해 for문 사용
			
			//10개의 map 객체들이 list 에 추가됨 
			map.put("id", "user0" + i);
			map.put("pw", "Pw0" + i);
			
//**			//hashMap은 순서를 보장하지 않는 자료구조 
//**			//순서를 유지하고 싶으면 LinkhhashMap 이용하여 put한 순서를 유지 시켜줌 
			//map을 lIst에 추가 
			list.add(map);  
			
		}
	System.out.println(list );
	
	//향상된 for문 이용하여 key가 id 에 대응되는 value 값 전부 출력하기 
	for (Map<String, Object> temp : list) { // list에서 Map 을 하나씩 꺼내옴
		System.out.println(temp.get("id")); // 키 Id 가 가지고 있는 
		
	}
	
	
	}
	

}
