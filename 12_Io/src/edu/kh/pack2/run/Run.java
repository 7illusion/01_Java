package edu.kh.pack2.run;

import edu.kh.pack2.model.service.ByteService;

public class Run {

	public static void main(String[] args) {
		/*
		 * //불편성(Immutable)의 String String str1 = "hello"; // 두개의 str1 str2 는 해쉬코드가 똑같다
		 * ->주소값이 같음 String str2 = "hello";
		 * 
		 * 
		 * str2 = str2 +"world" ; //해쉬코드가 바뀌고 주소값 또한 변한다
		 * 
		 * //가변성(Mutable)의 StringBuilder , StringBuffer StringBuilder sb = new
		 * StringBuilder(); sb.append("hello world"); sb.append("12345");
		 * System.out.println(sb.hashCode()); 해쉬코드는 같고 주소값도 같지만 안에 있는 내용은 변경됨
		 */
		
		ByteService service = new ByteService();
		
//		service.fileByteOutput();
	
//		service.bufferedFileByteOutput();
//		service.fileByteInput2();
//		service.bufferedFileByteInput();
//		service.readProperties();
		service.fileCopy();
	}
	
}
