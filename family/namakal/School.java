package namakal;

public class School {
	
	String name;
	int rollNo;

	public School(String name, int rollNo) {
		// TODO Auto-generated constructor stub
		System.out.println("How are you");
		this.name=name;
		this.rollNo=rollNo;
	}
//constructor overloding
	public School(String fname, String lname, int rollNo) {
		// TODO Auto-generated constructor stub
		this.name=fname+lname;
		this.rollNo=rollNo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School Student1= new School("Bharani", 100);
		School Student2= new School("Santhiya", 101);
		School Student3= new School("Harish", 102);
		School Student4= new School("kalai","arasan", 103);
	//	System.out.println(Student1.name);
	//	System.out.println(Student2.name);
	//	System.out.println(Student1.rollNo);
	//	System.out.println(Student2.roolNo);
		Student1.participate(); 
		Student2.write_exam();
		Student4.participate();
	}
	private void write_exam() {
	    // TODO Auto-generated method stub
	    System.out.println(name);
	    
	  }

	  private void participate() {
	    // TODO Auto-generated method stub
	    System.out.println(name);
	    
	  }

}
