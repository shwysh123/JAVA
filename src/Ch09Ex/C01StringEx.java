package Ch09Ex;

class Profile {
	private String name;
	private String addr;
	private String job;
	private String major;

	// 생성자
	// 1.디폴트생성자 삽입
	public Profile() {
	}

	// 2.모든 인자를 받는 생성자
	public Profile(String name, String addr, String job, String major) {
		super();
		this.name = name;
		this.addr = addr;
		this.job = job;
		this.major = major;
	}
	// 3.문자열로 인자를 한번에 받아서 , 를 기준으로 잘라내어 각 속성에 저장
	// "홍길동,대구,프로그래머,컴퓨터공학"-> [홍길동,대구,프로그래머,컴퓨터공학]

	public Profile(String args) {
		args=args.trim();//앞뒤공백제거
		String arr[] = args.split(",");//,기준으로 잘라내기
		this.name=arr[0];
		this.addr=arr[1];
		this.job=arr[2];
		this.major=arr[3];
	}

	// toString() 재정의
	@Override
	public String toString() {
		return "Profile [name="+name+","+"addr="+addr+","+"job="+job+","+"major="+major+"]";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	boolean isContain(String findstr) {
	findstr = findstr.trim();

	if(this.name.contains(findstr))
		return true;
	else if(this.addr.contains(findstr))
		return true;
	else if(this.job.contains(findstr))
		return true;
	else if(this.major.contains(findstr))
		return true;
	else return false;
	}
			
		

		//findstr의 문자열이 각멤버인 name,addr,job,major 중 하나라도 포함되어 있으면 true 리턴
		//아니면 false 리턴
	
	void isEquals(String str) {
		
		//인자로 받은 str문자열을 ","단위로 잘라내어서 각각 나눠진 문자열이
		//name,addr,job,major와 일치하면 true , 하나라도 다른게 있으면 false를 리턴
	}
}


public class C01StringEx {
	public static void main(String[] args) {
		Profile hong = new Profile("홍길동,대구,프로그래머,컴퓨터공학");
	System.out.println(hong.toString());
	
	System.out.println("길동 포함여부 : "+hong.isContain("길동"));
	System.out.println("컴퓨터 포함여부 : "+hong.isContain("컴퓨터"));
	System.out.println("프로필 일치여부 : "+hong.equals("홍길동,대구,프로그래머,컴퓨터공학"));
	System.out.println("프로필 일치여부 : "+hong.equals("홍길동,대구,프로그래머,컴퓨터공학"));
	}
}
