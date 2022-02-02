import java.text.SimpleDateFormat;
import java.util.Date;

public class Member {

	String ID; //primary key
	int age;
	String name;
	String phonNumber;
	Date gymEnrollment;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonNumber() {
		return phonNumber;
	}

	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}

	public Date getGymEnrollment() {
		return gymEnrollment;
	}

	public void setGymEnrollment(Date gymEnrollment) {
		this.gymEnrollment = gymEnrollment;
	}

	Member(String ID, int age, String name, String phonNumber) {
		this.ID = ID;
		this.age = age;
		this.name = name;
		this.phonNumber = phonNumber;
		gymEnrollment = new Date();
	}

	public void introduceMyself() {
		System.out.println("회원님의 ID는 " + ID);
		System.out.println("내 이름은 " + name);
		System.out.println("내 나이는 " + age);
		System.out.println("전화번호는 " + phonNumber);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("가입날짜는" + df.format(gymEnrollment));
		System.out.println();

	}

}
