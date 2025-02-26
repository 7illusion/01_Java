package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.dto.Car;
import edu.kh.poly.ex1.model.dto.Spark;
import edu.kh.poly.ex1.model.dto.Tesla;

public class PolyService {
	//alt 방향키
	public void ex1() {// 다형성 확인 문제 
		
		//카 객체 생성 부모타입 / 참조변수 = 부모객체주소 
		Car car = new Car();
		//테슬라 객체 생성 자식 / 타입 참조변수 = 자식객체주소 
		Tesla tesla = new Tesla();
		
		//====다형성=====
		
		//부모타입 참조변수 = 자식객체 
		Car car2 = new Tesla() ; 
		//테슬라 객체를 참조하는 변수의 타입이 Car(부모) 이게 떄문에 
		//테슬라 객체가 카(부모) 객체로 변화함  -> 업캐스팅 
		// -> 테슬라가 가지고 있던 변수들 이나 기능(메서드)을 못씀 
		
		
		Car car3 = new Spark();
		//스파크 객체를 참조하는 변수의 타입이 카
		//스파크 객체가 카 객체로 변화함 - > 업캐스팅
		// -> 스파크가 가지고 있던 변수들 이나 기능(메서드)을 못씀 
		
		//1) 자식 객체가 부모객체로 변하였기 떄문에 
		    //자식만의 고유한 필드 , 메서드를 사용할 수 없다 .
		
		//1-1) car(부모 == 부모)
		car.setEngine("6기통 엔진");
		car.setFuel("휘발유");
		car.setWheel(4);
		
		//1-2 tesla (자식 = 자식 )
		tesla.setBatteryCapacity(232323);
		tesla.setEngine("전기모터"); //-> 카가 가지고 있는 매개변수들 쓸 수 있음 
		
		//1-3 카2 (부모 = 자식(테슬라))
		car2.setEngine("전기모모터");
		car2.setWheel(3); // -> Car가 가지고 있는 변수들이나 기능들을 쓸 수 있지만 테슬라가 가지고 있는것은 못쓴다 
		                      // 테슬라가 아닌 카를 현재 인식하고 있다 
		
		car3.setEngine("경차 엔진");
		car3.setFuel("휘발유");
		car3.setWheel(5); // 마찬가지
		//car2 , car3 는 부모타입 참조변수(카) 이기 떄문에 자식객체(테슬라,스파크)의 고유 필드 및 메서드 사용 불가 
		
		//-------------------------------------------------------------------
		
		//2) 다형성을 이용한 객체배열 
		//객체배열 : 같은 객체 참조 자료형의 변수를 하나의 묶음으로 다루는것
		//다형성을 이용한 객체배열 
		//부모 타입 참조 자료형의 변수를 하나의 묶음으로 다루는것 
		
		Car[] arr = new Car[3] ; //3칸 짜리 객체 배열 부모타입 참조변수 배열 선언 및 할당 
		// 각 요소 Car 타입 참조변수 
		
		arr[0] = car ; //Car 의 주소 가 들어가 있음
		arr[1] = car2 ; //Tesla 주소를 가지고 있음
		arr[2] = car3 ; //스파크 주소를 가지고 있음 
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번쨰 인덱스의 엔진"+arr[i].getEngine());
			
		}
		// 상속 + 다형성 
		//상속특징 : Car 상속 클래스는 모두 getEngine()을 가지고 있다 .
		//다형성(업캐스팅) : 부모타입 참조변수인 arr[i]로 자식객체를 참조할 수 있다 .
		
	}
	
	public void printCar(Car temp) { // 전달받은 Car 또는 자식객체(Tesla,Spark)의 엔진, 연로 ,바퀴갯수를 출력하는 메서드 
		//Car temp = c(Car) 이러식의 대입 가능 
		//Car temp = t(Tesla)  
		
		//부모타입 참조변수 = 자식타입객체 
		//다형성의 업캐스팅 모양과 똑같다 
		//temp라는 Car 타입 매개변수에는 Car,Tesla ,Spark의 주소가 참조되어도 된다 
		
		System.out.println("엔진 : " + temp.getEngine()); // Car 의 매개변수만 사용 중 
		System.out.println("연로 : " + temp.getFuel()); // Car 의 매개변수만 사용 중 
		System.out.println("바퀴갯수 : " + temp.getWheel()); // Car 의 매개변수만 사용 중 
		System.out.println(); 
		
		
	}
	
	public Car createCar(int num) { //매개변수로 전달 받음 정수값에 따라 Car , Tesla, Spark 객체를 만들어 반환 
		
		Car result = null ; 
		
		switch(num) {
		case 1 : result = new Car(); break ;
		case 2 : result = new Tesla(); break ;
		case 3 : result = new Spark(); break ;
		}
		return result ;
	}
	
	//다형성 (업 캐스팅)을 이용한 매개변수 사용법 
	public void ex2() {
		
		Tesla t = new Tesla("전기모터","전기",4,1000200);
		
		Spark s = new Spark("경차엔지","휘발유",4 ,0.7);
		
		Car c = new Car("경유 엔진","경우",12); 
		
		printCar(t);
		printCar(s);
		printCar(c);
		
		System.out.println("=========다형성을 이용한 반환형 사용법=============");
		
		//다형성을 이용한 반환형 사용법
		//Car car = { new Car() , new Tesla() , new Spark() } ;
		
		Car[] arr = {createCar(1), createCar(2) , createCar(3) } ;
		            //Car         Car(Tesla)      Car(Spark) 
		
		//객체가 어떤 타입(자료형)인지 검사
		//instanceof 연산자 : 객체의 자료형을 검사하는 연산자 
		//-> 참조하는 객체가 특정 자료형이거나 상속관계인지 확인 
		System.out.println(arr[1] instanceof Tesla);//true 본인임
		System.out.println(arr[1] instanceof Spark); // false -> Car 타입인척 하는 Tesla라서 스파크와 상관없음
		System.out.println(arr[1] instanceof Car); // true 부모 Car 자식 스파크
		
		
	}
	
	//다운캐시팅
	public void ex3() {
	//부모타입 참조변수가 자식객체를 참조하는 기술 (업캐스팅)이 적용된 상태세서만 진행할 수 있다 .
	//부모타입을 자식타입으로 강제 형변환해서 자식객체의 본래 필드 , 메서드를 사용 가능하게 한다.
		
		Car c1 = new Tesla("전기모터","전기",4,203020);
		//업캐스팅 상태 테슬라라는 자식객체가 카라는 부모객체인척 하는중 
		
		System.out.println(((Tesla)c1).getBatteryCapacity());
		//주의 할 것 "." 연산자 테슬라 형변환하는 연산자보다 우선순위가 높기 떄문에 ((테슬라)c1)을 묶어줘야함
		
		Tesla t1 = (Tesla)c1 ;  // -> c1 강제 형변환한 걸 테슬라 t1 에 대입 -> 테슬라 필드 사용가능
		
		System.out.println(t1.getBatteryCapacity());
		
	}
	
	public void ex4() { // 다운캐스팅 할때의 주의사항
		Car c1 = new Tesla();
		//tesla 객체를 만들어 Car 타입 참조변수 c1에 담음
		
//		Spark s1 = (Spark)c1; // 이것이 문제 잘못된 다운캐스팅을 해도 컴파일 에러가 나지 않음 
		//classCastException 형변환 에러 
		
		//해결법 instanceof 와 같이 사용
		//예외처리 
		if(c1 instanceof Spark) { // c1 이 스파크와 상속관계인가?  
			//맞다면 그떄 형변환 
			Spark s1 = (Spark)c1 ;
			System.out.println("성공");
			
		}else {
			System.out.println("실패 / 상속관계 아님");
		}
		
		
	}
	
	
	
	public void ex5() { //바인딩
		//실제 실행할 메소드 코드와 호출하는 코드를 연결시키는 것 
		
		Car c1 = new Car("경유엔진","경우",8);
		
		System.out.println(c1.toString()); //정적 바인딩 
		//Car객체에 있는 tostring() 메서드를 호출 
		//프로그램 실행전 컴파일러는 toString 메서드가 Car에 있는걸로 인식해서
		//c1.toString 호출코드 와 car toString() 메소드 코드를 연결 -> 정적 바인딩
		
		//다형성 적용시 바인딩 
		
		Car c2 = new Spark("경차엔진","휘발유",2,0.1);
		//업캐스팅 적용 -> 부모 부분만 참조 가능 상태 
		
		System.out.println(c2.toString());
		//참조변수 c2가 Car 타입이므로 
		//toString() 호출코드와 Car toString() 메소드 코드를 연결 
		//실행해보면 자식(스파크)의 toString 이 호출됨 
		//컴파일 시에는 부모(카)와 바인딩 == 정적 바인딩
		//실행 시 에는 정적바인딩 보다 자식(스파크)에서 오버라이딩된 
		//toString() 메서드가 우선시되어 스파크의 메서드와 바인딩됨 -> 동적 바인딩 
		
		
	}
	

}
