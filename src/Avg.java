import collections_java1.Student;

public class Avg {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, 20,30 , 30);
		Student s2 = new Student(2, 22,24 , 26);
		Student s3 = new Student(3, 24,22 , 28);
		
		int maxTotalMarks = 3*100;
		
		int totalS1= s1.t+s1.m+s1.e;
		System.out.println(totalS1);
		
		int totalS2= s2.t+s2.m+s2.e;
		System.out.println(totalS2);
		
		int totalS3= s3.t+s3.m+s3.e;
		System.out.println(totalS3);
		
		double avg1= ((double) totalS1 / 3) ;
		System.out.println(avg1);
		
		double avg2= ((double) totalS2 / maxTotalMarks) * 100;
		System.out.println(avg2);
		
		double avg3=((double) totalS3 / maxTotalMarks) * 100;
		System.out.println(avg3);
		
		double per = ((double)totalS3/maxTotalMarks)*100;
		System.out.println(per);
		
	}

}
//import collections_java1.Student;
//
//public class Avg {
//    public static void main(String[] args) {
//        // Create student objects
//        Student s1 = new Student(1, 20, 20, 20);
//        Student s2 = new Student(2, 22, 24, 26);
//        Student s3 = new Student(3, 24, 22, 28);
//
//        // Assume the maximum possible marks for each subject is 100
//        int maxMarksPerSubject = 100;
//        int numberOfSubjects = 3;
//        int maxTotalMarks = maxMarksPerSubject * numberOfSubjects;
//
//        // Calculate total marks and percentage for each student
//        calculateAndPrintPercentage(s1, maxTotalMarks);
//        calculateAndPrintPercentage(s2, maxTotalMarks);
//        calculateAndPrintPercentage(s3, maxTotalMarks);
//    }
//
//    private static void calculateAndPrintPercentage(Student student, int maxTotalMarks) {
//        int totalMarks = student.t + student.m + student.e;
//        double percentage = ((double) totalMarks / maxTotalMarks) * 100;
//        System.out.println("Student ID: " + student.id + ", Total Marks: " + totalMarks + ", Percentage: " + percentage + "%");
//    }
//}
