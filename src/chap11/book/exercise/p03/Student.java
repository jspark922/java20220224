package chap11.book.exercise.p03;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	// 여기서 코드를 작성하세요.

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentNum == null) ? 0 : studentNum.hashCode());
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
		Student other = (Student) obj;
		if (studentNum == null) {
			if (other.studentNum != null)
				return false;
		} else if (!studentNum.equals(other.studentNum))
			return false;
		return true;
	}
	
}
