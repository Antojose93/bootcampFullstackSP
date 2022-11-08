package pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Chalenge1 {
	
	public static String randomGenerator() {		
		Random random= new Random();
		Integer number = random.nextInt(10);		
		return number.toString();		
	}

	public static String codeMaker(String str) {
		String code="";
		if(str.equalsIgnoreCase("Tipo A")) {
			code="54";
			for(int i=0; i<8 ; i++) {
				code=code+randomGenerator();
			}
			return code;
		}
		if(str.equalsIgnoreCase("Tipo B")) {
			code="08";
			for(int i=0; i<8 ; i++) {
				code=code+randomGenerator();
			}
			return code;
			
		}
		return "Insert a valid Type";
	}
	
	public static boolean seeker(String str , List<String> list) {
		
		for(String s: list) {
			if(s.equalsIgnoreCase(str)) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list  = new ArrayList<String>();
		list.add("carro");
		list.add("perro");
		list.add("marinero");
		list.add("camion");
		list.add("juez");
		list.add("tanque");
		list.add("silla");
		list.add("caminar");
		list.add("oso");
		list.add("silvar");
		list.add("sopa");
		list.add("juego");
		list.add("pinocho");
		list.add("daniela");
		list.add("sofy");
		list.add("anto");
		

		System.out.println(seeker("yo", list));
		
		System.out.println(codeMaker("tipo b"));

	}

}
