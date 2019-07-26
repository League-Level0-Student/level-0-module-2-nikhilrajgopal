import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String question1=JOptionPane.showInputDialog("How old are you (in years)?");
	int age= Integer.parseInt(question1) ;
	if(age>17) {
	JOptionPane.showInputDialog("Who should be the next president?");
	}
	else {
		JOptionPane.showMessageDialog(null, "Nobody cares about what you think.");
	}
}
}
