import javax.swing.JOptionPane;

public class TheRiddler {
public static void main(String[] args) {
	int score = 0;
	String riddle1= "a stamp";
	String user=JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
	if (user.equals(riddle1)) { 
		JOptionPane.showMessageDialog(null, "CORRECT");
		score++;
	}
}
}
