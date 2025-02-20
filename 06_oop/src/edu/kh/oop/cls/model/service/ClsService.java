package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

//ClsSErvice 와 Student/ TestVO 는 패키지가 다름 
public class ClsService /*extends Student*/{ // 현재 Student 클래스를 상속받음 
	                                    //ClsService 자식 클래스가 됨 
	
	public void ex1() {
		//클래스 접근제한자 확인
		Student std = new Student();// public 으로 설정되어 어디서든 사용 가능 
		
//		TestVO test = new TestVO(); //TestVO 은 default 로 접근제한자로 되어 
		                            //같은 패키지가 아니면 불러 올 수 없음 
		
		//필드 접근 제한자 확인 
		/*
		 * System.out.println(std.v1); // public 직접 접근 가능 
		 * System.out.println(v2);
		 * //Student의 필드를 같이 쓰기에 그냥 호출 가능
		 *  System.out.println(std.v3);
		 * System.out.println(std.v4);
		 * 
		 * System.out.println(v3); //필드를 공유를 한다 해도 패키지가 다르기에 사용 x
		 * System.out.println(v4);//해당 클래스가 아니기 떄문에 사용 x
		 */		
	}
	
	
	public void ex2() {
		//static 필드 확인 예제 
		
		//학생 객체 2개 생성 
		Student std1 = new Student();
		Student std2 = new Student();
		
		System.out.println(std1.schoolName); // 현재 schoolName에 노란줄이 뜨는 이유 는 => 제대로 작성을 안해서이다
		System.out.println(std2.schoolName);
		
		// *** static 이 붙은 변수(필드)는 '클래스.변수명'으로 사용해야한다
        System.out.println(Student.schoolName);	// ->static 변수를 클래스 변수 라고도 한다 
	
        Student.schoolName = "정보교육원";
        
        System.out.println(Student.schoolName); 
        
        /*
         * static 
         * 공유 메모리 영역( 또는 정적 메모리 영역) 이라고 함 .
         * 
         * -> 프로그램 시작시 static이 붙은 코드들이 모두 
         * static 영역에 생성되고 
         * 프로그램이 종료될 때까지 사라지지 않음 (정적)
         * 그리고 , static 영역에 생성된 변수는 어디서든지 공유 가능 
         * */
        
	}

	
	public void ex3() {
	//생성자 확인 테스트 
		
		//User 기본 생성자를 이용해서 u1 객체 생성 
		User u1 = new User(); //user클래스의 기능을 한번함 
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		
		User u2 = new User(); // 똑같이 기본 생성자를 사용하여 똑같은 값이 나옴 
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		//문제점 : u1이 참조하고있는 User 객체와
		//u2가 참조하고있는 User 객체의 필드값이 모두 동일함 
		//왜? 같은 기본생성자로 User 객체를 생성했기 떄문 
		
		System.out.println("===========");
		
		//해결방법 1: setter를 이용해서 새로운값 재대입 
		u2.setUserId("asd123");
		u2.setUserPw("qwer1234");
		u2.setUserName("김영희");
		u2.setUserAge(23);
		u2.setUserGender('여');
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		//해결방법2 : 매개변수 생성자를 이용해서
		//객체가 생성될 떄 부터 다른값으로 필드를 초기화 
		
		User u3 = new User("zxcv","q1w2e3") ;
		//매개변수 생성자 
		
	
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		System.out.println(u3.getUserName());
		System.out.println(u3.getUserAge());
		System.out.println(u3.getUserGender());
		
		
	}
	
	
	public void ex4() {
		User u1 = new User();
		User u2 = new User("user02","pass02");
		User u3 = new User("user03","pass03","김길동",40,'남');
		
		//매개변수 5개짜리 생성자 (전부 초기화)
		
		System.out.printf("u1 : %s , %s , %s , %d ,%c \n" , u1.getUserId(),u1.getUserPw()
				                       ,u1.getUserName(), u1.getUserAge(),u1.getUserGender());
		
		System.out.printf("u2 : %s , %s , %s , %d ,%c \n" , u2.getUserId(),u2.getUserPw()
                ,u2.getUserName(), u2.getUserAge(),u2.getUserGender());

		System.out.printf("u3 : %s , %s , %s , %d ,%c \n" , u3.getUserId(),u3.getUserPw()
                ,u3.getUserName(), u3.getUserAge(),u3.getUserGender());

	}
}
