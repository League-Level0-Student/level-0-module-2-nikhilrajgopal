import javax.swing.JOptionPane;

public class SecretMessageBox {
public static void main(String[] args) {
	String password="12345";
	String user=JOptionPane.showInputDialog("Tell me a secret.");
	System.out.println(user);
	String nextuser=JOptionPane.showInputDialog("You can only see the secret if you guess the correct password.");
	if (nextuser.equals(password)) {
		JOptionPane.showMessageDialog(null, user);
	}
	else {
		JOptionPane.showMessageDialog(null, "INTRUDER!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}
}
