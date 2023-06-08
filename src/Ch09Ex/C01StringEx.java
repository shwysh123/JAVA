package Ch09Ex;

class Profile {
	private String name;
	private String addr;
	private String job;
	private String major;

	// ������
	// 1.����Ʈ������ ����
	public Profile() {
	}

	// 2.��� ���ڸ� �޴� ������
	public Profile(String name, String addr, String job, String major) {
		super();
		this.name = name;
		this.addr = addr;
		this.job = job;
		this.major = major;
	}
	// 3.���ڿ��� ���ڸ� �ѹ��� �޾Ƽ� , �� �������� �߶󳻾� �� �Ӽ��� ����
	// "ȫ�浿,�뱸,���α׷���,��ǻ�Ͱ���"-> [ȫ�浿,�뱸,���α׷���,��ǻ�Ͱ���]

	public Profile(String args) {
		args=args.trim();//�յڰ�������
		String arr[] = args.split(",");//,�������� �߶󳻱�
		this.name=arr[0];
		this.addr=arr[1];
		this.job=arr[2];
		this.major=arr[3];
	}

	// toString() ������
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
			
		

		//findstr�� ���ڿ��� ������� name,addr,job,major �� �ϳ��� ���ԵǾ� ������ true ����
		//�ƴϸ� false ����
	
	void isEquals(String str) {
		
		//���ڷ� ���� str���ڿ��� ","������ �߶󳻾 ���� ������ ���ڿ���
		//name,addr,job,major�� ��ġ�ϸ� true , �ϳ��� �ٸ��� ������ false�� ����
	}
}


public class C01StringEx {
	public static void main(String[] args) {
		Profile hong = new Profile("ȫ�浿,�뱸,���α׷���,��ǻ�Ͱ���");
	System.out.println(hong.toString());
	
	System.out.println("�浿 ���Կ��� : "+hong.isContain("�浿"));
	System.out.println("��ǻ�� ���Կ��� : "+hong.isContain("��ǻ��"));
	System.out.println("������ ��ġ���� : "+hong.equals("ȫ�浿,�뱸,���α׷���,��ǻ�Ͱ���"));
	System.out.println("������ ��ġ���� : "+hong.equals("ȫ�浿,�뱸,���α׷���,��ǻ�Ͱ���"));
	}
}
