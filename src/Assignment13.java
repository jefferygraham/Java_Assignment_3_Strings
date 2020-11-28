
public class Assignment13 {

	public static void main(String[] args) {

		String string1 = "angel";
		String string2 = "glewn";
		
		for (int i = 0; i < string1.length(); i++) {
			char ltr = string1.charAt(i);
			if (string2.contains(Character.toString(ltr))) {
				continue;
			} else {
				System.out.println("false");
				break;
			}
		}
		 
		System.out.println("true");
	}

}
