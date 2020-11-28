
public class Assignment6 {

	public static void main(String[] args) {

		String string1 = "Hello My Name is Java";
		
		int idx = string1.indexOf('N');
		
		String newString = string1.substring(0, idx);
		System.out.println(newString.lastIndexOf(' '));
		

	}

}
