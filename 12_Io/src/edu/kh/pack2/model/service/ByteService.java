package edu.kh.pack2.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class ByteService {
	
	/*
	 * 스트림(Stream) : 데이터가 이동하는 통로 기본적으로 한 방향으로 흐름
	 * 
	 * Byte 기반 스트림
	 * - 1byte 단위로 데이터를 입/출력하는 스트림
	 * - 문자열,이미지,영상,오디오,pdf 등 모든것을 입/출력 할 수 있음
	 *  (단, 통로가 좁아 속도가 느림
	 *  char 형 문자같은 경우 깨질 우려가 있음 
	 * 
	 * */

	//IO 관련된 코드 IOException이 발생될 가능성이 높다 
	//IO 관련 코드는 거의 모든 메서드가 throw IOException
	// -> IOException 예외 처리 구문을 작성하는것은 필수 
	
	/**
	 * 바이트 기반 스티림을 이용한 파일 출력 
	 * + 데이터 출력 
	 */
	public void fileByteOutput() {
		
		FileOutputStream fos = null ; // 바이트 기반 클래스 중 outputstream을 상속받은 자식 클래스 
		//만약 파일이 존재하지 않으면 자동으로 생성하지만 
        //이미 파일이 존재하는 경우 파일을 덮어쓰는 단점이 있음
		
		try {
			//new fileoutputstream
	    ///	경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
		/// 출력 스트림에 연결된 파일이 존재하지 않으면 자동생성
		///단 폴더는 생성되지 않음
		///->기존 파일이 존재하면 내용을 덮어쓰기함
		///	
	        fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트.txt");
	        
	        StringBuilder sb = new StringBuilder();
	        sb.append("hello world\n");
	        sb.append("4446677\n");
	        sb.append("*****\n");
	        sb.append("glglqkftk\n");
	        sb.append("tjstodslaqkfkqkfakt\n");
	        sb.append("한글자");
	        
	        //출력방법 1 : 한 글자(2byte)씩 파일로 출력
	        
	        //stringBuilder -> String 변환 -> charAt()	 -> char로 변환   
	        String content = sb.toString();
	        
	        for (int i = 0; i < content.length(); i++) {
				char ch = content.charAt(i);
				fos.write(ch); // 1byte 출력 스트림이 연결된 파일에 ch 쓰기 
			}
	        long starTime = System.nanoTime();
	        
	        //-> 2byte 범주의 문자(영어,숫자,기본특수문자 제외)는 바이트 기반 스트림 통과시 데이터 손실이 발생-> 글자 꺠짐 일어남
	        //출력방법 2 : String을 byte[] 변환 후 출력
	        fos.write(content.getBytes()); // 바이트[] 로 만들어 반환 
	        
	        long endTime = System.nanoTime();
	        System.out.println("수행시간 : " + (endTime - starTime)+"ns"); // 93700
	        
	        
	        fos.flush(); //스티림 안에 남아있는 모든 데이터를 모두 밀어냄 
	        //flush는 outputstream에서는 선택사항이다 
	        System.out.println("출력완료");
	        
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally { ///try 예외 발생 여부 관계 없이 무조건 수행 
	    	//사용완료한 스트림을 제거(닫기,메모리 반환) 하는 코드작성
			//메모리 누수 방지
			try {
				if(fos != null) fos.close(); //스트림이 정상 생성된 경우 스트림을 닫음 예외처리 해야할 필요 있음 ->flush 필요 없어짐
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}


	/**
	 * 버퍼를 이용한 파일 출력
	 * + bufferedOutputstream 보조 스트림 이용
	 */
	public void bufferedFileByteOutput() {
		/*
		 * 버퍼란 
		 * 데이터를 모아두는 공간 ,마치 바구니 같은 메모리 공간
		 * 
		 * bufferedOutputStream      /      bufferedInputStream
		 * 출력용 보조 스트림(바이트) / 입력용 보조 스트림(바이트)
		 * 1바이트씩 데이터를 입출력 ->통로가 좁아서 데이터 입출력시 속도가 느림 
		 * 
		 * ->보조스트림 이용 시 버퍼에 입출력할 내용을 모아서 한번에 입출력
		 * 내부 버퍼에 데이터를 모았다가 일정 크기가 되면 한 번에 출력 
		 * -> 기반 스트림을 이용하는 횟수가 적어짐
		 * -> 성능 ,시간 효율 상승 
		 * 
		 * 
		 * */
		
		FileOutputStream fos = null ; //기반 스트림 참조변수 
		BufferedOutputStream bos = null ; //보조 스트림임
		
		try {
			
			fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트_Buffered.txt");
			//기반 스트림 fos를 이용해 보조스트림 bos를 생성 
			
			bos = new BufferedOutputStream(fos); // 기반 스트림을 받아 보조 스트림 생성 
			
	        StringBuilder sb = new StringBuilder();
	        sb.append("hello world\n");
	        sb.append("4446677\n");
	        sb.append("*****\n");
	        sb.append("glglqkftk\n");
	        sb.append("tjstodslaqkfkqkfakt\n");
	        sb.append("한글자");
			
	        String content = sb.toString();
	        
	        long starTime = System.nanoTime();
	        
	        bos.write(content.getBytes()); //buffer에 저장(기록을 하는것이 아님) flush()가 필수
	        
	        long endTime = System.nanoTime();
	        System.out.println("수행시간 : " + (endTime - starTime)+"ns");//23400ns
	        
	        bos.flush(); // 스트림 안에 남아 있는 데이터를 밀어냄  
	                    // 버퍼 내용을 장제로 파일에 기록
	                   //buffered 사용 할때는 필수임 
	        
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
			if(bos != null)bos.close();
			//보조스트림 클로오즈 할 시 기반 스트림도 같이 닫힘 
			}catch (Exception e) {

			}
		}
	}

	
	/**
	 * 바이트 기반 파일 입력 
	 */
	public void fileByteInput() {
		//파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null ;
		
		try {
			fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			//inputStream 할때는 파일이 존재해야함 그래야지 예외가 발생 안함 수동으로 만들기
			
			//방법1 . 파일 내부 내용을 1byte 씩 끊어서 가져오기 
			//-> 2바이트 범주의 글자들은 꺠지는 문제 발생함 
			
			//byte -> 자바에서 정수형
			//다루기 힘들기 때문에 정수형 기본형인 int로 변환해서 사용
			
			int value = 0; //읽어온 바이트값 저장할 변수
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				value = fis.read(); //1byte씪 끊어서 읽어오기
				//단 ,더이상 읽어 올 값이 없으면 -1 반환 
				
				if(value == -1) break ;// 다 읽어왔으면 반복 멈춤 
				
				sb.append((char)value); //char로 강제 형변환해서 글자 형태로 sb 추가 
				
			}
			
			System.out.println(sb.toString()); //읽어온 내용 콘솔에 출력 
			
			
			//inputStream은 flush 없음 출력스트림에만 있는거임 
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(fis != null) fis.close();
			} catch (Exception e ) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void fileByteInput2() {
		FileInputStream fis = null ;
		
		try {
			fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			//방법2. 파일에 저장된 모든 바이트 값을 다 읽어와 바이트배열 형태로 반환받기 
			
			byte[] bytes = fis.readAllBytes(); //배열안에 있는 바이트를 읽어옴
			
			String content = new String(bytes);
			
			System.out.println(content);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(fis != null) fis.close();
			} catch (Exception e ) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	/**
	 * 보조 스트림을 이용한 성능 향상
	 * InputStream의 경우 외부 파일의 데이터를 읽어올 떄 사용
	 * ->파일의 크기가 작으면 성능이점이 크게 눈에 띄지는 않는다 
	 */
	public void bufferedFileByteInput() {
		FileInputStream fis =null; // 메인 스트림
		
		BufferedInputStream bis = null ;//보조 스트림 
		
		try {
		    fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
		    
		    bis = new BufferedInputStream(fis);
			
		    byte[] bytes = bis.readAllBytes();
		    
		    String content = new String(bytes);
		    
		    System.out.println(content);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis != null)bis.close(); //보조만 클로오즈 해도 기반 스트림도 닫힘 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

	/**
	 * 외부에 있는 config.properties 파일을 입출력하기 
	 * ->Map 계열인 properties 클래스 사용하기 
	 */
	public void readProperties() {
		//properties 클래스는 hashtable 의 하위 클래스로 Map 계열 클래스 중 하나
		//Key Value 모두 String 타입으로 이루어짐 
		Properties properties = new Properties();
		
		FileInputStream fis = null ;
		
		FileOutputStream fos = null ; // 바이트 기반 파일 출력 스트림 
		
		try {
			//읽기
			fis = new FileInputStream("/io_test/20250305/config.properties");
			properties.load(fis); //파일을 로드 load 
			
			//properties.getproperty(key) : key에 대응되는 value 반환 없는 값을 하면 null 반환 
			System.out.println("username : " + properties.getProperty("username"));
			System.out.println("password : " + properties.getProperty("password"));
			System.out.println("language : " + properties.getProperty("language"));
			
			//쓰기
			fos = new FileOutputStream("/io_test/20250305/config.properties");
			
			properties.setProperty("theme", "dark"); // 속성,설정을 추가한것 
			//theme=dark
			
			properties.store(fos, "update"); //위에 추가한것을 저장 해준거임 커밋도 같이 넣어줌 
			
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			try {
				if(fis != null)fis.close();
				if(fos != null)fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	/**
	 * 파일복사
	 * 파일경로를 입력받아
	 * 지정된 파일과 같은 경로에 복사된 파일 출력하기 
	 * 
	 * 1)입력된 경로에 파일이 있는지 검사
	 * 2)있으면 파일 내용을 모두 읽어오기 : FileInputStream + bufferedInputStream
	 * 3)읽어온 내용을 같은 경로 위치에 "파일명_copy.확장자" 이름으로 출력
	 *  : FileOutputStream + bufferedOut.....
	 *  
	 *  + Scanner 대신 bufferReader (문자열 입력용 스트림) 이용
	 *  bufferedReader는 보조스트림이라 단독사용 불가 기반 스트림 있어야함 InputStreamReader 
	 */
	public void fileCopy() {
		//스트림 참조변수 선언 
		BufferedReader br = null ; //문자열 입력용 스트림 
		
		FileInputStream fis = null;
		
		BufferedInputStream bis = null ;
		
		FileOutputStream fos = null ;
		
		BufferedOutputStream bos = null ;
		
		try {  
		//키보드 입력을 받기 위한 스트림 객체 생성 
		br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("파일 경로 입력");
        String target = br.readLine(); // 입력된 한 줄 읽어오기 파일 경로를 입력해줄거임
		
        //해당 경로에 파일이 존재하는지 확인
        File file = new File(target);
        
        if(!file.exists()) {//해당 경로에 파일이 존재하지 않으면 프린트 구문 출력 
        	System.out.println("해당 경로에 파일이 존재하지 않습니다.");
        	return ; //출력해주고 아래는 실행 안해줌 
        }

        //해당 경로에 파일이 존재하면
        //target이 가르키는 파일을 입력 받을 수 있도록 
        //입력용 스트림 생성 
        fis = new FileInputStream(target); 
        bis = new BufferedInputStream(fis);
			
        //입력용 스트림을 이용해서 target 파일의 내용 입력받기
        byte[] bytes = bis.readAllBytes(); // 바이트 배열로 받아서 저장
        
        //===============================================
        //출력할 파일의 경로 + copy가 붙은 파일 이름 
        //target : io_test/20250305/노래가사.txt
        //copy: io_test/20250305/노래가사_copy.txt
        
        StringBuilder sb = new StringBuilder();
        sb.append(target); // io_test/20250305/노래가사.txt
        
        //int String.lastindexOf("문자열")
        //- 주어진 문자열이 마지막으로 등장하는 인데스를 찾아 
        //int 값으로 반환. 찾지 못하면 -1 반환
        int insertPoint = target.lastIndexOf(".");
        
        sb.insert(insertPoint, "_copy"); // 22번 inserpoint 인덱스 자리에 _copy 추가
        
        String copy = sb.toString(); //복사할 파일의 경로를 String 변환 
        
        //출력용 스트림 생성 
        fos = new FileOutputStream(copy);//io_test/20250305/노래가사_copy.txt
        bos = new BufferedOutputStream(fos);
        
        //원본에서 읽어온 내용 bytes를 bos를 이용해서 쓰기(출력)
        bos.write(bytes);
        bos.flush(); // 스트림에 남아있는 데이터 모두 밀어내기 
        
        System.out.println("복사완료" + copy);
        
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis != null)bis.close();
				if(br != null)br.close();
				if(bos != null)bos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
}
