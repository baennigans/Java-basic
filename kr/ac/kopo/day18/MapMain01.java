package kr.ac.kopo.day18;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
	MAP : key, value 쌍으로 이루어진 데이터 집합
	    : 순서X, key에 대한 중복X
	구현클래스
	  - HashMap
	  - TreeMap
	  
	메소드
	  - put(k,v)    	: 데이터 입력
	  - get(k)			: key쌍에 해당 value 반환
	  - containsKey(k)	: 해당 key 존재여부 판단
	  - remove(k)		: key에 해당되는 value 삭제
*/

public class MapMain01 {
	
	/*
 	비밀번호 변경서비스 구현
 	 - 특정 아이디에 대한 패스워드 변경을 목적
 	 - 중복 아이디가 존재X
 	 - 아이디 : key, 패스워드 : value
	*/

	public static void main(String[] args) {
		
		Map<String, String> members = new HashMap<String, String>();
		members.put("aaa", "1111");
		members.put("bbb", "2222");
		members.put("ccc", "3333");
		members.put("ddd", "4444");
		
		System.out.println("전체회원수 : "+members.size());
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\n*** 비밀번호 변경서비스 ***");
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		if(!members.containsKey(id)) {
			System.out.println("입력하신 [ "+id+" ] 는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		
		System.out.print("현재 패스워드를 입력하세요 : ");
		String pw = sc.nextLine();
		
		if(!members.get(id).equals(pw)) {
			System.out.println("입력한 패스워드가 올바르지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		
		System.out.print("변경할 새로운 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		members.put(id, newPassword);
		System.out.println("패스워드 변경이 완료되었습니다.");
		
		
		System.out.println("\n< 전체회원목록 >");
		System.out.println("---------------");
		System.out.println("아이디\t패스워드");
		System.out.println("---------------");
		
		Set<Entry<String, String>> entrySet = members.entrySet();
		for(Entry<String, String> e : entrySet) {
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
		
		Set<String> keys = members.keySet();
		for(String key : keys) {
			System.out.println(key+"\t"+members.get(key));
		}
		
		System.out.println("---------------");
	}
}
