import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String Today="07/24";
	String user=JOptionPane.showInputDialog("When is your birthday? Ex:00/00");
	if (Today.equals(user)) {
		JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY!!!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Merry UNbirthday");
	}
}
}
