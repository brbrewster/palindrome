



public class Palindrome {
	private static int numArgs = 10;
	private String strWord = "";
	private String strWord2 = "";
	private StringBuilder sbWord = new StringBuilder("");

	
	public Palindrome(String w) {
		
		strWord = w;
		
	}	
	
	/*
	* Uses the string that passed to the Palindrome constructor to create
	* a second string builder object, and then uses the StringBuilder.reverse()
	* method to reverse the character order. 
	* This does not add any new functionality. The only purpose of this method 
	* is to show another way to reverse the order of the characters in the string 
	* that was used to create the Palindrome object.
	*/
	public void sbReverse(){	
		for (int i = (strWord.length() -1 ); i >= 0; i--) {
			sbWord.append(strWord.charAt(i));
			strWord2 = sbWord.toString();
		}
	}
	
	
	/*
	 * Compares the values of strWord and strWord2 and returns true if they match.
	 * Each string is converted to lower case using the String.toLowerCase method
	 * to prevent differences character case from causing a false value to be 
	 * returned.   
	 */
	public boolean isPalindrome() {
		boolean isPal = false;
		String strPalTest1 = new String(strWord);
		String strPalTest2 = new String(strWord2);
		
		if (strPalTest1.toLowerCase().equals(strPalTest2.toLowerCase())) {
			isPal = true;
		}
		
		return isPal;
	}

	
	//Create getters for class variables.
	
	public String getStrWord(){
		return strWord;
	}
	
	public String getStrWord2(){
		return strWord2;
	}
	
	public StringBuilder getSBWord(){
		return sbWord;
	}
	
	public static int getNumArgs(){
		return numArgs;
	}

	
	private static void help() {
		
		System.out.println("Single candidate Usage: java Palindrome candidate");
		System.out.println("Multiple candidate Usage: java Palindrome candidate candidate candidate");
		System.out.println("The Palindrome command line application can test up to " + getNumArgs()   
				+ " space delimited words to see if they are palindromes.\n");
	}
	
	public static void main(String[] args){
		
		int numArgs = getNumArgs();
		
		/*
		 * If no arguments are passed via command line, or if help is called via -h 
		 * or --help display a help message.
		 * If the number of arguments passed via command line is greater than the value
		 * stored in the private numArgs variable
		*/
		if (args.length < 1 || args[0].equals("-h")|| args[0].equals("--help") ){
			help();
			System.exit(0);
			
		}	else if (args.length > numArgs) {
			System.out.println("Error: You have entered too many palindrome candidates.");
			help();
			System.exit(-1);
		}
		
		
		for (int i = 0; i < args.length; i++){
		
			Palindrome pal = new Palindrome(args[i]);
			if (pal.isPalindrome()){
				System.out.println(pal.strWord2 + " is a palindrome.");			
			} else {
				System.out.println(pal.strWord + " is not a palindrome.");
			}
			
		}	
	}
	
}
