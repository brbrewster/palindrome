import javax.swing.*;

//uses alert boxes to test to get text input, and 
//test to see if it is a palindrome 
public class PalindromeAlert {
	String strCandidate = new String("");
	
	PalindromeAlert() {
		getCandidate();
		Palindrome pal = new Palindrome(strCandidate);
		
		if (pal.isPalindrome()){
			JOptionPane.showMessageDialog(null, pal.getStrWord2() 
					+ " is a palindrome of " + pal.getStrWord());
		}
		else if (!pal.isPalindrome()) {
			notPalindrome(pal.getStrWord(), pal.getStrWord2());
		}
		else {
			notPalindrome(pal.getStrWord(), pal.getStrWord2());
		}
		
		
	}
	
public void getCandidate(){
	strCandidate = JOptionPane.showInputDialog("Enter a palindrome candidate: ");
}

public void notPalindrome(String word1, String word2 ){
	int intError = JOptionPane.showConfirmDialog(null, "I'm sorry. " + word2 
			+ " is not a palindrome of " + word1 + "\nWould you like to try again?", 
			"Palindrome Error", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
	if (intError == JOptionPane.YES_OPTION){
		PalindromeAlert pal = new PalindromeAlert();
	}
}
	


	public static void main (String[] args){
		PalindromeAlert pal = new PalindromeAlert();	
	}
}
