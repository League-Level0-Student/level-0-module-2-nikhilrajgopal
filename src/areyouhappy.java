import javax.swing.JOptionPane;

public class areyouhappy {
	public static void main(String[] args) {
		String questionOne = JOptionPane.showInputDialog("Are you happy?");
		if (questionOne.equals("yes"))

		{
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
		if (questionOne.equals("no"))

		{
			String questionTwo = JOptionPane.showInputDialog("Do you want to be happy?");
			if (questionTwo.equals("yes"))

			{
				JOptionPane.showMessageDialog(null,("Change Something"));
			}
			if (questionTwo.equals("no"))

			{

				JOptionPane.showMessageDialog(null,("Keep doing whatever you're doing"));
			}

		}
	}
}
