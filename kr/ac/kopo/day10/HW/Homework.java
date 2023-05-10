package kr.ac.kopo.day10.HW;

import java.util.Scanner;

public class Homework {

	
	Scanner sc = new Scanner(System.in);
	
	//하나의 문자 입력받아서 반환
	char getChar(String msg) {
		System.out.print(msg);
		char c = sc.nextLine().charAt(0);
		return c;
	}
	
	
	//하나의 정수 입력받아서 반환
	int getInt(String msg) {
		System.out.print(msg);
		int i = sc.nextInt();
		return i;
	}
	
	
	//문자열을 입력받아서 반환
	String getString(String msg) {
		System.out.print(msg);
		String s = sc.nextLine();
		return s;
	}
	
	
	//1.전달받은 문자가 대문자면 true 반환
	boolean isUpperChar(char c) {
		boolean bool;
		if(c>= 'A' && c<= 'Z') {
			bool=true;
		}else {
			bool=false;
		}
		return bool;
	}
	
	
	//2.전달받은 문자가 소문자면 true 반환
	boolean isLowerChar(char c) {
		boolean bool;
		if(c>=97 && c<=122) {
			bool=true;
		}else {
			bool=false;
		}
		return bool;
	}
	
	
	//3.전달받은 두개의 정수 중 큰수를 반환
	int max(int i, int j) {
		int num = i >= j ? i : j;
		return num;
	}
	
	
	//4.전달받은 두개의 정수 중 작은수를 반환
	int min(int i, int j) {
		int num = i <= j ? i : j;
		return num;
	}
	
	
	//5.전달받은 문자열을 거꾸로 반환
	String reverseString(String str) {
		String reverse = "";
		for(int i=0; i<str.length(); i++) {
			reverse += str.charAt(str.length()-(i+1));
		}
		return reverse;
	}
	
	
	//6.전달받은 문자열을 대문자로 변경해서 반환
	String toUpperString(String str) {
		String upper = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				upper += (char)(str.charAt(i)-32);
			} else {
				upper += str.charAt(i);
			}
		}
		return upper;
	}
	
	
	//7.전달받은 문자열을 소문자로 변경해서 반환
	String toLowerString(String str) {
		String lower = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				lower += (char)(str.charAt(i)+32);
			}else {
				lower += str.charAt(i);
			}
		}
		return lower;
	}
	
	
	//8.전달받은 두개의 문자열의 크기를 비교해서 반환
	int compareTo(String str, String str2) {
		int length = str.length() < str2.length() ? str.length() : str2.length();
		int compare = 0;
		int i = 0;
		while(i < length) {
			if(str.charAt(i)==str2.charAt(i)){
				i++;
			}else {
				compare = str.charAt(i)-str2.charAt(i);
				break;
			}
		}
		return compare;
	}
	
	
	//9.검색한 문자열로 끝나는지 여부판단해서 반환
	boolean endsWith(String str, String str2) {
		boolean bool = true;
		int length = str.length()-str2.length();
		for(int i=0; i<str2.length(); i++) {
			if(str.charAt(length+i)==str2.charAt(i)) {
				bool = true;				
			}else {
				bool = false;
				break;
			}
		}
		return bool;
	}
	
	
	//10.첫번째 문자열에서 검색한 두번째 문자열의 위치를 찾아서 반환
	int indexOf(String str, String sub) {
		int count = 0;
		int location = 0;
		for(int i=0; i<=str.length()-sub.length(); i++) {
			if(str.charAt(i)==sub.charAt(0)) {
				for(int j=0; j<sub.length(); j++) {
					if(str.charAt(i+j)==sub.charAt(j)) {
						count++;
					}else {
						count=0;
					}
					
					if(count==sub.length()) {
						location = i;
						break;
					}
				}
			}
		}
		return location;
	}
	
	
	//11.문자열에서 검색한 문자의 개수를 반환
	int checkChar(String strData, char ch) {
		int count = 0;
		for(int i=0; i<strData.length(); i++) {
			if(strData.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}
	
	
	//12.문자열에서 특정한 문자만 제거해서 반환
	String removeChar(String oriStr, char delChar) {
		String remove= "";
		for(int i=0; i<oriStr.length(); i++) {
			if(oriStr.charAt(i)!=delChar) {
				remove += oriStr.charAt(i);
			}
		}
		return remove;
	}
}