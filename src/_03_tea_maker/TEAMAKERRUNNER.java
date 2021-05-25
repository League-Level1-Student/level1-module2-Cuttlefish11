package _03_tea_maker;

import javax.swing.JOptionPane;


public class TEAMAKERRUNNER {
public static void main(String[] args) {
	String F = JOptionPane.showInputDialog ("What flavor of tea do you want?");
	TeaBag TM = new TeaBag (F);
	TM.getFlavor();
	Kettle k = new Kettle ();
	k.getWater();
	k.boil();
	Cup c = new Cup ();
c.makeTea(TM, k.getWater());
}
}
