package edu.kh.collection.pack1.run;

import edu.kh.collection.pack1.model.service.StudentService;
import java.util.List;


public class StudentRun {

	public static void main(String[] args) {

		StudentService service = new StudentService();
		service.displayMenu();
		
		
		/*
		 * //=========테스트==================== // Integer 는 이미 정렬을 하고 있음 comparable을 상속받아
		 * compareTo List<Integer> numberList = new ArrayList<Integer>();
		 * numberList.add(5); numberList.add(2); numberList.add(1); numberList.add(8);
		 * 
		 * //숫자 리스트를 정렬 Collections.sort(numberList); //정렬이됨
		 * System.out.println(numberList);
		 */
	}

}
