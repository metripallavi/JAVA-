
class Student {
	
	// Data declaration>
	
	String fname;
	String pname; 
	String imm; 
	String mobile;
	int semester;
		
	//////////////////////
	// Methods
	
	
	public double writeExam() {
		
		double grade=2.3;
		
		
		System.out.println("I am writing my exam");
		
		return grade;
		
	}	
	
}  // end class

//////////////////////////////////////////////////

class StudentTest {
	
	
	public static void main(String [] args) {

		
		Student one = new Student( );
	
		System.out.println( one );
		
		one.writeExam();
		
		one.fname="Sirir";
		
		System.out.println(one.fname);
		
		

	}
}
