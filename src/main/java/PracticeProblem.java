public class PracticeProblem {
	public static void main(String args[]) {

	}

	//1

	public static int calculate(int a, int b, char value){
		switch(value){
			case '+':
				return a+b;
				
			
			case '-':
				return a-b;
			
				
			case '*':
				return a*b;
				

			case '/':
			if (b == 0) {
				
			}
				return a/b;
			
		
			case '%':
			if (b == 0) {
				
			}
				return a%b;
			
		
			case '^':
				return (int)Math.pow(a,b);
				
			default:
			return (0);
		
		}
		
	}

	//2
	public static boolean totalWordsChecker(String input){
		final int MAXIMUM_VALUE = 10;
		String[] words = input.trim().split(" ");
		return words.length <= MAXIMUM_VALUE;
	}


	//3
	public static String minStrings(String str1, String str2, String str3){
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		str3 = str3.toLowerCase();
		String min = "";
		if (str1.compareTo(str2)<0){
			if (str1.compareTo(str3)<0){
			min = str1;
		}
			else{
			min = str3;
		}
	}
	else if (str2.compareTo(str3)<0){
		min = str2;
		}
			else{
			min = str3;
		}
		return min;
	}
}
