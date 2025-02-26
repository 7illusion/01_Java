package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	//controller는 사용자의 요청을 받아서 처리하고 , 그입력에 따라  
	
	private Snack s = new Snack();

	public SnackController() {
	}
	// 메서드
		// 데이터를 setter를 이용하여 저장하고,
		// 저장완료 결과 반환하는 메소드
		public String saveData(String kind, String name, String flavor,
							int numOf, int price) {
			
			s.setKind(kind);
			s.setFlavor(flavor);
			s.setName(name);
			s.setNumof(numOf);
			s.setPrice(price);
			
			return "저장 완료되었습니다."
					+ "\n저장한 정보를 확인하시겠습니까?(y/n) : ";
		}
		
		public String confirmData() {
			// 저장된 데이터를 반환함
			return s.information();
		}
		
	

}
