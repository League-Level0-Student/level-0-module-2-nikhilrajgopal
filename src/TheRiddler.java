import javax.swing.JOptionPane;

public class TheRiddler {
public static void main(String[] args) {
	int score = 0;
	String riddle1= "a stamp";
	String user=JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
	if (user.equalsIgnoreCase(riddle1)) { 
		JOptionPane.showMessageDialog(null, "CORRECT");
		score++;
		System.out.println(score);
	}
	else {
		JOptionPane.showMessageDialog(null, "Wrong! The correct answer is a stamp.");
		
	}
	String riddle2= "a candle";
	String user2=JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
	if (user2.equalsIgnoreCase(riddle2)) {
		JOptionPane.showMessageDialog(null,"CORRECT");
		score++;
		System.out.println(score);
	}
	else {
		JOptionPane.showMessageDialog(null, "Wrong! The correct answer is a candle.");
	}
	String riddle3="a clock";
	String user3=JOptionPane.showInputDialog("What has hands but can not clap?");
	if (user3.equalsIgnoreCase(riddle3)) {
		JOptionPane.showMessageDialog(null, "CORRECT");
		score++;
		System.out.println(score);
	}
	else {
		JOptionPane.showMessageDialog(null,"Wrong! The correct answer is a clock.");
	}
	String riddle4="a coin";
	String user4=JOptionPane.showInputDialog("What has a head and a tail, but no body?");
	if(user4.equalsIgnoreCase(riddle4)) {
		JOptionPane.showMessageDialog(null, "CORRECT");
		score++;
		System.out.println(score);
	}
	else {
		JOptionPane.showMessageDialog(null, "Wrong! The correct answer is a coin.");
	}
}
}
