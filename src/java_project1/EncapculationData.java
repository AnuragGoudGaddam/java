package java_project1;

 class Student {
	
	private int rollNo ;
	private String name;
	private int classRoom;
	
	public int getRollNumber() {
		return rollNo;
	}
	public String getStudentName() {
		return name;
	}
	public int getStudentClass() {
		return classRoom;
	}
	
	public void setRollno(int r ) {
		rollNo= r;
		System.out.println(rollNo);
	}
	public void setSName(String n ) {
		name= n;
		System.out.println(name);
	}
	public void setCRoomNo(int c ) {
		classRoom= c;
		System.out.println(classRoom);
	}
	
}

public class EncapculationData {

	public static void main(String[] args) {
		Student s1= new Student();
		s1.setCRoomNo(199);
		s1.setSName("Anurag");
		s1.setRollno(12);
        
	}

}
