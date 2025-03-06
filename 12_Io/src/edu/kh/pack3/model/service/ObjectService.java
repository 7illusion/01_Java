package edu.kh.pack3.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.kh.pack3.model.dto.Member;

public class ObjectService {
	/*
	 * objectInputStream / objectOutputStream
	 * 
	 * java객체를 입출력 할떄 
	 * 사용하는 바이트 기반 "보조" 스트림
	 * (보조 스트림은 단독 사용 불가능!)
	 * 
	 * **직렬화 (Serializable)**
	 * -객체를 직렬(직선)형태로 변환
	 * 
	 * -직렬화란 객체의 상태(필드값)를 바이트 스트림으로 변환하는 과정
	 * 이를 통해 객체는 메모리에서만 존재하는 것이 아니라 
	 * 파일로 저장되거나 네트워크를 통해 전송될 수 있음
	 * 
	 * -역직렬화는 바이트 스트림을 다시 객체로 복원하는 과정
	 * 즉. 저장되거나 전송된 데이터를 원래의 객체 형태로 되돌리는 작업
	 * 
	 * */

	
	/**
	 * 객체를 외부 파일로 출력 
	 * 자바프로그램 내부 -> 외부 출력
	 * 직렬화 필요 
	 */
	public void objectOutput() {
		//스트림 참조변수 선언 
		FileOutputStream fos = null ; // 기반 스트림 
		ObjectOutputStream oos = null ; //객체 출력용 보조 스트림
		
		try {
			//dat 는 데이터를 담고 있는 파일을 나타내는 확장자 만들어 줄거임
			fos = new FileOutputStream("/io_test/20250305/Member.dat");
			
			oos = new ObjectOutputStream(fos);
			
			//Member 객체 하나 생성
			Member member = new Member("member01","pass01","김희원",22);
			
			//objectOutputStream 이용해서 Member 객체를 출력
			oos.writeObject(member); //member 객체를 연결된 경로의 파일에 쓰겠다 (출력)
			//-> Exception 발생 
			//직렬화가 되지 않았기 떄문
			//implements Serializable  해줘야함  Member 클래스 에서 
			
			System.out.println("회원 데이터 출력 완료");
			
		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			try {
				if(oos != null)oos.close();
			} catch (Exception e2) {
			
				e2.printStackTrace();
			}
			
		}
		
	}
	
	/**
	 * 외부 파일로 부터 객체 입력 받기
	 * 외부 -> 내부 역직렬화가 필요함
	 * 
	 */
	public void objectInput() {
		//스트림 참조 변수 선언
		
		FileInputStream fis = null ;
		ObjectInputStream ois = null ;
		
		try {
			fis = new FileInputStream("/io_test/20250305/Member.dat");
			ois = new ObjectInputStream(fis);
			
			//스트림을 이용해서 파일에 작성된
			//직렬화된 Member 객체를 읽어
			//역직렬화를 수행하여 정상적인 Member 객체로 변경
			
			//readobject 는 직렬화된 객체를 읽어와 역직렬화  
			
		Member member = (Member)ois.readObject(); // 다운 캐스팅 Member 객체로
		System.out.println(member);
			
		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			try {
				if(ois != null)ois.close();
			} catch (Exception e2) {
				e2.printStackTrace();

			}
			
		}
	}
	
}
