package curso200344;

import java.util.ArrayList;
import java.util.Collections;

public class Aula01 {
	public static void main (String args[]) {
		String aula01 = "01";
		String aula02 = "04";
		String aula03 = "03";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula01);
		aulas.add(aula02);
		aulas.add(aula03);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("Primeira aula: "+primeiraAula);
		
		for (int i=0; i<aulas.size(); i++) {
			System.out.println("aula: "+ aulas.get(i));
		}
		
		aulas.forEach(aula -> {
			System.out.println(aula);
		});
		
		Collections.sort(aulas);
		System.out.println(aulas);
	}
}
