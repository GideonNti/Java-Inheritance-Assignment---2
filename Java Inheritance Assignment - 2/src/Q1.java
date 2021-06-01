
	class Author {
	private String name;
	private String email;
	private char gender;
	
	
	public Author(String n, String e, char g) {
		name = n;
		email = e;
		gender = g;
		
	}
	 public String getName() {
		 return name;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
	      this.email = email;
	   }
	 public char getGender() {
		 return gender;
	 }
	 public String toString() {
		 return name+" ("+gender+") at "+email;
	 }
	}
	 public class Q1{
	public static void main(String[] args) {
		Author obj = new Author("Gideon Nti","gidiboateng200@gmail.com",'m');
		System.out.println(obj);
		
		
		
		

	}

}
