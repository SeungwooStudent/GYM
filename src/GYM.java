import java.util.LinkedList;
import java.util.Scanner;

public class GYM {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		GymManager manager = new GymManager();
		LinkedList<Member> members = new LinkedList<>();

		GymUI gymUI = new GymUI();

		int age = 0;
		String name = null;
		String phonNumber = null;
		String memberID = null;
		boolean isFind = true;
		while (isFind) {
			gymUI.MemberManagement();
			int choice = sc.nextInt();
			if (choice == 1) {
				// 회원등록
				while (isFind) {
					try {
						gymUI.memberID();
						memberID = sc.next();
						boolean checkid = manager.CheckID(memberID);
						if (checkid) {
							Exception e = new Exception("중복된ID입니다 다시시도해주세요");
							throw e;
						}
						isFind = false;
					} catch (Exception e) {
						System.out.println(e.getMessage());
						sc = new Scanner(System.in);
					}
				}
				isFind = true;

				gymUI.memberAge();
				age = sc.nextInt();
				gymUI.memberName();
				name = sc.next();
				gymUI.memberPhonNumber();
				phonNumber = sc.next();

				Member member = new Member(memberID, age, name, phonNumber);
				manager.addMember(member);
				gymUI.Addmember();
				isFind = true;
			} else if (choice == 2) {
				// 회원삭제

				gymUI.memberRemoveID();
				String removeID = sc.next();
				boolean ischeckID = manager.isCheckID(removeID);
				if (!ischeckID) {
					gymUI.nonID();
				}
				if (ischeckID) {
					manager.deleteMember(removeID);
					gymUI.removeComplete();
				}

			} else if (choice == 3) {
				// 회원수정
				gymUI.changeMemberInfor();
				String changePhonNumber = sc.next();
				int changeMemberIndex = manager.findMember(changePhonNumber);
				if (changeMemberIndex >= 0) {
					gymUI.memberInforMation();
					choice = sc.nextInt();
					if (choice == 1) {
						// 회원 이름변경
						gymUI.changeNameInput();
						String changeName = sc.next();
						manager.changeName(changeMemberIndex, changeName);
						gymUI.changecomplete();
					} else if (choice == 2) {
						// 회원 나이변경
						gymUI.changeAgeInput();
						int changeAge = sc.nextInt();
						manager.changeAge(changeMemberIndex, changeAge);
						gymUI.changecomplete();
					} else if (choice == 3) {
						// 회원 전화번호변경
						gymUI.changephonNumberInput();
						String changeMemberPhonNumber = sc.next();
						manager.changePhonNumber(changeMemberIndex, changeMemberPhonNumber);
						gymUI.changecomplete();
					}
				} else {
					gymUI.nonID();
				}

			} else if (choice == 4) {
				// 회원검색
				gymUI.searchPhonNumber();
				String searchphonNumber = sc.next();
				manager.searchMember(searchphonNumber);
			} else if (choice == 5) {
				// 회원출력
				manager.printAll();
			} else if (choice == 6) {
				// 프로그램 종료
				break;
			}

		}

	}
}
