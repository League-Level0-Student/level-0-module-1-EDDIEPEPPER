package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String birthday = JOptionPane.showInputDialog("When is your birthday?");
	if (birthday.equals("april 1")){
		JOptionPane.showMessageDialog(null, "happy birthday!");
	}else {
		JOptionPane.showMessageDialog(null, "happy unbirthday!");
	}
}
}
