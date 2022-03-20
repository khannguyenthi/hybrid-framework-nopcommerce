package javaOOP;

public class Topic_01_Class_Object_Student {
  public int IdStudent;
  private String Name;
  private float Score;
  private float ScorePractice; 
  
	protected final int getIdStudent() {
	return IdStudent;
}

protected final void setIdStudent(int idStudent) {
	IdStudent = idStudent;
}

protected final String getName() {
	return Name;
}

protected final void setName(String name) {
	Name = name;
}

protected final float getScore() {
	return Score;
}

protected final void setScore(float score) {
	Score = score;
}

protected final float getScorePractice() {
	return ScorePractice;
}

protected final void setScorePractice(float scorePractice) {
	ScorePractice = scorePractice;
}

private Float getAveragePoint() {
	return (this.Score + this.ScorePractice * 2) / 3;
}

private void showStudentInfor() {
	System.out.println("*****************************");
	System.out.println("Stdudent ID" + getIdStudent());
	System.out.println("Stdudent Name" + getName());
	System.out.println("Stdudent score" + getScore());
	System.out.println("Stdudent practice score" + getScorePractice());
	System.out.println("Stdudent avage score" + getAveragePoint());
	System.out.println("*****************************");
	
}

	public static void main(String[] args) {
		Topic_01_Class_Object_Student firstStudent = new Topic_01_Class_Object_Student();
		firstStudent.setIdStudent(123123);
		firstStudent.setName("Lam");
		firstStudent.setScore(9.4f);
		firstStudent.setScorePractice(9.4f);
		firstStudent.getAveragePoint();
		firstStudent.showStudentInfor();

		Topic_01_Class_Object_Student secondStudent = new Topic_01_Class_Object_Student();
		secondStudent.setIdStudent(123123);
		secondStudent.setName("L2am");
		secondStudent.setScore(91.4f);
		secondStudent.setScorePractice(29.4f);
		secondStudent.getAveragePoint();
		secondStudent.showStudentInfor();
		
	}

}
