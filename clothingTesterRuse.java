

public class clothingTesterRuse {

	public static void main(String[] args) {
		// Test super class only
		clothing suit = new clothing();
		clothing jersey = new clothing("medium", "blue");
		System.out.println("clothing 1:" + suit);
		System.out.println("clothing 2:" + jersey);
		System.out.println();
		// Test shirt class
		clothing blueShirt = new shirt("medium", "blue"); // sets size to null since not S, M, L or XL
		shirt pinkShirt = new shirt("Short Sleeves"); // shirt class has one field called style 
		pinkShirt.setColor("Pink");
		pinkShirt.setSize("M");
		System.out.println("blueShirt " + blueShirt);		
		System.out.println("pinkShirt " + pinkShirt);
		System.out.println();
		// Test pants class
		pants blackPants = new pants();
		blackPants.setColor("Black");
		blackPants.setSize("M");
		System.out.println("blackPants " + blackPants);
		System.out.println();
		// Test sock class
		clothing purpleSocks = new socks("9-10", "Purple"); // socks has field pair, boolean default true in this constructor
		socks greenSock = new socks("7-8", "Green" ,false);
		System.out.println("purpleSocks " + purpleSocks);
		System.out.println("greenSock " + greenSock);
	}
}
