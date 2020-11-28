
public class Assignment3 {

	public static void main(String[] args) {

		String string1 = "abc";
		String string2 = new String("abc");
		
		if (string1 == string2) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
		
		if (string1.equals(string2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}

	}

}
