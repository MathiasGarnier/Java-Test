package org.mathiasGarnier.Apprentissage;

public class Main {

    public static void main(String[] args) {
		
	JObject o = new JObject("Hey");
	JObject o1 = new JObject("Yo");
	
	StringBuilder strB = new StringBuilder();
	
	strB.append("Nom : ").append(o.getName());
	
	String s = strB.substring(strB.length() - (2), strB.length() - 1);
	
	System.out.println(s.toString());
    }
}
