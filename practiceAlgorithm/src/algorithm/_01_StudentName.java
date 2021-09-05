package algorithm;

import java.util.ArrayList;

//문제) 학생정보들을 저장하고, 학생이름으로 검색했을 때 학번을 출력하는 프로그램 작성.

// Student 클래스 생성
// String name, no를 가짐 (이름과 학번)

// 학생들을 ArrayList에 저장한 이후,
// 계속 검색을 하겠다면 y -> 반복
// 종료하겠다면 n -> 프로그램 종료

// 학생 이름이 있는 경우 그 학생의 학번을 출력
// 학생 이름이 없으면, 없는 학생이름이라고 출력

class Student {
	
	private String name;
	private String no;
	
	public Student(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
}

public class _01_StudentName {

	public static void main(String[] args) {
		
		Student st1 = new Student("손오공", "1682");
		Student st2 = new Student("저팔계", "1772");
		Student st3 = new Student("사오정", "1813");
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("gg");
		list.add("gi");
		
		System.out.println(list);
		
	}

}
