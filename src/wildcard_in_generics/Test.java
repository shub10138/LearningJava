package wildcard_in_generics;

import java.util.ArrayList;

public class Test {
	// Students is parent of EnggStudents and MgmtStudents
	// But ArrayList<Students> is not a parent/ancestor of ArrayList<EnggStudents>
	// and ArrayList<MgmtStudenst>
	static void printStudent(ArrayList<? extends Students> al) {
		for (Students s : al) {
			s.print();
		}
	}

	public static void main(String args[]) {
		ArrayList<EnggStudents> al1 = new ArrayList<>();
		al1.add(new EnggStudents());
		al1.add(new EnggStudents());
		ArrayList<MgmtStudents> al2 = new ArrayList<>();
		al2.add(new MgmtStudents());
		al2.add(new MgmtStudents());

		printStudent(al1);
		printStudent(al2);
	}
}
