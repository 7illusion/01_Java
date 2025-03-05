package com.toyFactory.model.service;


import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {
	
	private Scanner sc = new Scanner(System.in);
	
	private Set<Toy>toySet = new HashSet<Toy>();
	private Map<Integer, String>mapSet = new TreeMap<>();
			
	/**
	 * 매개변수로 전달받은 값들을 재료저장 Map에 있는지 확인하고 Set형태로 반환하는 메서드
	 * 가변인자 작성법 : 자료형...변수명 -> 매개변수의 수가 정확히 몇개인지 특정할 수 없을 때 사용
	 * -> 배열처럼 동작한다 자바에서 가변 인자는 배열로 변환되기 때문에 반복문을 사용가능
	 * @return
	 */
	public Set<String> addMaterials(Integer... materialIds) {
		//매개변수로 전달받은 재료를 저장하여 반환할 Set객체를 생성
		Set<String> addedMaterials = new HashSet<String>();
		
		for(Integer materialKey : materialIds) {
			
			//재료가 저장되어 있는 map 에서 키값에 대응하는 
			//재료명을 가져와서 addedMaterials에 추가
			String materialValue = mapSet.get(materialKey);	

			//재료 목록에 있다면 재료명을 addedMaterials 에 넣어줌
			if(materialValue != null ) {
				addedMaterials.add(materialValue);			}
		}
		return addedMaterials ;  // 넣어준 Set 을 반환해줌 (추가가 되었다면 추가가 된 상태로 )
	}
	
	
	public ToyFactory() {
		mapSet.put(1, "면직물");
		mapSet.put(2, "플라스틱");
		mapSet.put(3, "유리");
		mapSet.put(4, "고무");
		
	
		toySet.add(new Toy("마마롱레그",8,36000,"분홍색","199950805", addMaterials(1,4)));
		
	}
	
	public void display() {
			
		int menuNum = 0 ;
		
		do {
			System.out.println("======장난감 관리 프로그램========");
			System.out.println("1.전체 장난감 조회");
			System.out.println("2.새로운 장난감 만들기");
			System.out.println("3.장난감 삭제하기");
			System.out.println("4.장난감 제조일 순으로 조회하기"); 
			System.out.println("5.연령별 사용 가능한 장난감 리스트 조회"); 
			System.out.println("6.재료 추가");  
			System.out.println("7.재료 삭제"); 
			System.out.println("0,프로그램 종료");
			
			System.out.print("번호 선택 : ");
			
			try {
				menuNum = sc.nextInt();
				sc.nextLine(); //개행문자 제거용
				switch (menuNum) {
				case 1:  break;
				case 2:  break;
				case 3: break;
				case 4: break;
				case 5:  break;
				case 6:   break;
				case 7:   break;
				case 8:  break;
				case 0:System.out.println("프로그램 종료"); break ;	
				default:System.out.println("있는 번호만 입력");
					
				}
				
			} catch (Exception e) {
				System.out.println("\nerror : 입력형식이 유효하지 않습니다. 다시 시도해 주세요");
				sc.nextLine();
				
				menuNum = -1 ;// 첫반복시 잘못 입력하는 경우 
				//이를 방지하기 위해서 임의값 -1 대입 
				
			}
			
		} while (menuNum != 0); // 0이 들어오면 멈추고 아니면 계속 반복
		
	}
	
	public void seachToy() {
		
	}
	

}
