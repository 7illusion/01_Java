package edu.kh.control.condition;

import java.awt.dnd.DragSourceMotionListener;
import java.util.Scanner;

public class ConditionExample { //기능제공용 클래스 
	
	Scanner sc = new Scanner(System.in); // 한번에 import 로 여러개의 메서드에서 사용 가능 
	//필드, 공동으로 쓰는 변수 등을 이 곳에 선언 
	
	public void ex1() { //if문
		
		//조건식이 true 일떄만 내부 코드 수행 
		//입력받은 정수가 양수인지 검사
		//양수라면 "양수입니다 " 출력
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if (input > 0) {
			System.out.println("양수입니다.");
			
		}
		if (input <= 0) {
			System.out.println("양수가 아닙니다");
			
		}
		
	}
	

	public void ex2() {
	 //if -else 문 
		// 조건식 결과가 true 면 if 문 ,
		//false면 else 구문이 수행됨 
		
		//홀짝 검사 
		//입력받은 정수값이 
		//홀수이면 "홀수입니다" 출력 
		//0이면 "0입니다"
		//짝수이면 "짝수입니다." 출력
		//중첩 if 문 사용
		
		System.out.print("정수 입력 : ");
		int input1 = sc.nextInt();
		
		if (input1 % 2 != 0) {
			System.out.println("홀수입니다.");
			
		} else { // 짝수 or 0 입력 수행 한번 더 걸러야함 -> if 문 중첩

			if (input1 == 0) {
				System.out.println("0입니다");
			} else {
				System.out.println("짝수입니다");
			}

		}
		
	}
	
	
	public void ex3() {
		//if (조건식) - else if(조건식) - else
		
		//양수 ,음수, 0 판별
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if (input > 0) {
			
			System.out.println("양수 입니다");
			
		} else if (input < 0) {
			System.out.println("음수 입니다");

		} else {
			System.out.println("0 입니다");
		}
			
	}

	public void ex4() {
		//달 (month)을 입력받아 해당 달에 맞는 계절 출력 
		//1,2,12 겨울(-15도 이하 : "한판 경보" /-12도 이하 : "한파 주의보")
		//3~5 봄
		//6~8 여름 (35도 이상 : 폭염경보 / 33도 이상 : 폭염 주의보 )
		//9~11 가을 
		//범위에 없는 경우는 "해당하는 계절이 없다" 출력 
	
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		String season;// 조선문 수행 결과를 저장할 변수 선언 
		
		if(month == 1 || month ==2 || month ==12) {
			season = "겨울";
			
			System.out.print("온도 입력 : ");
			int temperature =sc.nextInt();
			
			if (temperature <= -15) {
				season += " 한파 경보"; // -> 시즌에 겨울이 나오면서 한판 경도가 붙어서 출력 
			} else if(temperature <= -12) {
			    season += " 한파 주의보";

			} // else 문은 필요 없는 경우 작성 할 필요가 없다 
 			
			
		} else if(month >=3 && month <= 5) {
			season = "봄" ;
			
		} else if (month >=6 && month <=8) {
			season = "여름";
			
			System.out.print("온도 입력 : ");
			int temperature =sc.nextInt();
			
			if (temperature >= 35) {
				season += " 폭염 경보"; // -> 시즌에 겨울이 나오면서 한판 경도가 붙어서 출력 
			} else if(temperature  >= 33) {
			    season += " 폭염 주의보";

			} // else 문은 필요 없는 경우 작성 할 필요가 없다 
			
		}else if (month >=9 && month <= 11) {
			season = "가을";
			
		}else {
			season = "해당하는 계절 없다 ";
			
		}
		
		System.out.println(season);
		
	}

	public void ex5() {
		
		//나이를 입력받아
		//13세 이하면 "어린이 입니다'
		//13세 초과 19세 이하면 "청소년 입니다"
		//19세 초과 시 "성인 입니다" 출력 
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result ; // 결과값 담을 변수 선언
		
		if (age <= 13) {
			//System.out.println("어린이 입니다");
			result = "어린이 입니다";
			
		} else if (age <= 19){
			//System.out.println("청소년 입니다");
			result = "청소년 입니다";

		} else  {
			//System.out.println("성인 입니다");
			result = "성인 입니다";
		}
		System.out.println(result);
		
	}
	
	public void ex6() {
		// 점수 100점 만점 에서 입력받아 
		/*90점 이상 은 a
		 *80점 이상 90 미만 b
		 *70점 이상 80 미만 c
		 *60점 이상 70 미만 d
		 *60 미만 f
		 *0점 미만 , 100점 초과 는 "잘못 입력하셨습니다" 출력
		 * */
		System.out.print("점수 : ");
		int scoor = sc.nextInt();
		
		String result ;
		
		// 먼저 범위에서 벗어난 조건 부터 처리 
		if (scoor > 100 || scoor < 0) { // 여러가지 범위을 넣는 방법 or , and 을 넣어 가능
			result =  "잘못 입력하셨습니다";
			
		} else if(scoor >= 90) {
			result = "A";
			
		} else if(scoor >= 80) {
			result = "B";
			
		} else if(scoor >= 70) {
			result = "C";
			
		} else if(scoor >= 60) {
			result = "D";
			
		}  else {
			result = "F";
			
		}
		System.out.println(result);
	}

	public void ex7() {
		/*놀이기구 탑승 제한 검사
		 * 나이가 12세 이상 , 키 140.0 이상일 경우에만 "탑승가능"
		 * 나이가 12세 미만인 경우 : 적정 연령이 아닙니다 
		 * 키가 140.0 미만 : 적정 키가 아닙니다
		 * 나이가 0세 미만 , 100세 초과 시 : 잘못 입력하셨습니다 
		 * 
		 * */
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result ;
		
		
		if (age < 0 || age > 100) {
			result = "잘못 입력하셨습니다 " ;
			
		} else {
			System.out.print("키 : ");
			double hth = sc.nextDouble();
			
			 if (age < 12) {
				result = "적정 연령이 아닙니다 ";
				
			} else if (hth < 140) {
				result = "적정 키가 아닙니다 ";
				
			}else {
				result = "탑승가능";
			}
			
		}	
		
		if (age >= 12 ) {
			result = "탑승가능";

		} else if (age < 12) {
			result = "적정 연령이 아닙니다 ";
			
		} else {
			result = "잘못 입력하셨습니다 " ;
		}
		
		System.out.println(result);
	}
	
	public void ex8() {

		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result ;
		
		if (age < 0 || age > 100) {
			result = "나이를 잘못 입력하셨습니다 " ;
			
		} else { // 나이를 0~100 범위로 잘 입력한 경우 
			System.out.print("키 : ");
			double hth = sc.nextDouble();
			
			 if (hth > 250 || hth <0) {
					result = "키를 잘못 입력 하셨습니다" ;
					
				}else { // 키를 0 ~250 점상범주 입력한 경우 
					if (age < 12  &&  hth >= 140){
						result = "나이는 적절하나, 키가 적절치 않음";
						
					}else if (age >= 12  &&  hth < 140) {
						result = "키는 적절하나, 나이는 적절치 않음";
						
					}else if (age < 12  &&  hth < 140.0) { //나이 X , 키 X
						result = "나이와 키 모두 적절치 않음";
						
					}else { //탑승이 가능 그 외 조건 생각하기 : 변수를 선언만 한 경우
						result = "탑승 가능";
					}
					 				
				}
			
		}
		
		System.out.println(result);
			
		
	}

	public void ex9() { //switch 문

		//여러 case 중 하나를 선택하여 수행하는 조건문 
		
		System.out.print("요일 번호 : ");
		int day = sc.nextInt();
		
		switch (day) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;	
		case 6:
			System.out.println("토요일");
			break;
		case 7:
			System.out.println("일요일");
			break;	
		default: //default 에서 break 가 필요가 없다 있어도 상관 없음
			System.out.println("잘못된 입력입니다");
			break;
		}
		
	}

	public void ex10() {
		//점수 입력 (0~100)
		
		System.out.print("점수 : ");
		int score =sc.nextInt();
		
		switch (score/ 10) { // 조건식에 계산을 넣을 수 도 있음 
		case 10:
		case 9:
			System.out.println("학점 : A");
			break;
		case 8:
			System.out.println("학점 : B");
			break;
		case 7:
			System.out.println("학점 : C");
			break;
		case 6:
			System.out.println("학점 : D");
			break;
		default:				
			System.out.println("학점 : F");
			break;
		}
		
	}
	
}

