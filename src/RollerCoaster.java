import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
String questionOne=JOptionPane.showInputDialog("What is your height in inches?");
int number= Integer.parseInt(questionOne) ;
if(number>48)
	
{
	JOptionPane.showMessageDialog(null, "You can go on the roller coaster!");
}
else
{
	JOptionPane.showMessageDialog(null, "You need to grow more before you ride.");
}
}
}
