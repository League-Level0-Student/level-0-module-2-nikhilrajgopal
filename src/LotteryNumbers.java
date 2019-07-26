import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	Random gen=new Random();
	int number=gen.nextInt(50);
	int number2=gen.nextInt(50);
	int number3=gen.nextInt(50);
	int number4=gen.nextInt(50);
	int number5=gen.nextInt(50);
	JOptionPane.showMessageDialog(null, number+" "+number2+" "+number3+" "+number4+" "+number5);
}
}
