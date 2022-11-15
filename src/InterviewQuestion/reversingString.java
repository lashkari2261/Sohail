package InterviewQuestion;

public class reversingString {
public static void main(String[] args) {
	// Reverse given String
			String str = "this is a sample text";

			System.out.println("input =\t\t" + str);
			System.out.println("reverse1 =\t" + revString1(str));
			System.out.println("reverse2 =\t" + revString2(str));
			System.out.println("reverse3 =\t" + revString3(str));

		}

		public static String revString1(String str) {
			StringBuilder sb = new StringBuilder(str);
			return String.valueOf(sb.reverse());
		}

		public static String revString2(String str) {
			String res = "";
			for (int i = 0; i < str.length(); i++) {
				res = str.charAt(i) + res;
			}
			return res;
		}

		public static String revString3(String str) {
			String res = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				res += str.charAt(i);
			}
			return res;
	
	
}
}
