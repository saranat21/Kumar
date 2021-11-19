package polymorphism;

public class PolyOverloadingMethod {
	
	public void overloading(int id)  {
		System.out.println(id);
		
	}
	
	public void overloading(String name) {
		System.out.println(name);
	
	}
	public void overloading(String mailid,long phno) {
		System.out.println(mailid);
		System.out.println(phno);
	}
	public void overloading(long phoneno,String dob) {
		System.out.println(phoneno+" ,"+dob);
	}
	public static void main(String[] args) {
		PolyOverloadingMethod p = new PolyOverloadingMethod();
		p.overloading(123456789);
		p.overloading("Saran kumar");
		p.overloading("saran@yahoo", 9876543210l);
		p.overloading(8754801101l, "18/01/94");
	}
}

