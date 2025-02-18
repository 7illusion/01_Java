package edu.kh.array.ex;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExample2 {
	
	public void shallowCopy() { //배열의 얕은 복사 
		//-> 주소를 복사하여 서로 다른 두 참조변수가 
		//하나의 배열(또는 객체)을 참조하는 상태를 만드는 복사
		
		int[] arr = {1,2,3,4,5};
		
		//얕은 복사 진행
		int[] copyArr = arr ; //주소만 복사 
		
		System.out.println("변경 전" );
		System.out.println("arr 주소 "+arr);
		System.out.println("copyArr 주소 "+copyArr);
		System.out.println("arr "+ Arrays.toString(arr));
		System.out.println("copyArr "+ Arrays.toString(copyArr));
		
		// 얕은 복사한 배열의 값을 변경 
		copyArr[2] = 100 ;
		System.out.println("변경 후" );
		System.out.println("arr "+ Arrays.toString(arr));
		System.out.println("copyArr "+ Arrays.toString(copyArr));
	}

	
	public void deepCopy() {// 깊은 복사
//같은 자료형의 새로운 배열을 만들어서 기존배열의 데이터를 모두 복사하는 방법
		int[] arr = {1,2,3,4,5};
		
		//1.for 문을 이용한 깊은 복사 
		int[] copyArr1 = new int[arr.length] ; // 원본 길이 만큼 복사본에 할당 
		for (int i = 0; i < arr.length; i++) {
			copyArr1[i] = arr[i] ; 
		}
		
		System.out.println("arr 주소" + arr);
		System.out.println("copyArr 주소" + copyArr1);
		System.out.println("arr" + Arrays.toString(arr));
		System.out.println("copyArr" + Arrays.toString(copyArr1));
		
		//2.system.arraycopy(원본배열명, 원복복사 시작 인덱스, 복사배열명, 
		//                   복사배열의 삽입 시작 인덱스 ,복사길이 ); 
		int[] copyArr2 = new int[arr.length];
		
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		System.out.println("copyArr2"+ Arrays.toString(copyArr2));
		
		//3.복사할 배열 참조변수 = Arrays.copyOf(원본 배열명, 복사할 길이);
		int[] copyArr3 = Arrays.copyOf(copyArr2, arr.length);
		System.out.println("copyArr3"+Arrays.toString(copyArr3));
		
		//값 변경 후 확인 
		copyArr1[4] = 0 ;
		copyArr2[4] = 99 ;
		copyArr3[4] = 503;
		
		System.out.println("arr"+Arrays.toString(arr));
		System.out.println("copyArr1"+Arrays.toString(copyArr1));
		System.out.println("copyArr2"+Arrays.toString(copyArr2));
		System.out.println("coopArr3"+Arrays.toString(copyArr3));
		
		
		
	}

	
	public void createLottoNumber() { //로또 번호 생성기 
		//배열을 이용한 중복데이터 제거 + 정렬 
		/*
		 * 1. 1~45 사이 중복되지 않은 난수 6개 생성 
		 * 2.생성된 난수가 오름차순 정렬 
		 * ->[3,5,11,14,24,41]  중복은 없다
		 * 1)정수 6개를 저장할 배열 선언 및 할당 
		 * 
		 * */
		//1)정수 6개를 저장할 배열 선언 및 할당 
		
		int[] lotto = new int[6];
		//2) 생성된 배령을 처음부터 끝까지 순차 접근하는 for문 작성 
		
		for (int i = 0; i < lotto.length; i++) {
			//3) 1~45 사이 난수 발생
			int random = (int)(Math.random() * 45 + 1);
			//4) 생성된 난수를 순거대로 배열 요소에 대입 
			lotto[i] = random;
			//5) 중복 검사를 위한 for문 작성 
			for (int j = 0; j < i ; j++) {
				//6) 현재 생성된 난수와 같은 수가 앞쪽 요소에 있는지 검사 
				if(random == lotto[j]) {
					i--; // 밖에 있는 for 문이 한번 더 돌 수 있도록 해줌 그자리를 다른 난수로 교체 
					break; // 다른 값은 비교안해줘도 상관 없기 떄문에 바로 브레이크 
				}
				
			}
			
			
		}
		//정렬은 되어있지 않지만, 중복 제거가 된 배열이 완성됨 
		 //7) 오름차순 정렬 
		//-> 선택 ,삽입, 버블 ,퀵 등등 의 정렬방법 자바가 제공하는 기능들임 
		//Arrays.sort(배열명)
		
		Arrays.sort(lotto); //오름차순 정렬
		
		
		
		System.out.println(Arrays.toString(lotto));
		
	}
}
