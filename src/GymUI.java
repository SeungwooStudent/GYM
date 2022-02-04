
public class GymUI {
	public void MemberManagement() {
		System.out.println("원하시는 목록을 선택하세요.");
		System.out.println("1. 회원등록");
		System.out.println("2. 회원삭제");
		System.out.println("3. 회원수정");
		System.out.println("4. 회원검색");
		System.out.println("5. 회원모두출력");
		System.out.println("6. 프로그램 종료");
	}

	public void memberID() {
		System.out.println("회원정보를 입력하세요.");
		System.out.println("1. ID : ");
	}

	public void memberAge() {
		System.out.println("2. 나이 : ");
	}

	public void memberName() {
		System.out.println("3. 이름 : ");
	}

	public void memberPhonNumber() {
		System.out.println("4. 전화번호  : ");
	}

	public void Addmember() {
		System.out.println("정상적으로 등록되었습니다.");
	}

	public void memberRemoveID() {
		System.out.println("삭제하실 회원의 ID를 입력하세요.");
	}

	public void removeComplete() {
		System.out.println("삭제가 완료되었습니다.");
	}

	public void changeMemberInfor() {
		System.out.println("수정하실 회원의 ID를 입력해주세요.");
	}

	public void memberInforMation() {
		System.out.println("수정하실 목록을 선택해주세요.");
		System.out.println("1. 이름");
		System.out.println("2. 나이");
		System.out.println("3. 전화번호");
	}

//	public void nonName() {
//		System.out.println("존재하지 않는 이름입니다.");
//	}

	public void changeNameInput() {
		System.out.println("변경하실 이름을 입력해주세요.");
	}

	public void changeAgeInput() {
		System.out.println("변경하실 나이을 입력해주세요.");
	}

	public void changephonNumberInput() {
		System.out.println("변경하실 ID를 입력해주세요.");
	}

	public void changecomplete() {
		System.out.println("변경되었습니다.");
	}

	public void searchID() {
		System.out.println("찾으실 회원의 ID를 입력해주세요.");
	}
	public void chechID() {
		System.out.println("중복된 ID 입니다 ");
	}
	public void nonID() {
		System.out.println("없는 ID입니다");
	}

}
