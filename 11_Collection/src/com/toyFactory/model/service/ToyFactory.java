package com.toyFactory.model.service;


import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.toyFactory.model.dto.Toy;

public class ToyFactory extends Toy{
	Scanner sc = new Scanner(System.in);
	
	Set<Toy>toySet = new HashSet<Toy>();
	Map<Integer, String>mapSet = new TreeMap<>();
	
	public void  addToy(String toyName, int age ,int price ,String clolor ,String madeNumber,int...materialIds) {
		Set<String> materials = new TreeSet<>();
		for(int id : materialIds) {
			if (mapSet.containsKey(id)) {
				materials.add(mapSet.get(id));
			}
		}
		
		
	} 
	
	public void addMaterials(int... materialIds) {
		
		
	}
	
	
	public ToyFactory() {
		mapSet.put(1, "면직물");
		mapSet.put(2, "플라스틱");
		mapSet.put(3, "유리");
		mapSet.put(4, "고무");
		
	
		addToy("마마롱레그",8,36000,"분홍색","199950805",1,4);
		
	}
	
	public void display() {
			
		int menuNum = 0 ;
		
		do {
			System.out.println("======장난감 관리 프로그램========");
			System.out.println("1.전체 장난감 조회");
			System.out.println("2.새로운 장난감 만들기");
			System.out.println("3.장난감 삭제하기");
			System.out.println("4.장난감 제조일 순으로 조회하기"); //compareTo
			System.out.println("5.연령별 사용 가능한 장난감 리스트 조회"); 
			System.out.println("6.재료 추가");  //map
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
