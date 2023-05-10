package kr.ac.kopo.day18.HW;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MemberHW {

	public static void main(String[] args) {
		
		
		List<Member> member = new LinkedList<Member>();
		
		member.add(new Member("aaa","1111"));
		member.add(new Member("bbb","2222"));
		member.add(new Member("ccc","3333"));
		member.add(new Member("ddd","4444"));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 비밀번호 변경서비스 ***");
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		Member mem = null;
		for(int i=0 ; i<member.size(); i++) {
			if(member.get(i).getId().equals(id)) {
				mem = member.get(i);
				break;
			}
		}
		if(mem==null) {
			System.out.println("입력하신 아이디는 없습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		System.out.print("현재 패스워드를 입력하세요 : ");
		String pw = sc.nextLine();
		
		if(!mem.getPassword().equals(pw)) {
			System.out.println("입력하신 패스워드가 틀렸습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		System.out.print("변경하실 패스워드를 입력하세요 : ");
		String newPw = sc.nextLine();
		
		mem.setPassword(newPw);
		System.out.println("패스워드 변경을 완료하였습니다.");
		
		
		System.out.println("\n< 전체회원목록 >");
		System.out.println("---------------");
		System.out.println("아이디\t패스워드");
		System.out.println("---------------");
		for(Member m : member) {
			System.out.println(m.getId()+"\t"+m.getPassword());
		}
		System.out.println("---------------");
	}
}
