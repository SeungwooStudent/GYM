import java.util.LinkedList;

public class GymManager {
	LinkedList<Member> members = new LinkedList<>();
	GymUI gymUI = new GymUI();

	public void addMember(Member member) {
		members.add(member);
	}

	public void deleteMember(String removeMamber) {
		for (int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			if (member.getID().equals(removeMamber)) {
				members.remove(i);
			}
		}
	}

	public int findMember(String phonNumberTest) {
		for (int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			if (member.getID().equals(phonNumberTest)) {
				return i;
			}
		}
		return -1;
	}

	public void changeName(int findIndex, String changeName) {
		members.get(findIndex).setName(changeName);
	}

	public void changeAge(int findIndex, int changeAge) {
		members.get(findIndex).setAge(changeAge);
	}

	public void changePhonNumber(int findIndex, String changePhonNumber) {
		members.get(findIndex).setPhonNumber(changePhonNumber);
	}

	public void searchMember(String phonNumber) {
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getID().equals(phonNumber)) {
				members.get(i).introduceMyself();
				return;
			}
		}
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
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getID().equals(removeID)) {
				return true;
			}
		}
		return false;
	}

}
