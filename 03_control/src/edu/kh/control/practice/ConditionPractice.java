package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		String result;
		
		if (input <= 0) {
            result = "양수만 입력해주세요." ;	
            
		} else if(input % 2 ==0) {
             result = "짝수입니다.";    
             
		} else {
			 result = "홀수입니다."; 
            	
            }
		System.out.println(result);	
		
		}

	
	public void practice2() {
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
        int sum = kor + math + eng ;
        double avg = sum/3;
        
        boolean result = (kor >= 40) && (math >= 40) && (eng >= 40) && (avg >=60) ? true : false;  // 여기 있는 조건을 그냥 if 문에 넣으면 되느닏
        
        if (result == false) {
			System.out.println("불합격입니다.");
			
		}else {
			System.out.printf("국어 : %d\n 수학 : %d\n 영어 : %d\n 합계 : %d\n 평균 : %.1f\n 축하합니다, 합격입니다.", kor, math, eng , sum, avg);
		}
		
	}

	public void practice3(){
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int moth = sc.nextInt();
		
		
		switch (moth) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:  // 그냥 숫자만 나열하여도 똑같이 기능함 
			System.out.println(moth +"월은 31일까지 있습니다.");
			break;
	     case 4: case 6: case 9: case 11:
	    	 System.out.println(moth + "월은 30일까지 있습니다.");
			break;
	     case 2:
	    	 System.out.println(moth + "월은 28일까지 있습니다.");
				break;
		default:
			System.out.printf("%d월은 잘못 입력된 달입니다." , moth);
			break;
		}
	
		
	}

	public void practice4(){
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weg =sc.nextDouble();
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double hth =sc.nextDouble();
		
		double bmi = weg/(hth*hth);
		
	 //	String result ;   이걸 사용한다면 아래 코딩이 더 심플하게 코딩 가능 
			
		if (bmi > 30) {
			System.out.printf("BMI 지수 : %f\n", bmi);
			System.out.println("고도 비만");
			
		} else if (bmi >= 25){
			System.out.printf("BMI 지수 : %f\n", bmi);
			System.out.println("비만");

		} else if (bmi >= 23){
			System.out.printf("BMI 지수 : %f\n", bmi);
			System.out.println("과체중");
			
		} else if (bmi >= 18.5){
			System.out.printf("BMI 지수 : %f\n", bmi);
			System.out.println("정상체중");
			
		} else {
			System.out.printf("BMI 지수 : %f\n", bmi);
			System.out.println("저체중");
			
		}
		
		
		}

	public void practice5(){
		
		System.out.print("중간 고사 점수 : ");
		int midscor = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int finscor = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int task = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		double qwer = sc.nextDouble();
		
		double midscor2 = midscor * 0.2 ; //복합대입 연산자로 midscor *= 0.2 형식으로 가능 
		double finscor2 = finscor * 0.3 ; //복합대입 연산자는 강제 형변환도 해준다 
		double task2 = task * 0.3 ;
		
		double total = midscor2 + finscor2 + task2 + qwer ;
		
		System.out.println("================= 결과 =================");
		
		if (qwer < 14) {
			System.out.printf("Faill [출석 횟수 부족 (%.0f / 20 )",qwer);
			
		} else if (total >= 70) {
         
			System.out.printf("중간 고사 점수 (20) : %.1f\n기말 고사 점수 (30) : %.1f\n", midscor2 ,finscor2 );
			System.out.printf("과제 점수      (30) : %.1f\n출석 점수      (30) : %.1f\n", task2 ,qwer );
			System.out.printf("총점 : %.1f\n", total);
			System.out.println("PASS");
			
		} else {
			 
			System.out.printf("중간 고사 점수 (20) : %.1f\n기말 고사 점수 (30) : %.1f\n", midscor2 ,finscor2 );
			System.out.printf("과제 점수      (30) : %.1f\n출석 점수      (30) : %.1f\n", task2 ,qwer );
			System.out.printf("총점 : %.1f\n", total);
			System.out.println("Fail [점수 미달]");
			
			// 마지막 시험 pass , fail 은 중복 if 문을 하나더 써서 뺴낼수 있다
			
			
		}
		
		
		
		
	}
	
	}


