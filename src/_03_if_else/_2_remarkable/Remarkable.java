package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String steve = ("He is the minecraft.");
String donkeyKong = ("He is very good at spiking in smash bros.");
String kermitDaFrog = ("I aM kErMiT da FrOg");
		// 2. Ask the user to enter a name. Store their answer in a variable.
String question = JOptionPane.showInputDialog("say someone.");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (question.equals("steve")) {
	JOptionPane.showMessageDialog(null, steve);
}
if (question.equals("donkey kong")) {
	JOptionPane.showMessageDialog(null, donkeyKong);
}
if (question.equals("kermit da frog")) {
	JOptionPane.showMessageDialog(null, kermitDaFrog);
}
if (question.equals("kermit")) {
	JOptionPane.showMessageDialog(null, kermitDaFrog);
}
	}
}

