package Student;

public class StudentManagement {
	public boolean sameGroup(Student s1, Student s2) {
		return (s1.getGroup() == s2.getGroup());
	}

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("Long");
		student1.setGroup("INT22042");
		student1.setId("17020867");
		student1.setemail("tranquanglongplusplus@gmail.com");
		System.out.println(student1.getName());
		student1.getInfo();

		student1 = new Student();
		Student student2 = new Student("Long", "17020867",
				"tranquanglongplusplus@gmail.com");
		student2.getInfo();
		Student student3 = new Student(student1);
		student3.getInfo();

		StudentManagement group = new StudentManagement();
		// System.out.println(group.sameGroup(student1, student2));

		group.st[0] = new Student();
		group.st[1] = new Student();
		group.st[2] = new Student();
		group.st[3] = new Student();
		group.st[4] = new Student();
		group.st[3].setGroup("INT22042");
		group.st[4].setGroup("INT22042");
		group.st[4].setId("001");
		group.removeStudent("001");
		group.studentsByGroup();
	}

	public Student[] st = new Student[100];
	int total = 0;

	public void studentsByGroup() {

		String nameGroup;
		int k = 0;
		this.total = 0;

		while (this.st[k] != null) {

			this.total++;
			k++;
		}
		for (int i = 0; i < total; i++) {
			for (int j = 0; j < total - 1; j++) {
				if (this.st[i].getGroup().compareTo(st[j].getGroup()) > 0) {
					Student group;
					group = st[i];
					st[i] = st[j];
					st[j] = group;
				}
			}
		}
		nameGroup = st[0].getGroup();
		System.out.println(nameGroup);
		for (int i = 0; i < this.total; i++) {
			if (nameGroup != st[i].getGroup()) {
				nameGroup = st[i].getGroup();
				System.out.println(nameGroup);
			}
			st[i].getInfo();
		}
	}

	public void removeStudent(String id) {
		int i = 0;
		int k = 0;
		while (this.st[k] != null) {

			this.total++;
			k++;
		}
		while (i < this.total) {
			if (id == this.st[i].getId()) {
				for (int j = i; j < this.total - 1; j++) {
					st[j] = st[j + 1];
				}

				this.total = this.total - 1;
				st[this.total] = null;
				i--;

			}
			i++;
		}
	}

}
