package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.pack2.model.dto.Person;

public class SetService {
	/*
	 * Set(집합, 주머니)
	 * -기본적으로 순서를 유지하지 않음 
	 * -index 없음 -> get 메서드 사용 불가
	 * -중복 데이터 저장 x 
	 * 
	 * Set 인터페이스의 자식 클래스 
	 * 1. HashSet(대표) : 처리 속도가 빠른 Set
	 * 2. LinkedHashSet : 순서를 유지하는 set 
	 * 3. TreeSet : 자동 정렬이 되는 set
	 * 4.
	 * */
	
	public void method01() {
		
		//hashSet 객체 생성 
		Set<String>set = new HashSet<String>();
//		Set<String>set = new TreeSet<String>(); // 자동 정렬됨 가나다 순으로 
//		Set<String>set = new LinkedHashSet<String>();
	
		//1. boolean add(E e) : 추가 
		set.add("네이버");
		set.add("카카오");
		set.add("쿠팡");
		set.add("야놀자");
		set.add("당근마켓");
		set.add("토스");
		set.add("배달의 민족");
		set.add("라인");
		
		System.out.println(set);
		// -> HashSet 순서 유지 x 확인 
		// ->TreeSet 자동 정렬 o 
		//-> LinkedHashSet 순서 유지를 해줌 
		
		//중복 저장 확인 -> 
		set.add("배달의 민족");
		set.add("배달의 민족");
		set.add("배달의 민족");
		set.add("배달의 민족");
		set.add("배달의 민족");
		
		System.out.println(set); // -> [당근마켓, 배달의 민족, 카카오, 네이버, 야놀자, 쿠팡, 라인, 토스] 
		                         // 중복 저장을 안해준다 를 확인 가능하다 
		set.add(null);
		set.add(null);
		set.add(null);

		System.out.println(set); // 널 또한 한번만 저장 
		
		//2. int size() : Set에 저장된 객체의 수 변환 
		System.out.println("set의 size() : " + set.size()); // 9
		
		//3. boolean remove(E e) :
		//전달받은 매개변수 e를 set에서 제거 
		//제거 성공 true, 없으면 false 
		System.out.println(set.remove("배달의 민족"));// 삭제가 되면 true 가 나옴 
		System.out.println(set);
		System.out.println(set.remove("kt"));// 처음부터 없기 떄문에 false 가 나옴 
		
		//4. boolean contains(E e)
		//전달받은 e가 Set에 있으면 true , 없으면 false 
		System.out.println("쿠팡 있는지 검사 " + set.contains("쿠팡")); // 있다면 true 가 나옴 
		System.out.println("삼성이 있는지 검사" + set.contains("삼성")); // 없다면 false 가 나옴 
		
		//5. void clear() : set에 저장된 내용을 모두 삭제
		set.clear();
		
		//6.boolean isEmpty() : 비어있으면 true 아니면 false 
		System.out.println(set.isEmpty());  //비어 있어서 true 
		System.out.println(set);
	}

	/**
	 * set 에 저장된 요소(객체)를 꺼내는 방법
	 * 
	 * 1.Iterator(반복자) 이용
	 * 2.List 로 변환 
	 * 3.향상된 for 문 이용
	 */
	public void method02() {
		
		Set<String>set = new HashSet<String>();
		
		set.add("몽쉘");
		set.add("포카칩");
		set.add("쿠쿠다스");
		set.add("빈츠");
		set.add("꼬북칩");
		
		//1. Iterator (반복자) 
		//컬렉션 객체에 저장된 요소를 
		//하나씪 순차 접근하는 객체 
		
		//Iterator set.iterator() 
		//현재 set을 순차 접근할 수 있는 Iterator 객체 반환 
		System.out.println("Iterator로 변환 ");
		Iterator<String> it =set.iterator();
		
		//boolean Iterator.hasNext() 
		//다음 순차 접근할 요소가 있으면 true , 없으면 false 
		while(it.hasNext()) {
			//다음 요소가 있으면 반복 없으면 멈춤 false가 나오기 떄문에
			
			//E Iterator.next 다음 요소를 꺼내와 반환 
			String temp = it.next();
			System.out.println(temp);
		}
		
		System.out.println("---------------");
		
		System.out.println("list로 변환 ");
		//set에 저장된 객체를 이용해서 list를 생성
		List<String> list = new ArrayList<String>(set); //set객체 안에 있는 요소를 List로 변환 그걸 list 라는 이름 정의
		//set 요소들을 List에 추가 
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---------------");
		
		System.out.println("향상된 for문");
		
		for(String snack : set) {
			System.out.println(snack);
		}
		
	}
	
	/**
	 * 직접 만든 클래스(Person)를 이용해 만든 객체를 
	 * set에 저장(중복 제거 확인)
	 * 
	 * 
	 */
	public void method03() {
		
		//Hash라는 단어가 포함된 컬렉션 이용시
		//hascode equals 오버라이딩 필수적으로 진행되어야함 
		
		Person p1 = new Person("김길순",20,'여');	
		Person p2 = new Person("홍길동",24,'남');
		Person p3 = new Person("홍길동",24,'남');
		Person p4 = new Person("홍길동",24,'남');
		
		//set객체 생성 후 p1~p4 추가
		Set<Person>personSet = new HashSet<Person>(); // set 이라도 사용자가 만든 객체 라면 자동적으로 중복을 없에지는 못한다
		personSet.add(p4);
		personSet.add(p3);
		personSet.add(p2);
		personSet.add(p1);

		for(Person person : personSet) {
			System.out.println(person);
		}
		
		System.out.println("p1 :"+ p1.hashCode()+  " p2 : "+ p2.hashCode() +" p3 "+ p3.hashCode() );
		
		
		//A.equals(B) 에에와 비가 가지고 있는 필드값이 전부 같다면 true 
		System.out.println(p2.equals(p3)); //true 를 출력
		System.out.println(p1.equals(p2)); //false 출력 
		
		
		
	}
	
	/**
	 * TreeSet 이용한 로또번호 생성기
	 * -> 기본 오름차순 정렬
	 * 
	 * TreeSet 안에 저장되는 객체는 comparable 인터페이스 상속 필수 
	 *  Integer 는 comparable 상속이 되어 있음
	 *  
	 *  
	 * 
	 */
	public void mathod04() {
		//Integer 를 저장할 TreeSet 객체 생성
		Set<Integer>lotto = new TreeSet<Integer>();
		
		//난수 생성
		//1.math.random
		//2.Random,nextInt() 임의의 정수 값 생성 (10) -> 0~9 범위 내의 정수 값 반환 
		
		//랜덤객체 
		Random random = new Random();
		
		//lotte 에 저장된 값이 6개 미만이면 반복 //== 6개 면 멈춤 
		
		while(lotto.size() < 6 ) {
			//1~45 범위 난수 발생 ㄱ
			lotto.add(random.nextInt(45) + 1 ) ; //set 은 중복을 없에 번호를 만들어줌 
		
		}
		
		System.out.println(lotto);
		
	}
	
	/**
	 *<h1> 로또번호 생성기 </h1> 태그 방법임 </h1> 
	 * 금액을 입력받아 (천원 단위)
	 * 천원당 1회씩 번호 생성 후 리스트에 저장 
	 * 
	 * <pre>
	 * 금액 입력 : 3000
	 * 
	 * 1회[번호들]
	 * 2회[번호들]
	 * 3회[번호들]
	 * </pre>
	 * 
	 */
	public void lottoNumberGenerator() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random() ;
		
		System.out.println("금액 입력 : ");
		int amount = sc.nextInt() ; 
		
		//생성된 로또 번호 묶음 (TreeSet)을 저장할 List 객체 생성 
// 중복으로 컬렉션을 같이 쓸 수 있음  
		List<Set<Integer>>lotteList = new ArrayList<Set<Integer>>();
		
		//for문 반복될 떄 마다 새로운 TreeSet 객체 생성 
		for(int i = 0 ; i < amount/1000 ; i ++) {
			
			Set<Integer>lotto = new TreeSet<Integer>(Comparator.reverseOrder()); // 기본 오름차순 /Comparator.reverseOrder()
			
			while(lotto.size() < 6) {
				lotto.add(random.nextInt(45) + 1 );
				
			}
			lotteList.add(lotto);
			
			
		}
		//출력용 반복문
		for (int i = 0; i < lotteList.size(); i++) {
			System.out.println((i+1) + "회" + lotteList.get(i));
		}
		
		
		
	}
	
	
	
}
