import javax.swing.JOptionPane;

public class SecretMessageBox {
public static void main(String[] args) {
	String password="12345";
	String user=JOptionPane.showInputDialog("Tell me a secret.");
	System.out.println(user);
}
}
