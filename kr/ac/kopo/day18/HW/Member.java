package kr.ac.kopo.day18.HW;

// alt+shift+s + c선택 : 디폴트생성자
//				 o선택 : 매개변수를 가진 생성자
//				 r선택 : getter/setter 메소드
//	  	  	 	 s선택 : toString() 오버라이드
//				 v선택 : 오버라이드 메소드

public class Member {

	private String id;
	private String password;
	
	public Member() {
		
	}
	
	public Member(String id) {
		super();
		this.id = id;
	}
	
	
	public Member(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	
	
}