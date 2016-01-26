import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PalindromeWindow extends JFrame implements ActionListener {
	
	private JLabel lblInput = new JLabel("Enter candidate: ");
	private JLabel lblOutput = new JLabel("Results: ");
	private JTextField txtInput = new JTextField("", 15);
	private JTextField txtOutput = new JTextField("", 20);
	private JButton btnTest = new JButton("Test");
	private JButton btnClear = new JButton("Clear");
	
	public PalindromeWindow() {
		super("Is this word a palindrome?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		setLayout( new FlowLayout() );
		
		btnTest.addActionListener(this);
		btnClear.addActionListener(this);
		
		add(lblInput);
		add(txtInput);
		add(lblOutput);
		add(txtOutput);
		add(btnTest);
		add(btnClear);
		
		txtOutput.setEditable(false);
		setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent evt){
		Object objSource = evt.getSource();
		
		if (objSource == btnTest){
			testCandidate();
		} else {
			clearText();
		}
		
	}
	
	
	private void testCandidate(){
		Palindrome pal = new Palindrome (txtInput.getText());
		
		if (pal.getStrWord2().isEmpty()) {
			txtOutput.setText("Please enter a value.");			
		} else {
			if (pal.isPalindrome()){
				txtOutput.setText(pal.getStrWord2() + " is a palindrome of " + pal.getStrWord());
			} else {
				txtOutput.setText(pal.getStrWord2() + " is not a palindrome of " + pal.getStrWord());
			}
		}	
	}
		
	
	private void clearText(){
		txtInput.setText("");
		txtOutput.setText("");
	}
	
	public static void main(String[] args){
		PalindromeWindow palwin = new PalindromeWindow();
	}

}
