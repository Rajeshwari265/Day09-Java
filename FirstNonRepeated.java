package Day6;

public class FirstNonRepeated {

	public static void main(String[] args) {
		String str="aabcbdba";
		for(int i =0;i<str.length();i++) {
			char ch =str.charAt(i);
			if (str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.println("First Non Repeated Character:" +ch);
				break;
			}
		}

	}

}
