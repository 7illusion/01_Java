package edu.kh.control.branch;

import java.util.Iterator;
import java.util.Scanner;

public class BranchExample { //분기문은 위치가 중요 
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		//1부터 10까지 1씩 증가하며 출력하는 반복문 작성 -> 반복 횟수가 정해져 있다면 for 문 
		//단, 5를 출력하면 반복문 종료
		//1 2 3 4 5
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print(i + " "); // 순서 중요 break 만나기 전에 출력 
			
			if (i == 5 ) {
				break;
			} 
		}
	}

	
	public void ex2() {
		// 입력받은 모든 문자열을 누적 
		//단, "exit@" 입력시 문자열 누적을 종료하고 결과 출력 
		
		String str = ""; //숫자를 문자열에 누적 
		
		while (true) {
			
			System.out.print("문자열 입력(exit@ 입력 시 종료) : ");
			String input = sc.nextLine();
			
			//next 다음 한 단어 공백 포함 x
			//nextLine 공백 포함 다음 한 줄
			
			// 자바에서 문자열 () 비교는 ==와 같은 비교 연산자 사용 불가
			//비교 연산자는 보통 기본자료형끼리 연산에서만 사용 가능
			//스트링은 참조형이다 
			
			//문자열1.equals(문자열2) -> 문자열 1,2 가 같은면 true 다르면 false 반환 
			
			if (input.equals("exit@") ) {
				break;
			}			
			str += input + " " ;	
			
		}
		System.out.println("============");
		System.out.println(str);
		
		
	}
	
	
	public void ex3() {
		//continue : 다음 반복으로 넘어감 
		
		//1~10 까기 1씩 증가하면서 출력 
		//단 , 3의 배수 제외
		
		//1 2 4 5 7 8 10 
		
		for (int i = 1; i <= 10; i++) {
			
			if (i % 3 == 0) {
				continue;
			}
			
			
			System.out.print(i+" ");
			
			
		}
	}


	public void ex4() {
		// 1~100 까지 1씩 증가하면 출력하는 반복문 
		//단 5의 배수는 건너 뛰고
		//증가하는 값이 40이 되었을떄 반복 멈춤 
		
		String str  = "";
		
		for (int i = 1; i <= 100; i++) {
			
			if (i == 40) {
				break;
			}
			
			if (i % 5 == 0) { //continue 가 위에 있다면 컨티뉴가 먼저 실행되어 아래는 실행을 안하고 다시 반복하러 간다 
				continue;
			}else {
				str += i + " ";
			}
			
			
		}
		System.out.print(str);
		
		
		
	}

	
	public void RSPGame() { //가위/바위/보 게임 
		//몇 판 할 지 입력받음 
		//입력바은 판수 만큼 반복
		
		//컴퓨터 : math.random() : 0.0 ~ 1.0 사이 난수 생성 
		// 1~3 사이 난수 생성 
		//1.가위 / 2. 바위 3. 보 / 
		//컴퓨터어 플레이어 가위바위로 판별 
		//플레이어 승 ! /졌습니다 / 비겼습니다/
		//매판 마다 현재 기록 : 1승 1무 0 패  같이 출력 
		
		System.out.println("가위 바위 보 게임!");
		System.out.print("몇 판 ? : ");
		int round = sc.nextInt();
		
		// 승패 기록용 변수 
		int win = 0;
		int draw = 0;
		int loss = 0;
		
		for (int i = 1; i <= round; i++) { //입력받은 판수 만크만 반복 
			
			System.out.println("\n"+ i + "번쨰 게임");
			System.out.print("가위/바위/보 중 하나 입력 : ");
			
			String str = sc.next(); //플레이어가 입력하는 가위/바위/보 
			
			int  random = (int)(Math.random() * 3 + 1);// 1 2 3 중 하나를 같는다 
			//math.random -> 0.0 <= x < 1

			//switch 로 random 값을 문자열로 바꾸기
			//컴퓨터가 입력하는 가위/바위/보 
			String com = null; //아무것도 참조하고 있지 않음 . null로 초기화 -> switch 문에 디폴트가 없어도 가능 
			
			switch (random) {
			case 1:
				com = "가위";
				break;
			case 2:
				com = "바위";
				break;
			case 3:
				com = "보";
				break;		
		
			}
			
			System.out.printf("컴퓨터는 [%s]를 선택했습니다 \n",com);
			
			//컴퓨터와 플레이어 가위바위보 판별 
			//비기는 경우
			if (str.equals(com)) { 
				System.out.println("비겼습니다.");
				
				draw++; //무승부 기록 카운트 
			}else { // 이기거나 진 경우 
				
				//플레이어가 이기는 3가지 경우 
				boolean win1 = str.equals("가위") && com.equals("보");
			    boolean win2 = str.equals("바위") && com.equals("가위");
			    boolean win3 = str.equals("보") && com.equals("바위");
				
			    if (win1 || win2 || win3) {
					System.out.println("플레이어 승 ");
					win++;
					
				}else {
					System.out.println("졌습니다.");
					loss++;
				}
			    
			}
			
	     System.out.printf("현재 기록 : %d승 %d패 %d무승부\n", win , loss , draw);
			
		}
		System.out.println("====게임 종료====");
		
	}

	
	public void ex5() {
		System.out.println("[가위/바위/보 게임]");
		System.out.print("몇 판? : ");
		int round = sc.nextInt();
		
		for (int i = 1; i <= round; i++) {
			
			System.out.printf("%d번째 게임", round);
			System.out.print("가위/바위/보 중 하나 입력 : ");
			String input = sc.next();
			
			
			
			
		}
	}


}
