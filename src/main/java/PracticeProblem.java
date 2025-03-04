public class PracticeProblem {
final static int MAXIMUM = 10;

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
		int count = 0;
		if (input == null) {
            return false; 
		}
		else {
		String regex = "[^a-zA-Z'_]";
		String[] words = input.trim().split(regex);
		
		for (int i = 0; i < words.length; i++){
			if (words[i].length() > 0){ // If there is a letter in the (). Eg. (a)
				count++;
			}
		}
	}
	return count<=MAXIMUM;	
}


	//3
	public static String minString(String str1, String str2, String str3){
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		str3 = str3.toLowerCase();
		String min = str1;
		if (str2.compareTo(min)<0){
			min = str2;
		}
		if (str3.compareTo(min)<0){
			min = str3;
		}	
		return min;
	}
}
