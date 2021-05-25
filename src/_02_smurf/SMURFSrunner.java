package _02_smurf;

public class SMURFSrunner {
public static void main(String[] args) {
	Smurf handy = new Smurf ("Handy");
handy.eat();
String B =handy.getName();
System.out.println(B);
Smurf hand = new Smurf ("Papa");
String C =hand.getName();
System.out.println(C);
String A =hand.getHatColor();
System.out.println("I have a " + A + " hat");
String D =hand.isGirlOrBoy();
System.out.println(D);
Smurf han = new Smurf ("Smurfette");
String E =han.getName();
System.out.println(E);
String F =han.getHatColor();
System.out.println("I have a " + F + " hat");
String G =han.isGirlOrBoy();
System.out.println(G);
}
}
