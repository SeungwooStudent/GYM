import java.util.LinkedList;

public class GymManager {
	LinkedList<Member> members = new LinkedList<>();
	GymUI gymUI = new GymUI();
	DataBaseManager dbmanager = new DataBaseManager();

	public void addMember(String id, String name, int age, String phon_number, String date) {
		dbmanager.insert(id, name, age, phon_number, date);
	}

	public void selectMemberAll() {
		dbmanager.selectAll();
	}

	public void deleteMember(String deleteMember) {
		dbmanager.delete(deleteMember);

//		for (int i = 0; i < members.size(); i++) {
//			Member member = members.get(i);
//			if (member.getID().equals(deleteMember)) {
//				members.remove(i);
//			}
//		}

	}

	public boolean findMember(String id) {

		for (int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			if (member.getID().equals(id)) {
				return true;
			}
		}
		return false;
	}

	public void changeName(String changeName, String changeMemberIndex) {
		dbmanager.updateName(changeName, changeMemberIndex);
	}

	public void changeAge(int changeAge, String changeMemberIndex) {
		dbmanager.updateAge(changeAge, changeMemberIndex);
	}

	public void changePhonNumber(String changePhoneNumber, String changeMemberIndex) {
//		members.get(findIndex).setPhonNumber(changePhonNumber);
		dbmanager.updatePhoneNumber(changePhoneNumber, changeMemberIndex);
	}

	public void searchMember(String id) {
		dbmanager.select(id);

//		for (int i = 0; i < members.size(); i++) {
//			if (members.get(i).getID().equals(id)) {
//				members.get(i).introduceMyself();
//				return;
//			}
//		}

	}

	public boolean CheckID(String memberId) {
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getID().equals(memberId)) {
				return true;
			}
		}
		return false;
	}

	public void printAll() {
		for (int i = 0; i < members.size(); i++) {
			members.get(i).introduceMyself();
		}
	}

	public boolean isCheckID(String removeID) {
		return dbmanager.isCheckID(removeID);

//		for (int i = 0; i < members.size(); i++) {
//			if (members.get(i).getID().equals(removeID)) {
//				return true;
//			}
//		}
//		return false;
	}

}
