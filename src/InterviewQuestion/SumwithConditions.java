package InterviewQuestion;

public class SumwithConditions {
public static void main(String[] args) {

		System.out.println("freedomSum(5, 5, 5) = " + freedomSum(5, 5, 5));
		System.out.println("freedomSum(5, 10, 5) = " + freedomSum(5, 10, 5));
		System.out.println("freedomSum(10, 5, 5) = " + freedomSum(10, 5, 5));
		System.out.println("freedomSum(5, 5, 10) = " + freedomSum(5, 5, 10));

	}

	public static int freedomSum(int a, int b, int c) {
		if (a == 10) {
			return 0;
		} else if (b == 10) {
			return a;
		} else if (c == 10) {
			return a + b;
		} else {
			return a + b + c;
		}
}
}
