package InterviewQuestion;

import java.util.HashSet;

public class FormatingBasedOnRules {
public static void main(String[] args) {
	System.out.println(formatString("we have read many books on Java"));
	}

	public static String formatString(String str) {
		String res = "";
		String[] words = str.split(" ");
		String[] processedWords = new String[words.length];

		for (int i = 0; i < words.length; i++) {
			char firstChar = words[i].charAt(0);
			char lastChar = words[i].charAt(words[i].length() - 1);
			String mid = words[i].substring(1, words[i].length() - 1);
			HashSet<Character> midChars = new HashSet<Character>();
			for (int j = 0; j < mid.length(); j++) {
				midChars.add(mid.charAt(j));
			}
			processedWords[i] = "" + firstChar + midChars.size() + lastChar;
		}

		
		for (int i = 0; i < processedWords.length; i++) {
			res += processedWords[i] + " ";
		}
		return res;
}
}
